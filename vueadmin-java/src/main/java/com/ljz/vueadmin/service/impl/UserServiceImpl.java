package com.ljz.vueadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljz.vueadmin.common.SystemContants;
import com.ljz.vueadmin.mapper.UserMapper;
import com.ljz.vueadmin.pojo.User;
import com.ljz.vueadmin.service.UserService;
import com.ljz.vueadmin.utils.JwtTokenUtil;
import com.ljz.vueadmin.vo.RespBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Resource
    private UserDetailsService userDetailsService;
    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private UserMapper userMapper;

    @Override
    public RespBean login(String username, String password, String code, HttpServletRequest request) {
        String kaptcha = (String) request.getSession().getAttribute(SystemContants.CAPTCHA_NAME);
        if (StringUtils.isEmpty(code) || !kaptcha.equalsIgnoreCase(code)) {
            return RespBean.error("验证码输入错误，请重新输入！");
        }
        // 登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (userDetails == null || passwordEncoder.matches(password, userDetails.getPassword())) {
            return RespBean.error("用户名或密码不正确!");
        }
        // 更新security登录用户
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        // 生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        //tokenMap.put("tokenHead", tokenHead);
        return RespBean.success("登录成功", tokenMap);
    }

    @Override
    public User getAdminByUserName(String username) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("user_name", username));
    }
}


package com.ljz.vueadmin.controller;

import com.ljz.vueadmin.pojo.User;
import com.ljz.vueadmin.service.UserService;
import com.ljz.vueadmin.vo.RespBean;
import com.ljz.vueadmin.vo.UserLoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @ClassName : LoginController
 * @Description :
 * @Author : ljz
 * @Date: 2022/3/6  13:03
 */
@RestController
@Api(tags = "登录控制类")
public class LoginController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody UserLoginParam userLoginParam, HttpServletRequest request) {
        return userService.login(userLoginParam.getUsername(),
                userLoginParam.getPassword(),
                userLoginParam.getCode(),
                request);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping("/user/info")
    public User getAdminInfo(Principal principal){
        if(principal == null) {
            return null;
        }
        String username = principal.getName();
        User user = userService.getAdminByUserName(username);
        user.setPassword(null);
        return user;
    }

    @ApiOperation(value = "注销登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功!");
    }
}

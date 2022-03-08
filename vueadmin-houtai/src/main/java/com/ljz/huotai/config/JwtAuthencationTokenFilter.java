package com.ljz.huotai.config;

import com.ljz.huotai.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName : JwtAuthencationTokenFilter
 * @Description :
 * @Author : ljz
 * @Date: 2022/3/6  11:39
 */

public class JwtAuthencationTokenFilter extends OncePerRequestFilter {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Resource
    private UserDetailsService userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 从请求中获取 jwt token
        String requestHeaderToken = request.getHeader(tokenHeader);
        // 如果请求中存在token
        //  && requestHeaderToken.startsWith(tokenHead)
        if(requestHeaderToken != null) {
            // 获取token
            // String authToken = requestHeaderToken.substring(tokenHead.length());
            String username = jwtTokenUtil.getUserNameFromToken(requestHeaderToken);
            //token存在用户名但未登录
            if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                //验证token是否有效，重新设置用户对象
                if(jwtTokenUtil.validateToken(requestHeaderToken, userDetails)){
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                }
            }
        }

        filterChain.doFilter(request, response);
    }
}

package com.ljz.huotai.controller;

import com.ljz.huotai.pojo.User;
import com.ljz.huotai.service.UserService;
import com.ljz.huotai.vo.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户控制类")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("查询所有用户信息分页")
    @GetMapping("/")
    public RespBean getUsersInfoByPage(@RequestParam(defaultValue = "1") Integer currentPage,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       User user,
                                       Date[] dataScope){
        return userService.getUsersInfoByPage(currentPage, pageSize, user, dataScope);
    }
}

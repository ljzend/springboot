package com.ljz.vueadmin.controller;


import com.ljz.vueadmin.mapper.MenuMapper;
import com.ljz.vueadmin.service.MenuService;
import com.ljz.vueadmin.vo.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 菜单权限表 前端控制器
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Api(tags = "菜单控制类")
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    @ApiOperation(value = "根据登录用户id获取菜单")
    @GetMapping("/")
    public RespBean getMenusByUserId(){
        return menuService.getMenusByUserId();
    }

}


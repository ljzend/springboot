package com.ljz.huotai.controller;


import com.ljz.huotai.mapper.MenuMapper;
import com.ljz.huotai.service.MenuService;
import com.ljz.huotai.vo.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@RestController
@RequestMapping("/menu")
@Api(tags = "菜单控制类")
public class MenuController {
    @Resource
    private MenuService menuService;

    @ApiOperation(value = "根据登录id查询改用户具有的菜单")
    @GetMapping("/")
    public RespBean getMenuByUserId(){
        return menuService.getMenuByUserId();
    }


}

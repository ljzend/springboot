package com.ljz.vueadmin.service.impl;

import com.ljz.vueadmin.pojo.Menu;
import com.ljz.vueadmin.mapper.MenuMapper;
import com.ljz.vueadmin.pojo.User;
import com.ljz.vueadmin.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljz.vueadmin.vo.RespBean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public RespBean getMenusByUserId() {
        Long userId = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId();
        return menuMapper.getMenusByUserId(userId);
    }
}

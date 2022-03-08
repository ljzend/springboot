package com.ljz.huotai.service.impl;

import com.ljz.huotai.pojo.Menu;
import com.ljz.huotai.mapper.MenuMapper;
import com.ljz.huotai.pojo.User;
import com.ljz.huotai.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljz.huotai.vo.RespBean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public RespBean getMenuByUserId() {
        Long id = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        List<Menu> menus =  menuMapper.getMenuByUserId(id);
            return RespBean.success(menus);
    }
}

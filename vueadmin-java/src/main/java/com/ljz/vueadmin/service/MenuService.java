package com.ljz.vueadmin.service;

import com.ljz.vueadmin.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ljz.vueadmin.vo.RespBean;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
public interface MenuService extends IService<Menu> {

    /**
     * Gets menus by user id.
     * 根据登录用户id获取菜单
     * @return the menus by user id
     */
    RespBean getMenusByUserId();
}

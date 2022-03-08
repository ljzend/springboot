package com.ljz.huotai.service;

import com.ljz.huotai.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ljz.huotai.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
public interface MenuService extends IService<Menu> {

    /**
     * Gets menu by user id.
     * 根据登录id查询改用户具有的菜单
     * @return the menu by user id
     */
    RespBean getMenuByUserId();
}

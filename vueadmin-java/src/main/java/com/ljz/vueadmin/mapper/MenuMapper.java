package com.ljz.vueadmin.mapper;

import com.ljz.vueadmin.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljz.vueadmin.vo.RespBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜单权限表 Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {


    /**
     * Gets menus by user id.
     * 根据登录用户id获取菜单
     * @param userId the user id
     * @return the menus by user id
     */
    RespBean getMenusByUserId(Long userId);
}

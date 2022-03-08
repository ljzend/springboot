package com.ljz.vueadmin.mapper;

import com.ljz.vueadmin.pojo.RoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

}

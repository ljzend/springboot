package com.ljz.vueadmin.mapper;

import com.ljz.vueadmin.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

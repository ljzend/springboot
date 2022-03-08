package com.ljz.huotai.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ljz.huotai.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


    /**
     * Gets users info by page.
     * 根据用户名获取用户信息
     * @param page      the page
     * @param user      the user
     * @param dataScope the data scope
     * @return the users info by page
     */
    IPage<User> getUsersInfoByPage(Page<Object> page, @Param("user") User user, @Param("dataScope") Date[] dataScope);
}

package com.ljz.vueadmin.mapper;

import com.ljz.vueadmin.pojo.UserPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户与岗位关联表 Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Mapper
public interface UserPostMapper extends BaseMapper<UserPost> {

}

package com.ljz.vueadmin.service.impl;

import com.ljz.vueadmin.pojo.UserPost;
import com.ljz.vueadmin.mapper.UserPostMapper;
import com.ljz.vueadmin.service.UserPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与岗位关联表 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class UserPostServiceImpl extends ServiceImpl<UserPostMapper, UserPost> implements UserPostService {

}

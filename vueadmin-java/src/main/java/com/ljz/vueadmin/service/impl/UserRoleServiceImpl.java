package com.ljz.vueadmin.service.impl;

import com.ljz.vueadmin.pojo.UserRole;
import com.ljz.vueadmin.mapper.UserRoleMapper;
import com.ljz.vueadmin.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

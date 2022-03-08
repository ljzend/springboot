package com.ljz.vueadmin.service.impl;

import com.ljz.vueadmin.pojo.Post;
import com.ljz.vueadmin.mapper.PostMapper;
import com.ljz.vueadmin.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 岗位信息表 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}

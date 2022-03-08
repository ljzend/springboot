package com.ljz.vueadmin.service.impl;

import com.ljz.vueadmin.pojo.OperLog;
import com.ljz.vueadmin.mapper.OperLogMapper;
import com.ljz.vueadmin.service.OperLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Service
public class OperLogServiceImpl extends ServiceImpl<OperLogMapper, OperLog> implements OperLogService {

}

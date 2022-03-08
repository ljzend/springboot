package com.ljz.vueadmin.mapper;

import com.ljz.vueadmin.pojo.OperLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 操作日志记录 Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Mapper
public interface OperLogMapper extends BaseMapper<OperLog> {

}

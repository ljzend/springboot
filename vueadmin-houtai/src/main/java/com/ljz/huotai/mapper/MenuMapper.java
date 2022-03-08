package com.ljz.huotai.mapper;

import com.ljz.huotai.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljz.huotai.vo.RespBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * Gets menu by user id.
     * 根据登录id查询改用户具有的菜单
     * @param id the id
     * @return the menu by user id
     */
    List<Menu> getMenuByUserId(Long id);

    
}

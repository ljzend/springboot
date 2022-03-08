package com.ljz.huotai.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljz
 * @since 2022-03-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_menu")
@ApiModel(value="RoleMenu对象", description="")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("role_id")
    private Long roleId;

    @TableField("menu_id")
    private Long menuId;


}

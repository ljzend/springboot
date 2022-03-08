package com.ljz.vueadmin.pojo;

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
 * 角色和菜单关联表
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_menu")
@ApiModel(value="RoleMenu对象", description="角色和菜单关联表")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
      @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;

    @ApiModelProperty(value = "菜单ID")
    @TableField("menu_id")
    private Long menuId;


}

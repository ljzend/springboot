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
 * 角色和部门关联表
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_dept")
@ApiModel(value="RoleDept对象", description="角色和部门关联表")
public class RoleDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
      @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;

    @ApiModelProperty(value = "部门ID")
    @TableField("dept_id")
    private Long deptId;


}

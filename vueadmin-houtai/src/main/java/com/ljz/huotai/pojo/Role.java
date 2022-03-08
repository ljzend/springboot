package com.ljz.huotai.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
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
@TableName("sys_role")
@ApiModel(value="Role对象", description="")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("code")
    private String code;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @TableField(value = "created", fill = FieldFill.INSERT)
    private Date created;

    @TableField(value = "updated", fill = FieldFill.INSERT_UPDATE)
    private Date updated;

    @TableField("statu")
    private Integer statu;


}

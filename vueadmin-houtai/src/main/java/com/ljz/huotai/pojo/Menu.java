package com.ljz.huotai.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

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
@TableName("sys_menu")
@ApiModel(value="Menu对象", description="")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "父菜单ID，一级菜单为0")
    @TableField("parent_id")
    private Long parentId;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "菜单URL")
    @TableField("path")
    private String path;

    @ApiModelProperty(value = "授权(多个用逗号分隔，如：user:list,user:create)")
    @TableField("perms")
    private String perms;

    @TableField("component")
    private String component;

    @ApiModelProperty(value = "类型     0：目录   1：菜单   2：按钮")
    @TableField("type")
    private Integer type;

    @ApiModelProperty(value = "菜单图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty(value = "排序")
    @TableField("orderNum")
    private Integer ordernum;

    @TableField(value = "created", fill = FieldFill.INSERT)
    private Date created;

    @TableField(value = "updated", fill = FieldFill.INSERT_UPDATE)
    private Date updated;

    @TableField("statu")
    private Integer statu;

    @ApiModelProperty(value = "子菜单" )
    @TableField(exist = false)
    private List<Menu> children;


}

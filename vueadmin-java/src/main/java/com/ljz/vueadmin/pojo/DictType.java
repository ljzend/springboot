package com.ljz.vueadmin.pojo;

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
 * 字典类型表
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_dict_type")
@ApiModel(value="DictType对象", description="字典类型表")
public class DictType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "字典主键")
      @TableId(value = "dict_id", type = IdType.AUTO)
    private Long dictId;

    @ApiModelProperty(value = "字典名称")
    @TableField("dict_name")
    private String dictName;

    @ApiModelProperty(value = "字典类型")
    @TableField("dict_type")
    private String dictType;

    @ApiModelProperty(value = "状态（0正常 1停用）")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "创建者")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
      @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新者")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
      @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}

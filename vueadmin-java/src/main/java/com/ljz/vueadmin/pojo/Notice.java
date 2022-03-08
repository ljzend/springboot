package com.ljz.vueadmin.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 通知公告表
 * </p>
 *
 * @author ljz
 * @since 2022-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_notice")
@ApiModel(value="Notice对象", description="通知公告表")
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公告ID")
      @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;

    @ApiModelProperty(value = "公告标题")
    @TableField("notice_title")
    private String noticeTitle;

    @ApiModelProperty(value = "公告类型（1通知 2公告）")
    @TableField("notice_type")
    private String noticeType;

    @ApiModelProperty(value = "公告内容")
    @TableField("notice_content")
    private Blob noticeContent;

    @ApiModelProperty(value = "公告状态（0正常 1关闭）")
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

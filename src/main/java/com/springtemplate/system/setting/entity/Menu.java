package com.springtemplate.system.setting.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 *
 * </p>
 *
 * @author QiuPing
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Menu对象", description = "")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@ApiModelProperty(value = "创建日期")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private LocalDateTime createTime;

	@ApiModelProperty(value = "是否外链")
	private Boolean iFrame;

	@ApiModelProperty(value = "菜单名称")
	private String name;

	@ApiModelProperty(value = "组件")
	private String component;

	@ApiModelProperty(value = "上级菜单ID")
	private Long pid;

	@ApiModelProperty(value = "排序")
	private Long sort;

	@ApiModelProperty(value = "图标")
	private String icon;

	@ApiModelProperty(value = "链接地址")
	private String path;


}

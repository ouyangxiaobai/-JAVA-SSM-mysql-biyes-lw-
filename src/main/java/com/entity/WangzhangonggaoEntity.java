package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 网站公告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("wangzhangonggao")
public class WangzhangonggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WangzhangonggaoEntity() {
		
	}
	
	public WangzhangonggaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公告编号
	 */
					
	private String gonggaobianhao;
	
	/**
	 * 公告信息
	 */
					
	private String gonggaoxinxi;
	
	/**
	 * 公告内容
	 */
					
	private String gonggaoneirong;
	
	/**
	 * 公告图片
	 */
					
	private String gonggaotupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公告编号
	 */
	public void setGonggaobianhao(String gonggaobianhao) {
		this.gonggaobianhao = gonggaobianhao;
	}
	/**
	 * 获取：公告编号
	 */
	public String getGonggaobianhao() {
		return gonggaobianhao;
	}
	/**
	 * 设置：公告信息
	 */
	public void setGonggaoxinxi(String gonggaoxinxi) {
		this.gonggaoxinxi = gonggaoxinxi;
	}
	/**
	 * 获取：公告信息
	 */
	public String getGonggaoxinxi() {
		return gonggaoxinxi;
	}
	/**
	 * 设置：公告内容
	 */
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
	}
	/**
	 * 设置：公告图片
	 */
	public void setGonggaotupian(String gonggaotupian) {
		this.gonggaotupian = gonggaotupian;
	}
	/**
	 * 获取：公告图片
	 */
	public String getGonggaotupian() {
		return gonggaotupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}

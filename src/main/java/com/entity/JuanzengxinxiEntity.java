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
 * 捐赠信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("juanzengxinxi")
public class JuanzengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JuanzengxinxiEntity() {
		
	}
	
	public JuanzengxinxiEntity(T t) {
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
	 * 信息编码
	 */
					
	private String xinxibianma;
	
	/**
	 * 活动目的
	 */
					
	private String huodongmude;
	
	/**
	 * 捐助对象
	 */
					
	private String juanzhuduixiang;
	
	/**
	 * 捐助物品
	 */
					
	private String juanzhuwupin;
	
	/**
	 * 爱心值
	 */
					
	private Integer aixinzhi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 捐助时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date juanzhushijian;
	
	
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
	 * 设置：信息编码
	 */
	public void setXinxibianma(String xinxibianma) {
		this.xinxibianma = xinxibianma;
	}
	/**
	 * 获取：信息编码
	 */
	public String getXinxibianma() {
		return xinxibianma;
	}
	/**
	 * 设置：活动目的
	 */
	public void setHuodongmude(String huodongmude) {
		this.huodongmude = huodongmude;
	}
	/**
	 * 获取：活动目的
	 */
	public String getHuodongmude() {
		return huodongmude;
	}
	/**
	 * 设置：捐助对象
	 */
	public void setJuanzhuduixiang(String juanzhuduixiang) {
		this.juanzhuduixiang = juanzhuduixiang;
	}
	/**
	 * 获取：捐助对象
	 */
	public String getJuanzhuduixiang() {
		return juanzhuduixiang;
	}
	/**
	 * 设置：捐助物品
	 */
	public void setJuanzhuwupin(String juanzhuwupin) {
		this.juanzhuwupin = juanzhuwupin;
	}
	/**
	 * 获取：捐助物品
	 */
	public String getJuanzhuwupin() {
		return juanzhuwupin;
	}
	/**
	 * 设置：爱心值
	 */
	public void setAixinzhi(Integer aixinzhi) {
		this.aixinzhi = aixinzhi;
	}
	/**
	 * 获取：爱心值
	 */
	public Integer getAixinzhi() {
		return aixinzhi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：捐助时间
	 */
	public void setJuanzhushijian(Date juanzhushijian) {
		this.juanzhushijian = juanzhushijian;
	}
	/**
	 * 获取：捐助时间
	 */
	public Date getJuanzhushijian() {
		return juanzhushijian;
	}

}

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
 * 物品回收
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("wupinhuishou")
public class WupinhuishouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WupinhuishouEntity() {
		
	}
	
	public WupinhuishouEntity(T t) {
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
	 * 物品编号
	 */
					
	private String wupinbianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 捐赠人
	 */
					
	private String juanzengren;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 使用年限
	 */
					
	private String shiyongnianxian;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 捐赠方式
	 */
					
	private String juanzengfangshi;
	
	/**
	 * 爱心值
	 */
					
	private String aixinzhi;
	
	
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
	 * 设置：物品编号
	 */
	public void setWupinbianhao(String wupinbianhao) {
		this.wupinbianhao = wupinbianhao;
	}
	/**
	 * 获取：物品编号
	 */
	public String getWupinbianhao() {
		return wupinbianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：捐赠人
	 */
	public void setJuanzengren(String juanzengren) {
		this.juanzengren = juanzengren;
	}
	/**
	 * 获取：捐赠人
	 */
	public String getJuanzengren() {
		return juanzengren;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：使用年限
	 */
	public void setShiyongnianxian(String shiyongnianxian) {
		this.shiyongnianxian = shiyongnianxian;
	}
	/**
	 * 获取：使用年限
	 */
	public String getShiyongnianxian() {
		return shiyongnianxian;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：捐赠方式
	 */
	public void setJuanzengfangshi(String juanzengfangshi) {
		this.juanzengfangshi = juanzengfangshi;
	}
	/**
	 * 获取：捐赠方式
	 */
	public String getJuanzengfangshi() {
		return juanzengfangshi;
	}
	/**
	 * 设置：爱心值
	 */
	public void setAixinzhi(String aixinzhi) {
		this.aixinzhi = aixinzhi;
	}
	/**
	 * 获取：爱心值
	 */
	public String getAixinzhi() {
		return aixinzhi;
	}

}

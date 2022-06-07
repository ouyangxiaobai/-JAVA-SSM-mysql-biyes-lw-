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
 * 捐款信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("juankuanxinxi")
public class JuankuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JuankuanxinxiEntity() {
		
	}
	
	public JuankuanxinxiEntity(T t) {
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
	 * 捐款编号
	 */
					
	private String juankuanbianhao;
	
	/**
	 * 捐款金额
	 */
					
	private Integer juankuanjine;
	
	/**
	 * 爱心值
	 */
					
	private String aixinzhi;
	
	/**
	 * 收款对象
	 */
					
	private String shoukuanduixiang;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证号码
	 */
					
	private String shenfenzhenghaoma;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：捐款编号
	 */
	public void setJuankuanbianhao(String juankuanbianhao) {
		this.juankuanbianhao = juankuanbianhao;
	}
	/**
	 * 获取：捐款编号
	 */
	public String getJuankuanbianhao() {
		return juankuanbianhao;
	}
	/**
	 * 设置：捐款金额
	 */
	public void setJuankuanjine(Integer juankuanjine) {
		this.juankuanjine = juankuanjine;
	}
	/**
	 * 获取：捐款金额
	 */
	public Integer getJuankuanjine() {
		return juankuanjine;
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
	/**
	 * 设置：收款对象
	 */
	public void setShoukuanduixiang(String shoukuanduixiang) {
		this.shoukuanduixiang = shoukuanduixiang;
	}
	/**
	 * 获取：收款对象
	 */
	public String getShoukuanduixiang() {
		return shoukuanduixiang;
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
	 * 设置：身份证号码
	 */
	public void setShenfenzhenghaoma(String shenfenzhenghaoma) {
		this.shenfenzhenghaoma = shenfenzhenghaoma;
	}
	/**
	 * 获取：身份证号码
	 */
	public String getShenfenzhenghaoma() {
		return shenfenzhenghaoma;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
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

}

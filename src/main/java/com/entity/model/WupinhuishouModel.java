package com.entity.model;

import com.entity.WupinhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 物品回收
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public class WupinhuishouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

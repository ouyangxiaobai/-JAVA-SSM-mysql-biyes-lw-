package com.entity.model;

import com.entity.JuanzengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 捐赠信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public class JuanzengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date juanzhushijian;
				
	
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

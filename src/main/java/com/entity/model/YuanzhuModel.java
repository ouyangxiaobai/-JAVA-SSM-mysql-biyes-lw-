package com.entity.model;

import com.entity.YuanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 援助
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public class YuanzhuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 求助信息
	 */
	
	private String qiuzhuxinxi;
		
	/**
	 * 求助人
	 */
	
	private String qiuzhuren;
		
	/**
	 * 援助物品
	 */
	
	private String yuanzhuwupin;
		
	/**
	 * 爱心值
	 */
	
	private String aixinzhi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 援助日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuanzhuriqi;
				
	
	/**
	 * 设置：求助信息
	 */
	 
	public void setQiuzhuxinxi(String qiuzhuxinxi) {
		this.qiuzhuxinxi = qiuzhuxinxi;
	}
	
	/**
	 * 获取：求助信息
	 */
	public String getQiuzhuxinxi() {
		return qiuzhuxinxi;
	}
				
	
	/**
	 * 设置：求助人
	 */
	 
	public void setQiuzhuren(String qiuzhuren) {
		this.qiuzhuren = qiuzhuren;
	}
	
	/**
	 * 获取：求助人
	 */
	public String getQiuzhuren() {
		return qiuzhuren;
	}
				
	
	/**
	 * 设置：援助物品
	 */
	 
	public void setYuanzhuwupin(String yuanzhuwupin) {
		this.yuanzhuwupin = yuanzhuwupin;
	}
	
	/**
	 * 获取：援助物品
	 */
	public String getYuanzhuwupin() {
		return yuanzhuwupin;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：援助日期
	 */
	 
	public void setYuanzhuriqi(Date yuanzhuriqi) {
		this.yuanzhuriqi = yuanzhuriqi;
	}
	
	/**
	 * 获取：援助日期
	 */
	public Date getYuanzhuriqi() {
		return yuanzhuriqi;
	}
			
}

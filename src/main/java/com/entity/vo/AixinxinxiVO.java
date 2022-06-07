package com.entity.vo;

import com.entity.AixinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 爱心信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public class AixinxinxiVO  implements Serializable {
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
	 * 爱心值
	 */
	
	private String aixinzhi;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
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
	 * 设置：相关图片
	 */
	 
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
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

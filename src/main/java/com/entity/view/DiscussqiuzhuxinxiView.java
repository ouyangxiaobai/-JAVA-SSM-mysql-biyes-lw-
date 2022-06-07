package com.entity.view;

import com.entity.DiscussqiuzhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 求助信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
@TableName("discussqiuzhuxinxi")
public class DiscussqiuzhuxinxiView  extends DiscussqiuzhuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqiuzhuxinxiView(){
	}
 
 	public DiscussqiuzhuxinxiView(DiscussqiuzhuxinxiEntity discussqiuzhuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussqiuzhuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

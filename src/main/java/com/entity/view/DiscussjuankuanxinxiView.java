package com.entity.view;

import com.entity.DiscussjuankuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 捐款信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
@TableName("discussjuankuanxinxi")
public class DiscussjuankuanxinxiView  extends DiscussjuankuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjuankuanxinxiView(){
	}
 
 	public DiscussjuankuanxinxiView(DiscussjuankuanxinxiEntity discussjuankuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjuankuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

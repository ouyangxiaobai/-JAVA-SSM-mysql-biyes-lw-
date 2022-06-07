package com.entity.view;

import com.entity.AixinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 爱心信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("aixinxinxi")
public class AixinxinxiView  extends AixinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AixinxinxiView(){
	}
 
 	public AixinxinxiView(AixinxinxiEntity aixinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, aixinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

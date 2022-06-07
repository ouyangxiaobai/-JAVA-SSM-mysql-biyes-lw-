package com.entity.view;

import com.entity.WupinhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品回收
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@TableName("wupinhuishou")
public class WupinhuishouView  extends WupinhuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinhuishouView(){
	}
 
 	public WupinhuishouView(WupinhuishouEntity wupinhuishouEntity){
 	try {
			BeanUtils.copyProperties(this, wupinhuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

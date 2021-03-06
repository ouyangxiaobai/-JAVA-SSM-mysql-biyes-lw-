package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhuxinxiView;


/**
 * 求助信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface QiuzhuxinxiService extends IService<QiuzhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhuxinxiVO> selectListVO(Wrapper<QiuzhuxinxiEntity> wrapper);
   	
   	QiuzhuxinxiVO selectVO(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
   	
   	List<QiuzhuxinxiView> selectListView(Wrapper<QiuzhuxinxiEntity> wrapper);
   	
   	QiuzhuxinxiView selectView(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhuxinxiEntity> wrapper);
   	
}


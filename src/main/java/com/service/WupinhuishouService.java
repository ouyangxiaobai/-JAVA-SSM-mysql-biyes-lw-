package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinhuishouView;


/**
 * 物品回收
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface WupinhuishouService extends IService<WupinhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinhuishouVO> selectListVO(Wrapper<WupinhuishouEntity> wrapper);
   	
   	WupinhuishouVO selectVO(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
   	
   	List<WupinhuishouView> selectListView(Wrapper<WupinhuishouEntity> wrapper);
   	
   	WupinhuishouView selectView(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinhuishouEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinzhiquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinzhiquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinzhiquView;


/**
 * 爱心支取
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface AixinzhiquService extends IService<AixinzhiquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinzhiquVO> selectListVO(Wrapper<AixinzhiquEntity> wrapper);
   	
   	AixinzhiquVO selectVO(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
   	
   	List<AixinzhiquView> selectListView(Wrapper<AixinzhiquEntity> wrapper);
   	
   	AixinzhiquView selectView(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinzhiquEntity> wrapper);
   	
}


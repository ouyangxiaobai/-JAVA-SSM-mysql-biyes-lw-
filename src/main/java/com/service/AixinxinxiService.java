package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinxinxiView;


/**
 * 爱心信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface AixinxinxiService extends IService<AixinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinxinxiVO> selectListVO(Wrapper<AixinxinxiEntity> wrapper);
   	
   	AixinxinxiVO selectVO(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
   	
   	List<AixinxinxiView> selectListView(Wrapper<AixinxinxiEntity> wrapper);
   	
   	AixinxinxiView selectView(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinxinxiEntity> wrapper);
   	
}


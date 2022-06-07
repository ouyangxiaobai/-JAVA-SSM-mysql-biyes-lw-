package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanzhuView;


/**
 * 援助
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface YuanzhuService extends IService<YuanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanzhuVO> selectListVO(Wrapper<YuanzhuEntity> wrapper);
   	
   	YuanzhuVO selectVO(@Param("ew") Wrapper<YuanzhuEntity> wrapper);
   	
   	List<YuanzhuView> selectListView(Wrapper<YuanzhuEntity> wrapper);
   	
   	YuanzhuView selectView(@Param("ew") Wrapper<YuanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanzhuEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuankuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuankuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuankuanxinxiView;


/**
 * 捐款信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface JuankuanxinxiService extends IService<JuankuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuankuanxinxiVO> selectListVO(Wrapper<JuankuanxinxiEntity> wrapper);
   	
   	JuankuanxinxiVO selectVO(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
   	
   	List<JuankuanxinxiView> selectListView(Wrapper<JuankuanxinxiEntity> wrapper);
   	
   	JuankuanxinxiView selectView(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuankuanxinxiEntity> wrapper);
   	
}


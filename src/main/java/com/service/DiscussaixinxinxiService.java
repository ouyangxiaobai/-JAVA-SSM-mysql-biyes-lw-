package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussaixinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussaixinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussaixinxinxiView;


/**
 * 爱心信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussaixinxinxiService extends IService<DiscussaixinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussaixinxinxiVO> selectListVO(Wrapper<DiscussaixinxinxiEntity> wrapper);
   	
   	DiscussaixinxinxiVO selectVO(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
   	
   	List<DiscussaixinxinxiView> selectListView(Wrapper<DiscussaixinxinxiEntity> wrapper);
   	
   	DiscussaixinxinxiView selectView(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussaixinxinxiEntity> wrapper);
   	
}


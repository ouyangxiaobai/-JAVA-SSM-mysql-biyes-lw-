package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuzhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuzhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuzhuxinxiView;


/**
 * 求助信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussqiuzhuxinxiService extends IService<DiscussqiuzhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuzhuxinxiVO> selectListVO(Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
   	
   	DiscussqiuzhuxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
   	
   	List<DiscussqiuzhuxinxiView> selectListView(Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
   	
   	DiscussqiuzhuxinxiView selectView(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
   	
}


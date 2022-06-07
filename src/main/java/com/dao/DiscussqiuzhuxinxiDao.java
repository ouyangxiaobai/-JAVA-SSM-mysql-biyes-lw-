package com.dao;

import com.entity.DiscussqiuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuzhuxinxiVO;
import com.entity.view.DiscussqiuzhuxinxiView;


/**
 * 求助信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussqiuzhuxinxiDao extends BaseMapper<DiscussqiuzhuxinxiEntity> {
	
	List<DiscussqiuzhuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
	
	DiscussqiuzhuxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
	
	List<DiscussqiuzhuxinxiView> selectListView(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);

	List<DiscussqiuzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
	
	DiscussqiuzhuxinxiView selectView(@Param("ew") Wrapper<DiscussqiuzhuxinxiEntity> wrapper);
	
}

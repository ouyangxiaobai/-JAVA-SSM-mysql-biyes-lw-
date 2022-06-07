package com.dao;

import com.entity.DiscussaixinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussaixinxinxiVO;
import com.entity.view.DiscussaixinxinxiView;


/**
 * 爱心信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussaixinxinxiDao extends BaseMapper<DiscussaixinxinxiEntity> {
	
	List<DiscussaixinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
	
	DiscussaixinxinxiVO selectVO(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
	
	List<DiscussaixinxinxiView> selectListView(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);

	List<DiscussaixinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
	
	DiscussaixinxinxiView selectView(@Param("ew") Wrapper<DiscussaixinxinxiEntity> wrapper);
	
}

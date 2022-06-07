package com.dao;

import com.entity.DiscussjuankuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjuankuanxinxiVO;
import com.entity.view.DiscussjuankuanxinxiView;


/**
 * 捐款信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussjuankuanxinxiDao extends BaseMapper<DiscussjuankuanxinxiEntity> {
	
	List<DiscussjuankuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
	
	DiscussjuankuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
	
	List<DiscussjuankuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);

	List<DiscussjuankuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
	
	DiscussjuankuanxinxiView selectView(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
	
}

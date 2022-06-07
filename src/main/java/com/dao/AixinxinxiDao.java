package com.dao;

import com.entity.AixinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinxinxiVO;
import com.entity.view.AixinxinxiView;


/**
 * 爱心信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface AixinxinxiDao extends BaseMapper<AixinxinxiEntity> {
	
	List<AixinxinxiVO> selectListVO(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
	
	AixinxinxiVO selectVO(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
	
	List<AixinxinxiView> selectListView(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);

	List<AixinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
	
	AixinxinxiView selectView(@Param("ew") Wrapper<AixinxinxiEntity> wrapper);
	
}

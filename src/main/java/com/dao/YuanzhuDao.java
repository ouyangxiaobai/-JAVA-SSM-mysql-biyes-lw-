package com.dao;

import com.entity.YuanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanzhuVO;
import com.entity.view.YuanzhuView;


/**
 * 援助
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface YuanzhuDao extends BaseMapper<YuanzhuEntity> {
	
	List<YuanzhuVO> selectListVO(@Param("ew") Wrapper<YuanzhuEntity> wrapper);
	
	YuanzhuVO selectVO(@Param("ew") Wrapper<YuanzhuEntity> wrapper);
	
	List<YuanzhuView> selectListView(@Param("ew") Wrapper<YuanzhuEntity> wrapper);

	List<YuanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<YuanzhuEntity> wrapper);
	
	YuanzhuView selectView(@Param("ew") Wrapper<YuanzhuEntity> wrapper);
	
}

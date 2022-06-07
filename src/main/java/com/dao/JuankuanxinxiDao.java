package com.dao;

import com.entity.JuankuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuankuanxinxiVO;
import com.entity.view.JuankuanxinxiView;


/**
 * 捐款信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface JuankuanxinxiDao extends BaseMapper<JuankuanxinxiEntity> {
	
	List<JuankuanxinxiVO> selectListVO(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
	
	JuankuanxinxiVO selectVO(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
	
	List<JuankuanxinxiView> selectListView(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);

	List<JuankuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
	
	JuankuanxinxiView selectView(@Param("ew") Wrapper<JuankuanxinxiEntity> wrapper);
	
}

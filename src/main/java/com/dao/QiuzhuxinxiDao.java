package com.dao;

import com.entity.QiuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzhuxinxiVO;
import com.entity.view.QiuzhuxinxiView;


/**
 * 求助信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface QiuzhuxinxiDao extends BaseMapper<QiuzhuxinxiEntity> {
	
	List<QiuzhuxinxiVO> selectListVO(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
	
	QiuzhuxinxiVO selectVO(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
	
	List<QiuzhuxinxiView> selectListView(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);

	List<QiuzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
	
	QiuzhuxinxiView selectView(@Param("ew") Wrapper<QiuzhuxinxiEntity> wrapper);
	
}

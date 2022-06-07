package com.dao;

import com.entity.WupinhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinhuishouVO;
import com.entity.view.WupinhuishouView;


/**
 * 物品回收
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface WupinhuishouDao extends BaseMapper<WupinhuishouEntity> {
	
	List<WupinhuishouVO> selectListVO(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
	
	WupinhuishouVO selectVO(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
	
	List<WupinhuishouView> selectListView(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);

	List<WupinhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
	
	WupinhuishouView selectView(@Param("ew") Wrapper<WupinhuishouEntity> wrapper);
	
}

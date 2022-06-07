package com.dao;

import com.entity.AixinzhiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinzhiquVO;
import com.entity.view.AixinzhiquView;


/**
 * 爱心支取
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface AixinzhiquDao extends BaseMapper<AixinzhiquEntity> {
	
	List<AixinzhiquVO> selectListVO(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
	
	AixinzhiquVO selectVO(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
	
	List<AixinzhiquView> selectListView(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);

	List<AixinzhiquView> selectListView(Pagination page,@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
	
	AixinzhiquView selectView(@Param("ew") Wrapper<AixinzhiquEntity> wrapper);
	
}

package com.dao;

import com.entity.WangzhangonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangzhangonggaoVO;
import com.entity.view.WangzhangonggaoView;


/**
 * 网站公告
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
public interface WangzhangonggaoDao extends BaseMapper<WangzhangonggaoEntity> {
	
	List<WangzhangonggaoVO> selectListVO(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	WangzhangonggaoVO selectVO(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	List<WangzhangonggaoView> selectListView(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);

	List<WangzhangonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	WangzhangonggaoView selectView(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
}

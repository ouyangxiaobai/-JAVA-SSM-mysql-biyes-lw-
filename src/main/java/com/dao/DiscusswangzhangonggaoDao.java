package com.dao;

import com.entity.DiscusswangzhangonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswangzhangonggaoVO;
import com.entity.view.DiscusswangzhangonggaoView;


/**
 * 网站公告评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscusswangzhangonggaoDao extends BaseMapper<DiscusswangzhangonggaoEntity> {
	
	List<DiscusswangzhangonggaoVO> selectListVO(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
	
	DiscusswangzhangonggaoVO selectVO(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
	
	List<DiscusswangzhangonggaoView> selectListView(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);

	List<DiscusswangzhangonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
	
	DiscusswangzhangonggaoView selectView(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
	
}

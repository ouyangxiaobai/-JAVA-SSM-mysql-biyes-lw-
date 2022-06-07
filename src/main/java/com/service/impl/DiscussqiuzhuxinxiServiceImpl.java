package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussqiuzhuxinxiDao;
import com.entity.DiscussqiuzhuxinxiEntity;
import com.service.DiscussqiuzhuxinxiService;
import com.entity.vo.DiscussqiuzhuxinxiVO;
import com.entity.view.DiscussqiuzhuxinxiView;

@Service("discussqiuzhuxinxiService")
public class DiscussqiuzhuxinxiServiceImpl extends ServiceImpl<DiscussqiuzhuxinxiDao, DiscussqiuzhuxinxiEntity> implements DiscussqiuzhuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuzhuxinxiEntity> page = this.selectPage(
                new Query<DiscussqiuzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuzhuxinxiEntity> wrapper) {
		  Page<DiscussqiuzhuxinxiView> page =new Query<DiscussqiuzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuzhuxinxiVO> selectListVO(Wrapper<DiscussqiuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuzhuxinxiVO selectVO(Wrapper<DiscussqiuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuzhuxinxiView> selectListView(Wrapper<DiscussqiuzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuzhuxinxiView selectView(Wrapper<DiscussqiuzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

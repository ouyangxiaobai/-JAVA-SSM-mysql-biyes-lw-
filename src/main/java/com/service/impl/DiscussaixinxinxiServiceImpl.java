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


import com.dao.DiscussaixinxinxiDao;
import com.entity.DiscussaixinxinxiEntity;
import com.service.DiscussaixinxinxiService;
import com.entity.vo.DiscussaixinxinxiVO;
import com.entity.view.DiscussaixinxinxiView;

@Service("discussaixinxinxiService")
public class DiscussaixinxinxiServiceImpl extends ServiceImpl<DiscussaixinxinxiDao, DiscussaixinxinxiEntity> implements DiscussaixinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussaixinxinxiEntity> page = this.selectPage(
                new Query<DiscussaixinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussaixinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussaixinxinxiEntity> wrapper) {
		  Page<DiscussaixinxinxiView> page =new Query<DiscussaixinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussaixinxinxiVO> selectListVO(Wrapper<DiscussaixinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussaixinxinxiVO selectVO(Wrapper<DiscussaixinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussaixinxinxiView> selectListView(Wrapper<DiscussaixinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussaixinxinxiView selectView(Wrapper<DiscussaixinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

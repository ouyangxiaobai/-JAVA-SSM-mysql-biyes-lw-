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


import com.dao.DiscussjuankuanxinxiDao;
import com.entity.DiscussjuankuanxinxiEntity;
import com.service.DiscussjuankuanxinxiService;
import com.entity.vo.DiscussjuankuanxinxiVO;
import com.entity.view.DiscussjuankuanxinxiView;

@Service("discussjuankuanxinxiService")
public class DiscussjuankuanxinxiServiceImpl extends ServiceImpl<DiscussjuankuanxinxiDao, DiscussjuankuanxinxiEntity> implements DiscussjuankuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjuankuanxinxiEntity> page = this.selectPage(
                new Query<DiscussjuankuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjuankuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjuankuanxinxiEntity> wrapper) {
		  Page<DiscussjuankuanxinxiView> page =new Query<DiscussjuankuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjuankuanxinxiVO> selectListVO(Wrapper<DiscussjuankuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjuankuanxinxiVO selectVO(Wrapper<DiscussjuankuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjuankuanxinxiView> selectListView(Wrapper<DiscussjuankuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjuankuanxinxiView selectView(Wrapper<DiscussjuankuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

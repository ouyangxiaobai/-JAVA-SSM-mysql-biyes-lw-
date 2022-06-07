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


import com.dao.AixinxinxiDao;
import com.entity.AixinxinxiEntity;
import com.service.AixinxinxiService;
import com.entity.vo.AixinxinxiVO;
import com.entity.view.AixinxinxiView;

@Service("aixinxinxiService")
public class AixinxinxiServiceImpl extends ServiceImpl<AixinxinxiDao, AixinxinxiEntity> implements AixinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinxinxiEntity> page = this.selectPage(
                new Query<AixinxinxiEntity>(params).getPage(),
                new EntityWrapper<AixinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinxinxiEntity> wrapper) {
		  Page<AixinxinxiView> page =new Query<AixinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinxinxiVO> selectListVO(Wrapper<AixinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinxinxiVO selectVO(Wrapper<AixinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinxinxiView> selectListView(Wrapper<AixinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinxinxiView selectView(Wrapper<AixinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.YuanzhuDao;
import com.entity.YuanzhuEntity;
import com.service.YuanzhuService;
import com.entity.vo.YuanzhuVO;
import com.entity.view.YuanzhuView;

@Service("yuanzhuService")
public class YuanzhuServiceImpl extends ServiceImpl<YuanzhuDao, YuanzhuEntity> implements YuanzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanzhuEntity> page = this.selectPage(
                new Query<YuanzhuEntity>(params).getPage(),
                new EntityWrapper<YuanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanzhuEntity> wrapper) {
		  Page<YuanzhuView> page =new Query<YuanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanzhuVO> selectListVO(Wrapper<YuanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanzhuVO selectVO(Wrapper<YuanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanzhuView> selectListView(Wrapper<YuanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanzhuView selectView(Wrapper<YuanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

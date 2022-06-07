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


import com.dao.WupinhuishouDao;
import com.entity.WupinhuishouEntity;
import com.service.WupinhuishouService;
import com.entity.vo.WupinhuishouVO;
import com.entity.view.WupinhuishouView;

@Service("wupinhuishouService")
public class WupinhuishouServiceImpl extends ServiceImpl<WupinhuishouDao, WupinhuishouEntity> implements WupinhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinhuishouEntity> page = this.selectPage(
                new Query<WupinhuishouEntity>(params).getPage(),
                new EntityWrapper<WupinhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinhuishouEntity> wrapper) {
		  Page<WupinhuishouView> page =new Query<WupinhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinhuishouVO> selectListVO(Wrapper<WupinhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinhuishouVO selectVO(Wrapper<WupinhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinhuishouView> selectListView(Wrapper<WupinhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinhuishouView selectView(Wrapper<WupinhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

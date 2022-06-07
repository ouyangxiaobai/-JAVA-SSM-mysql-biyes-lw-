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


import com.dao.AixinzhiquDao;
import com.entity.AixinzhiquEntity;
import com.service.AixinzhiquService;
import com.entity.vo.AixinzhiquVO;
import com.entity.view.AixinzhiquView;

@Service("aixinzhiquService")
public class AixinzhiquServiceImpl extends ServiceImpl<AixinzhiquDao, AixinzhiquEntity> implements AixinzhiquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinzhiquEntity> page = this.selectPage(
                new Query<AixinzhiquEntity>(params).getPage(),
                new EntityWrapper<AixinzhiquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinzhiquEntity> wrapper) {
		  Page<AixinzhiquView> page =new Query<AixinzhiquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinzhiquVO> selectListVO(Wrapper<AixinzhiquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinzhiquVO selectVO(Wrapper<AixinzhiquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinzhiquView> selectListView(Wrapper<AixinzhiquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinzhiquView selectView(Wrapper<AixinzhiquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

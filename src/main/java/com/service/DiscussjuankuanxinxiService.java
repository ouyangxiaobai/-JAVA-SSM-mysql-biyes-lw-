package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjuankuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjuankuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjuankuanxinxiView;


/**
 * 捐款信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
public interface DiscussjuankuanxinxiService extends IService<DiscussjuankuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjuankuanxinxiVO> selectListVO(Wrapper<DiscussjuankuanxinxiEntity> wrapper);
   	
   	DiscussjuankuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
   	
   	List<DiscussjuankuanxinxiView> selectListView(Wrapper<DiscussjuankuanxinxiEntity> wrapper);
   	
   	DiscussjuankuanxinxiView selectView(@Param("ew") Wrapper<DiscussjuankuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjuankuanxinxiEntity> wrapper);
   	
}


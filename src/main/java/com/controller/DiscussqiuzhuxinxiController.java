package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussqiuzhuxinxiEntity;
import com.entity.view.DiscussqiuzhuxinxiView;

import com.service.DiscussqiuzhuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 求助信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 15:14:46
 */
@RestController
@RequestMapping("/discussqiuzhuxinxi")
public class DiscussqiuzhuxinxiController {
    @Autowired
    private DiscussqiuzhuxinxiService discussqiuzhuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussqiuzhuxinxiEntity discussqiuzhuxinxi, HttpServletRequest request){

        EntityWrapper<DiscussqiuzhuxinxiEntity> ew = new EntityWrapper<DiscussqiuzhuxinxiEntity>();
		PageUtils page = discussqiuzhuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqiuzhuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussqiuzhuxinxiEntity discussqiuzhuxinxi, HttpServletRequest request){
        EntityWrapper<DiscussqiuzhuxinxiEntity> ew = new EntityWrapper<DiscussqiuzhuxinxiEntity>();
		PageUtils page = discussqiuzhuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqiuzhuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussqiuzhuxinxiEntity discussqiuzhuxinxi){
       	EntityWrapper<DiscussqiuzhuxinxiEntity> ew = new EntityWrapper<DiscussqiuzhuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussqiuzhuxinxi, "discussqiuzhuxinxi")); 
        return R.ok().put("data", discussqiuzhuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussqiuzhuxinxiEntity discussqiuzhuxinxi){
        EntityWrapper< DiscussqiuzhuxinxiEntity> ew = new EntityWrapper< DiscussqiuzhuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussqiuzhuxinxi, "discussqiuzhuxinxi")); 
		DiscussqiuzhuxinxiView discussqiuzhuxinxiView =  discussqiuzhuxinxiService.selectView(ew);
		return R.ok("查询求助信息评论表成功").put("data", discussqiuzhuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussqiuzhuxinxiEntity discussqiuzhuxinxi = discussqiuzhuxinxiService.selectById(id);
        return R.ok().put("data", discussqiuzhuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussqiuzhuxinxiEntity discussqiuzhuxinxi = discussqiuzhuxinxiService.selectById(id);
        return R.ok().put("data", discussqiuzhuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussqiuzhuxinxiEntity discussqiuzhuxinxi, HttpServletRequest request){
    	discussqiuzhuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqiuzhuxinxi);

        discussqiuzhuxinxiService.insert(discussqiuzhuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussqiuzhuxinxiEntity discussqiuzhuxinxi, HttpServletRequest request){
    	discussqiuzhuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqiuzhuxinxi);

        discussqiuzhuxinxiService.insert(discussqiuzhuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussqiuzhuxinxiEntity discussqiuzhuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussqiuzhuxinxi);
        discussqiuzhuxinxiService.updateById(discussqiuzhuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussqiuzhuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussqiuzhuxinxiEntity> wrapper = new EntityWrapper<DiscussqiuzhuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussqiuzhuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

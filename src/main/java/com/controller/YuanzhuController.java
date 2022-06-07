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

import com.entity.YuanzhuEntity;
import com.entity.view.YuanzhuView;

import com.service.YuanzhuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 援助
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@RestController
@RequestMapping("/yuanzhu")
public class YuanzhuController {
    @Autowired
    private YuanzhuService yuanzhuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanzhuEntity yuanzhu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yuanzhu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuanzhuEntity> ew = new EntityWrapper<YuanzhuEntity>();
		PageUtils page = yuanzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanzhu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuanzhuEntity yuanzhu, HttpServletRequest request){
        EntityWrapper<YuanzhuEntity> ew = new EntityWrapper<YuanzhuEntity>();
		PageUtils page = yuanzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanzhu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanzhuEntity yuanzhu){
       	EntityWrapper<YuanzhuEntity> ew = new EntityWrapper<YuanzhuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanzhu, "yuanzhu")); 
        return R.ok().put("data", yuanzhuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanzhuEntity yuanzhu){
        EntityWrapper< YuanzhuEntity> ew = new EntityWrapper< YuanzhuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanzhu, "yuanzhu")); 
		YuanzhuView yuanzhuView =  yuanzhuService.selectView(ew);
		return R.ok("查询援助成功").put("data", yuanzhuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuanzhuEntity yuanzhu = yuanzhuService.selectById(id);
        return R.ok().put("data", yuanzhu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuanzhuEntity yuanzhu = yuanzhuService.selectById(id);
        return R.ok().put("data", yuanzhu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuanzhuEntity yuanzhu, HttpServletRequest request){
    	yuanzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanzhu);

        yuanzhuService.insert(yuanzhu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuanzhuEntity yuanzhu, HttpServletRequest request){
    	yuanzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanzhu);

        yuanzhuService.insert(yuanzhu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuanzhuEntity yuanzhu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanzhu);
        yuanzhuService.updateById(yuanzhu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuanzhuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YuanzhuEntity> wrapper = new EntityWrapper<YuanzhuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuanzhuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

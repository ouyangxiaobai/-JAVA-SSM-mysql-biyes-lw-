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

import com.entity.AixinxinxiEntity;
import com.entity.view.AixinxinxiView;

import com.service.AixinxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 爱心信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@RestController
@RequestMapping("/aixinxinxi")
public class AixinxinxiController {
    @Autowired
    private AixinxinxiService aixinxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,AixinxinxiEntity aixinxinxi, HttpServletRequest request){

        EntityWrapper<AixinxinxiEntity> ew = new EntityWrapper<AixinxinxiEntity>();
		PageUtils page = aixinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aixinxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,AixinxinxiEntity aixinxinxi, HttpServletRequest request){
        EntityWrapper<AixinxinxiEntity> ew = new EntityWrapper<AixinxinxiEntity>();
		PageUtils page = aixinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aixinxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( AixinxinxiEntity aixinxinxi){
       	EntityWrapper<AixinxinxiEntity> ew = new EntityWrapper<AixinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( aixinxinxi, "aixinxinxi")); 
        return R.ok().put("data", aixinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(AixinxinxiEntity aixinxinxi){
        EntityWrapper< AixinxinxiEntity> ew = new EntityWrapper< AixinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( aixinxinxi, "aixinxinxi")); 
		AixinxinxiView aixinxinxiView =  aixinxinxiService.selectView(ew);
		return R.ok("查询爱心信息成功").put("data", aixinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        AixinxinxiEntity aixinxinxi = aixinxinxiService.selectById(id);
		aixinxinxi.setClicknum(aixinxinxi.getClicknum()+1);
		aixinxinxi.setClicktime(new Date());
		aixinxinxiService.updateById(aixinxinxi);
        return R.ok().put("data", aixinxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        AixinxinxiEntity aixinxinxi = aixinxinxiService.selectById(id);
		aixinxinxi.setClicknum(aixinxinxi.getClicknum()+1);
		aixinxinxi.setClicktime(new Date());
		aixinxinxiService.updateById(aixinxinxi);
        return R.ok().put("data", aixinxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        AixinxinxiEntity aixinxinxi = aixinxinxiService.selectById(id);
        if(type.equals("1")) {
        	aixinxinxi.setThumbsupnum(aixinxinxi.getThumbsupnum()+1);
        } else {
        	aixinxinxi.setCrazilynum(aixinxinxi.getCrazilynum()+1);
        }
        aixinxinxiService.updateById(aixinxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AixinxinxiEntity aixinxinxi, HttpServletRequest request){
    	aixinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(aixinxinxi);

        aixinxinxiService.insert(aixinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody AixinxinxiEntity aixinxinxi, HttpServletRequest request){
    	aixinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(aixinxinxi);

        aixinxinxiService.insert(aixinxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AixinxinxiEntity aixinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(aixinxinxi);
        aixinxinxiService.updateById(aixinxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        aixinxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<AixinxinxiEntity> wrapper = new EntityWrapper<AixinxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = aixinxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,AixinxinxiEntity aixinxinxi, HttpServletRequest request,String pre){
        EntityWrapper<AixinxinxiEntity> ew = new EntityWrapper<AixinxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = aixinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aixinxinxi), params), params));
        return R.ok().put("data", page);
    }


}

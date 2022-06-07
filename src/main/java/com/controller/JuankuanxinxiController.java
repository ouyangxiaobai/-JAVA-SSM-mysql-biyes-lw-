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

import com.entity.JuankuanxinxiEntity;
import com.entity.view.JuankuanxinxiView;

import com.service.JuankuanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 捐款信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 15:14:45
 */
@RestController
@RequestMapping("/juankuanxinxi")
public class JuankuanxinxiController {
    @Autowired
    private JuankuanxinxiService juankuanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JuankuanxinxiEntity juankuanxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			juankuanxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JuankuanxinxiEntity> ew = new EntityWrapper<JuankuanxinxiEntity>();
		PageUtils page = juankuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, juankuanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JuankuanxinxiEntity juankuanxinxi, HttpServletRequest request){
        EntityWrapper<JuankuanxinxiEntity> ew = new EntityWrapper<JuankuanxinxiEntity>();
		PageUtils page = juankuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, juankuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JuankuanxinxiEntity juankuanxinxi){
       	EntityWrapper<JuankuanxinxiEntity> ew = new EntityWrapper<JuankuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( juankuanxinxi, "juankuanxinxi")); 
        return R.ok().put("data", juankuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JuankuanxinxiEntity juankuanxinxi){
        EntityWrapper< JuankuanxinxiEntity> ew = new EntityWrapper< JuankuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( juankuanxinxi, "juankuanxinxi")); 
		JuankuanxinxiView juankuanxinxiView =  juankuanxinxiService.selectView(ew);
		return R.ok("查询捐款信息成功").put("data", juankuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JuankuanxinxiEntity juankuanxinxi = juankuanxinxiService.selectById(id);
        return R.ok().put("data", juankuanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JuankuanxinxiEntity juankuanxinxi = juankuanxinxiService.selectById(id);
        return R.ok().put("data", juankuanxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        JuankuanxinxiEntity juankuanxinxi = juankuanxinxiService.selectById(id);
        if(type.equals("1")) {
        	juankuanxinxi.setThumbsupnum(juankuanxinxi.getThumbsupnum()+1);
        } else {
        	juankuanxinxi.setCrazilynum(juankuanxinxi.getCrazilynum()+1);
        }
        juankuanxinxiService.updateById(juankuanxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JuankuanxinxiEntity juankuanxinxi, HttpServletRequest request){
    	juankuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(juankuanxinxi);

        juankuanxinxiService.insert(juankuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody JuankuanxinxiEntity juankuanxinxi, HttpServletRequest request){
    	juankuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(juankuanxinxi);

        juankuanxinxiService.insert(juankuanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JuankuanxinxiEntity juankuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(juankuanxinxi);
        juankuanxinxiService.updateById(juankuanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        juankuanxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JuankuanxinxiEntity> wrapper = new EntityWrapper<JuankuanxinxiEntity>();
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

		int count = juankuanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

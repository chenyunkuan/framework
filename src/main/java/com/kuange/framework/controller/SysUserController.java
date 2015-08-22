package com.kuange.framework.controller;

import com.alibaba.fastjson.JSON;
import com.kuange.framework.common.controller.SimpleListControllerTemplate;
import com.kuange.framework.common.model.Page4BootGrid;
import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
@Controller
@RequestMapping(value="/sysUser")
public class SysUserController  extends SimpleListControllerTemplate<SysUser> {

    @Autowired
    private SysUserService sysUserService;

    @Override
    protected ModelAndView listPage(HttpServletRequest request) {
        ModelMap modelMap = new ModelMap();
        List<SysUser> list = new ArrayList<SysUser>();
        SysUser user = new SysUser();
        user.setId(Long.valueOf(1));
        user.setUserName("asasdad");
        user.setGender("男");
        list.add(user);
        modelMap.put("list",list);
        modelMap.put("pageNo",1);
        modelMap.put("pageSize",1);
        modelMap.put("totalNo",1);
        return new ModelAndView("/system/user/list_user",modelMap);
    }

    @Override
    protected ModelAndView addPage(HttpServletRequest request) {
        return new ModelAndView("/system/user/add_user");
    }

    @Override
    protected ModelAndView updatePage(HttpServletRequest request) {
        return new ModelAndView("/system/user/update_user");
    }

    @Override
    protected ModelAndView viewPage(HttpServletRequest request) {
        return new ModelAndView("/system/user/view_user");
    }

    @Override
    protected ModelAndView doDelete(HttpServletRequest request) {
        return new ModelAndView("/system/user/list_user");
    }

    @Override
    protected ModelAndView doSave(HttpServletRequest request) {
        return new ModelAndView("/system/user/list_user");
    }

    @Override
    protected ModelAndView doList(HttpServletRequest request) {
        List<SysUser> list = new ArrayList<SysUser>();
        SysUser user = new SysUser();
        user.setId(Long.valueOf(1));
        user.setUserName("asasdad");
        user.setGender("男");
        ModelMap modelMap = new ModelMap();
        modelMap.put("rows",list);
        modelMap.put("current",list.size());
        modelMap.put("rowCount",list.size());
        modelMap.put("total",list.size());
        return new ModelAndView("/system/user/list_user");
    }

    @Override
    protected Page4BootGrid<SysUser> doJsonList(HttpServletRequest request) {
        return null;
    }
}

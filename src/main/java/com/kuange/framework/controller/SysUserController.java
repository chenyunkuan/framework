package com.kuange.framework.controller;

import com.kuange.framework.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
@Controller
@RequestMapping(value="/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value="/find")
    public ModelAndView getById(Long id){
        sysUserService.queryById(Long.valueOf(1));
        return new ModelAndView("common/frame");
    }

    @RequestMapping(value="/list")
    public ModelAndView List(Long id){
        return new ModelAndView("list");
    }
}

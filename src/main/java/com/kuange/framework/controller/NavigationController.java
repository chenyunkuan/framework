package com.kuange.framework.controller;

import com.kuange.framework.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
@Controller
@RequestMapping("/navigation")
public class NavigationController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/find")
    public ModelAndView getById(Long id){
        return new ModelAndView("common/frame");
    }

    @RequestMapping("/list")
    public ModelAndView List(Long id){
        return new ModelAndView("list");
    }
}

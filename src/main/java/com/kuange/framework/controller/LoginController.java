package com.kuange.framework.controller;

import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2015/8/20.
 */
@Controller
@RequestMapping("/auth")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public ModelAndView login(String userName,String passWord){
        ModelMap modelMap = new ModelMap();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addAllObjects(modelMap);
        return new ModelAndView("frame");
    }
}

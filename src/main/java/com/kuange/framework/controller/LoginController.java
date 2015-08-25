package com.kuange.framework.controller;

import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2015/8/20.
 */
@Controller
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public String login(String userName,String passWord){
        List<SysUser> users=sysUserService.queryListByMap(null);
        ModelMap modelMap = new ModelMap();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addAllObjects(modelMap);
        return "forward:/auth/index";
    }
    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("/common/frame");
    }
}

package com.kuange.framework.controller;

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

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(HttpServletRequest request){
        ModelMap modelMap = new ModelMap();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addAllObjects(modelMap);
        return new ModelAndView("frame");
    }
}

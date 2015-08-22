package com.kuange.framework.common.controller;

import com.kuange.framework.common.model.Page4BootGrid;
import com.kuange.framework.model.SysUser;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public abstract class SimpleListControllerTemplate<T>  extends  BaseController{


    protected abstract ModelAndView listPage(HttpServletRequest request);

    protected abstract ModelAndView addPage(HttpServletRequest request);

    protected abstract ModelAndView updatePage(HttpServletRequest request);

    protected abstract ModelAndView viewPage(HttpServletRequest request);

    protected abstract ModelAndView doDelete(HttpServletRequest request);

    protected abstract ModelAndView doSave(HttpServletRequest request);

    protected abstract Page4BootGrid<T> doJsonList(HttpServletRequest request);

    protected abstract ModelAndView doList(HttpServletRequest request);


    @RequestMapping("toList")
    public ModelAndView toList(HttpServletRequest request) {
        return listPage(request);
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(HttpServletRequest request) {
        return addPage(request);
    }
    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(HttpServletRequest request) {
        return updatePage(request);
    }
    @RequestMapping("toView")
    public ModelAndView toView(HttpServletRequest request) {
        return viewPage(request);
    }

    @RequestMapping("delete")
    public ModelAndView delete(HttpServletRequest request) {
        return doDelete(request);
    }

    @RequestMapping("list")
    public ModelAndView list(HttpServletRequest request) {
        return doList(request);
    }

    @RequestMapping("jsonList")
    @ResponseBody
    public Page4BootGrid<T> jsonList(HttpServletRequest request) {
        return doJsonList(request);
    }

    @RequestMapping("save")
    public ModelAndView save(HttpServletRequest request) {
        return doSave(request);
    }

}

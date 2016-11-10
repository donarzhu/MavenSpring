package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/11/10.
 */
@Controller
@RequestMapping
public class XiaoController {

    @RequestMapping(value = "index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}

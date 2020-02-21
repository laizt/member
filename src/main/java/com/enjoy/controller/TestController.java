package com.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class TestController{

    @GetMapping("/")
    public ModelAndView index() throws UnknownHostException {
        ModelAndView modelAndView = new ModelAndView();
        InetAddress addr = InetAddress.getLocalHost();
        String ip=addr.getHostAddress().toString(); //获取本机ip
        modelAndView.addObject("serverIp",ip);
        modelAndView.setViewName("index");

        return modelAndView;
    }

}

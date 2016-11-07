package com.vaibhav.controllers;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vaibhav.POJO.Person;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author vaibhav
 */
@Controller
public class DefaultController {
//    @RequestMapping(value="/index",method=RequestMethod.GET)
//    public String index() {
//        return "index";
//    }
   @RequestMapping(value="/login.htm", method = RequestMethod.GET)
   public String initLogin() {
       return "login";
   }
    
    @RequestMapping(value="/loginresult.htm", method = RequestMethod.POST)
    public String loginCredentials(ModelMap map, @RequestParam Map<String,String> param) {
        Person person=new Person();
        person.setUname(param.get("uname"));
        person.setPass(param.get("pass"));
        map.addAttribute(person);
        return "user_loggedin";
    }

}

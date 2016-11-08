package com.vaibhav.controllers;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vaibhav.JDBC.MainClass;
import com.vaibhav.POJO.Person;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vaibhav
 */
@Controller
public class VoterController {
//    @RequestMapping(value="/index",method=RequestMethod.GET)
//    public String index() {
//        return "index";
//    }
    
   @RequestMapping(value="/login.htm", method = RequestMethod.GET)
   public String initLogin(ModelMap map) {
       map.addAttribute("msg","");
       return "login";
   }
    
    @RequestMapping(value="/loginresult.htm", method = RequestMethod.POST)
    public String loginCredentials(ModelMap map, @RequestParam Map<String,String> param) {
        Person person=new Person();
        String uname=param.get("uname");
        String pass=param.get("pass");
        person.setUname(uname);
        person.setPass(pass);
        MainClass mc=new MainClass();
        
        if(mc.jdbcTemplate.validVoter(uname, pass)) {
            if(mc.jdbcTemplate.isAdmin(uname)) {
                map.addAttribute(person);
                return "admin_loggedin";
            }
            List<String> election=null,party=null;
            election=mc.jdbcTemplate.listElections();
            party=mc.jdbcTemplate.listParties();
            map.addAttribute("elections",election);
            map.addAttribute("parties",party);
            map.addAttribute(person);
            return "user_loggedin";
        }
      
        map.addAttribute("msg","Not a valid user");
        return "login";

        
    }
    @RequestMapping(value="/registerVoter.htm", method = RequestMethod.POST)
    public String signUp(ModelMap map, @RequestParam Map<String,String> param) {
        String uname=param.get("uname");
        String pass=param.get("pass");
        MainClass mc=new MainClass();
        mc.jdbcTemplate.addVoter(uname, pass);
        map.addAttribute("msg","Successful registration");
        return "register";
    }
}

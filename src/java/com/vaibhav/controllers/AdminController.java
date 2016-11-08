/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaibhav.controllers;

import com.vaibhav.JDBC.MainClass;
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
public class AdminController {
    @RequestMapping(value="/admin_loggedin.htm", method = RequestMethod.GET)
   public String initLogin(ModelMap map) {
       map.addAttribute("msg","");
       return "admin_loggedin";
   }
    
    @RequestMapping(value="/addParty.htm", method = RequestMethod.POST)
    public String newParty(ModelMap map, @RequestParam("party")String name) {
        MainClass mc=new MainClass();
        mc.jdbcTemplate.addParty(name);
        map.addAttribute("msg","Party added: "+name);
        return "admin_loggedin";
    }
    
    @RequestMapping(value="/addElection.htm", method = RequestMethod.POST)
    public String newElection(ModelMap map, @RequestParam("election")String name) {
        MainClass mc=new MainClass();
        mc.jdbcTemplate.addElection(name);
        map.addAttribute("msg","Election added: "+name);
        return "admin_loggedin";
    }
}

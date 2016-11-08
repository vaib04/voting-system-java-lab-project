/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaibhav.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vaibhav
 */
public class MainClass {
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    public JDBCTemplate jdbcTemplate=null;
    public MainClass() {
        jdbcTemplate=(JDBCTemplate) context.getBean("jdbcTemplate");
    }
}

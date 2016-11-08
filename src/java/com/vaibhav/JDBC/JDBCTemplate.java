/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaibhav.JDBC;

import com.vaibhav.POJO.Election;
import com.vaibhav.POJO.Party;
import com.vaibhav.POJO.Person;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vaibhav
 */
public class JDBCTemplate implements DAO{
    private JdbcTemplate jdbcTemplateObj;
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObj=new JdbcTemplate(dataSource);
    }
    @Override
    public void addVoter(String uname, String pass) {
        String sql="insert into users values (?,?,?)";
        jdbcTemplateObj.update(sql,uname,pass,"n");
    }

    @Override
    public void addParty(String name) {
        String sql="insert into party values (?)";
        jdbcTemplateObj.update(sql,name);
    }

    @Override
    public void addElection(String name) {
        String sql="insert into elections values (?)";
        jdbcTemplateObj.update(sql,name);
    }

    @Override
    public void delVoter(String uname) {
        String sql="delete from users where name = ?";
        jdbcTemplateObj.update(sql,uname);
    }

    @Override
    public void delParty(String name) {
        String sql="delete from party where name = ?";
        jdbcTemplateObj.update(sql,name);
//        sql="delete from results where party = ?";
//        jdbcTemplateObj.update(sql,name);
    }

    @Override
    public void delElection(String name) {
        String sql="delete from voted where election = ?";
        jdbcTemplateObj.update(sql,name);
        sql="delete from results where election = ?";
        jdbcTemplateObj.update(sql,name);
        sql="delete from elections where name = ?";
        jdbcTemplateObj.update(sql,name);
    }

    @Override
    public void markVoted(String user, String election) {
        String sql="insert into voted values (?,?)";
        jdbcTemplateObj.update(sql,user,election);
    }

    @Override
    public boolean ifVoted(String user, String election) {
        String sql="select count(*) from voted where users = ? and election = ?";
        int i=0;
        i=jdbcTemplateObj.queryForObject(sql, new Object[] {user,election}, Integer.class);
        if(i>0) {
            return true;
        }
        return false;
    }

    @Override
    public List<String> listElections() {
        String sql="select name from elections";
        List<String> elections=null;
        elections=jdbcTemplateObj.query(sql, new ElectionMapper());
        return elections;
    }

    @Override
    public List<String> listParties() {
        String sql="select name from party";
        List<String> party=null;
        party=jdbcTemplateObj.query(sql, new PartyMapper());
        return party;
    }

    @Override
    public List<Person> listVoters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAdmin(String uname) {
        String sql="select admin from users where username = ?";
        String x="";
        x=jdbcTemplateObj.queryForObject(sql, new Object[] {uname}, String.class);
        if(x.equals("y")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validVoter(String uname, String pass) {
        String sql="select count(*) from users where username = ? and password = ?";
        int i=0;
        i=jdbcTemplateObj.queryForObject(sql, new Object[] {uname,pass}, Integer.class);
        if(i==1) {
            return true;
        }
        return false;
    }
    
}

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

/**
 *
 * @author vaibhav
 */
public interface DAO {
    public void addVoter(String uname,String pass);
    public void addParty(String name);
    public void addElection(String name);
    public void delVoter(String uname);
    public void delParty(String name);
    public void delElection(String name);
    public void markVoted(String user,String election);
    public boolean ifVoted(String user,String election);
    public List<Election> listElections();
    public List<Party> listParties();
    public List<Person> listVoters();
    public boolean isAdmin(String uname);
    public boolean validVoter(String uname,String pass);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaibhav.JDBC;

import com.vaibhav.POJO.Party;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vaibhav
 */
public class PartyMapper implements RowMapper<Party>{

    @Override
    public Party mapRow(ResultSet rs, int i) throws SQLException {
        Party party=new Party();
        party.setName(rs.getString("name"));
        return party;
    }
    
}

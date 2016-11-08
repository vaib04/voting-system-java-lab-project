/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaibhav.JDBC;

import com.vaibhav.POJO.Election;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vaibhav
 */
public class ElectionMapper implements RowMapper<String> {

    @Override
    public String mapRow(ResultSet rs, int i) throws SQLException {
        return rs.getString("name");
    }

    

}

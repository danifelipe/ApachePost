/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apachecommpos;
import java.io.IOException;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;



/**
 *
 * @author DanielSF
 */

public class ApacheCommPos {
    public static BasicDataSource ds;
    public ApacheCommPos() throws IOException, SQLException {
        ds = new BasicDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUsername("hvt_clinico_win");
        ds.setPassword("hvt_clinico_win");
        ds.setUrl("jdbc:postgresql://132.147.180.52:5432/DanielR");
       
     // the settings below are optional -- dbcp can work with defaults
        ds.setMinIdle(5);
        ds.setMaxIdle(20);
        ds.setMaxOpenPreparedStatements(180);
    }
    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }
     

}
    


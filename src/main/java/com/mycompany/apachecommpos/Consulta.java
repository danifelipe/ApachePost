/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apachecommpos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author DanielSF
 */
public class Consulta {
    Connection conexion;
    public Consulta() throws IOException, SQLException{
        ApacheCommPos objeto = new ApacheCommPos();
        conexion = objeto.getConnection();
    }

    public void conexion() throws SQLException, IOException{
        
        Statement stmt = conexion.createStatement();
//        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
//        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
//        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");
//        while (rs.next()) {
//            System.out.println("Read from DB: " + rs.getTimestamp("tick") + "\n");
//        }
        //Connection conexion = 
    }
   
   
}

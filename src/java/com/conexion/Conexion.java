/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexander
 */
public class Conexion {
    
    private Connection con = null;
    
    public Conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.24:3306/TallerJSP", "root", "Zun3hd**");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public Connection getConexion(){
        return con;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

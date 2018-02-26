/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexander
 */
public class Usuario {

    public static boolean agregarUsuario(BeanUsuario usuario) {
        boolean agregado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                st.executeUpdate("INSERT INTO datos VALUES(NULL,'"+usuario.getNombre()
                        + "','" + usuario.getApellido() + "','" + usuario.getEdad() + "','" + usuario.getCorreo()
                        + "','" + usuario.getUsuario() + "','" + usuario.getClave() + "')");
                agregado = true;
                st.close();
            }
            c.cerrarConexion();
        } catch (SQLException ex) {
            agregado = false;
            ex.printStackTrace();
        }
        return agregado;
    }
}

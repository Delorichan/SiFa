/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuajj
 */
public class ConexionMySQL{
    String user="root";
    String password="";
    String database="sifa";
    String url="jdbc:mysql://localhost/"+database;
    Connection conexion=null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion=(Connection) DriverManager.getConnection(url, user, password);
            if(conexion!=null){
                //JOptionPane.showMessageDialog(null, "Conexion Exitosa.."+database);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "No se puso establecer la conexion "+e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
}

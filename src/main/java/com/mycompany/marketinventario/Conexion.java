/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marketinventario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author borys
 */
public class Conexion {
    Connection conectar = null;
    String usuario="root";
    String contrasenia="root";
    String bd="inventory";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection establecerConexion(){
        try{
            Class.forName("com.mysql.jdb.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos, error"+e.toString());
        }
        
        return conectar;
    }
}

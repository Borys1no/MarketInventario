/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marketinventario;

import vista.Log_in;


/**
 *
 * @author borys
 */
public class MarketInventario {

    public static void main(String[] args) {
        Log_in lgn = new Log_in();
        lgn.setVisible(true);//hacemos visible la ventana
        
        //conexion 
        Conexion objetoConexion = new Conexion();
        objetoConexion.establecerConexion();
    }
}

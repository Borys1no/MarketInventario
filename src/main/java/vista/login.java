/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class login extends JFrame {

    public login() {
        this.setSize(500, 500); //establecemos el tamano de la ventana 
        setLocationRelativeTo(null); //establecemos la pantalla en el centro 

        setTitle("Inicie sesión"); //titulo de la ventana

        setResizable(false);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel(); //creacion de panel
        panel.setBackground(Color.WHITE); //establecemos el color del panel 
        this.getContentPane().add(panel); //agregamos el panel a la ventana
        
        JLabel etiqueta = new JLabel();
        

    }

}

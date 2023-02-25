/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       // panel.setLayout(null); //para desactivar y asi poder mover los componentes
        panel.setBackground(Color.WHITE); //establecemos el color del panel 
        this.getContentPane().add(panel); //agregamos el panel a la ventana
        //etiqueta usuario
        JLabel textName = new JLabel("Market Inventory",SwingConstants.CENTER);
        
        //textName.setText("Market Inventory");
        textName.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        //etiqueta.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT); con esto podemos mover los componentes a cualquier direccion 
        
        // texto usuario
        JLabel textUsuario = new JLabel();
        textUsuario.setText("Usuario");
        textUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
        //campo texto usuario
        
        JTextField txtUsuario = new JTextField();
        txtUsuario.setPreferredSize(new Dimension(200,30));
        
        
        //agregamos los componentes al panel 
        panel.add(textName); 
        panel.add(textUsuario);
        panel.add(txtUsuario);
        

    }

}

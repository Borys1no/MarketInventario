/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;

public class home extends JFrame {



        public home() {
            // Creamos los componentes
            JLabel labelTitulo = new JLabel("Market Inventory");
            JLabel labelUsuario = new JLabel("Usuario:");
            JTextField campoUsuario = new JTextField(10);
            JLabel labelContrasena = new JLabel("Contraseña:");
            JPasswordField campoContrasena = new JPasswordField(10);
            JButton botonIngresar = new JButton("Ingresar");

            // Creamos el panel que contendrá los componentes.
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            // Agregamos los componentes al panel.
            panel.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en blanco
            panel.add(labelTitulo);
            panel.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en blanco
            panel.add(labelUsuario);
            panel.add(campoUsuario);
            panel.add(labelContrasena);
            panel.add(campoContrasena);
            panel.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en blanco
            panel.add(botonIngresar);

            // Centramos el panel en la ventana.
            add(panel, BorderLayout.CENTER);

            // Establecemos el tamaño de la ventana.
            setSize(300, 300);

            // Centramos la ventana en la pantalla.
            setLocationRelativeTo(null);

            // Hacemos visible la ventana.
            setVisible(true);

            // Establecemos la operación por defecto al cerrar la ventana.
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public static void main(String[] args) {
            new home();
        }
    }



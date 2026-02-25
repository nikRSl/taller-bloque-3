package sistema.vista;

import sistema.servicio.SistemaAutenticacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame {

    private JTextField campoCorreo;
    private JPasswordField campoContraseña;
    private JButton botonLogin;
    private JLabel etiquetaResultado;

    public VentanaLogin() {

        setTitle("Sistema de Cursos");
        setSize(300,250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiquetaCorreo = new JLabel("Correo:");
        etiquetaCorreo.setBounds(20,30,100,20);
        add(etiquetaCorreo);

        campoCorreo = new JTextField();
        campoCorreo.setBounds(120,30,140,20);
        add(campoCorreo);

        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        etiquetaContraseña.setBounds(20,70,100,20);
        add(etiquetaContraseña);

        campoContraseña = new JPasswordField();
        campoContraseña.setBounds(120,70,140,20);
        add(campoContraseña);

        botonLogin = new JButton("Iniciar Sesión");
        botonLogin.setBounds(80,110,140,30);
        add(botonLogin);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(80,160,200,20);
        add(etiquetaResultado);

        botonLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String correo = campoCorreo.getText();
                String contraseña = new String(campoContraseña.getPassword());

                SistemaAutenticacion sistema = new SistemaAutenticacion();

                boolean acceso = sistema.validarUsuario(correo,contraseña);

                if(acceso){
                    etiquetaResultado.setText("Acceso permitido");
                }else{
                    etiquetaResultado.setText("Acceso denegado");
                }

            }
        });

        setVisible(true);
    }
}

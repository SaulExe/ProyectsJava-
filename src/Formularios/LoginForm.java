package Formularios;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Clases.consultas;
import interfacesGraficas.Menu; // Asegúrate de importar la clase Menu


import java.awt.Font;
import java.awt.Color;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

    private JFrame frame;
    private JTextField txtUserCreado;
    private JPasswordField txtPassCreado;
    private registroForm registroFormInstance;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm window = new LoginForm();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 847, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 0, 128));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblAcceso = new JLabel("LOGIN");
        lblAcceso.setForeground(Color.WHITE);
        lblAcceso.setFont(new Font("Lucida Sans", Font.BOLD, 24));
        lblAcceso.setBounds(185, 10, 100, 29);
        panel.add(lblAcceso);

        URL userIconUrl = getClass().getResource("/Images/logoInicio2.png");
        if (userIconUrl != null) {
            ImageIcon originalIcon = new ImageIcon(userIconUrl);
            Image image = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            JLabel lblUserIcon = new JLabel(new ImageIcon(image));
            lblUserIcon.setBounds(170, 51, 100, 100);
            panel.add(lblUserIcon);
        } else {
            System.err.println("Error: Image /Images/logoInicio2.png not found.");
        }

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        lblUsuario.setBounds(193, 163, 61, 17);
        panel.add(lblUsuario);

        txtUserCreado = new JTextField();
        txtUserCreado.setHorizontalAlignment(JTextField.CENTER);
        txtUserCreado.setForeground(Color.WHITE);
        txtUserCreado.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        txtUserCreado.setBackground(new Color(64, 0, 128));
        txtUserCreado.setBounds(135, 190, 180, 40);
        panel.add(txtUserCreado);
        txtUserCreado.setColumns(10);

        JSeparator separator1 = new JSeparator();
        separator1.setForeground(Color.WHITE);
        separator1.setBackground(Color.WHITE);
        separator1.setBounds(135, 211, 180, 2);
        panel.add(separator1);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setForeground(Color.WHITE);
        lblPass.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        lblPass.setBounds(174, 240, 100, 17);
        panel.add(lblPass);

        txtPassCreado = new JPasswordField();
        txtPassCreado.setHorizontalAlignment(JTextField.CENTER);
        txtPassCreado.setForeground(Color.WHITE);
        txtPassCreado.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        txtPassCreado.setBackground(new Color(64, 0, 128));
        txtPassCreado.setBounds(135, 267, 180, 40);
        panel.add(txtPassCreado);

        JSeparator separator2 = new JSeparator();
        separator2.setForeground(Color.WHITE);
        separator2.setBackground(Color.WHITE);
        separator2.setBounds(135, 273, 180, 2);
        panel.add(separator2);

        JButton btnEntry = new JButton("Iniciar sesión");
        btnEntry.addActionListener(new ActionListener() {
        	
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUserCreado.getText();
                String clave = new String(txtPassCreado.getPassword());

                consultas con = new consultas();
                if (con.verificarUsuario(usuario, clave)) {
                    frame.setVisible(false);
                    Menu menu = new Menu(); // Cambia Principal por Menu
                    menu.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);                
                }
            }
        });
        btnEntry.setForeground(Color.WHITE);
        btnEntry.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnEntry.setBackground(new Color(81, 84, 255));
        btnEntry.setBounds(135, 364, 180, 42);
        panel.add(btnEntry);

        JLabel lblForgotPass = new JLabel("¿Olvidaste tu contraseña?");
        lblForgotPass.setForeground(Color.WHITE);
        lblForgotPass.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        lblForgotPass.setBounds(135, 445, 200, 17);
        panel.add(lblForgotPass);

        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);  
                if (registroFormInstance == null) {
                    registroFormInstance = new registroForm(LoginForm.this);
                }
                registroFormInstance.setVisible(true);  
            }
        });
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnRegistrar.setBackground(new Color(64, 0, 128));
        btnRegistrar.setBounds(135, 473, 180, 42);
        panel.add(btnRegistrar);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(408, 0, 425, 563);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblSistemaInventaio = new JLabel("SISTEMA INVENTARIO");
        lblSistemaInventaio.setBounds(77, 85, 298, 30);
        lblSistemaInventaio.setForeground(new Color(0, 0, 0));
        lblSistemaInventaio.setFont(new Font("Lucida Sans", Font.BOLD, 24));
        panel_1.add(lblSistemaInventaio);

        JLabel lblImgCarrito = new JLabel();
        URL carritoIconUrl = getClass().getResource("/Images/carrito3.png");
        if (carritoIconUrl != null) {
            ImageIcon carritoIcon = new ImageIcon(carritoIconUrl);
            Image carritoImage = carritoIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            lblImgCarrito.setIcon(new ImageIcon(carritoImage));
        } else {
            System.err.println("Error: Image /Images/carritoCompras.png not found.");
        }
        lblImgCarrito.setBounds(56, 149, 319, 257);
        panel_1.add(lblImgCarrito);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}

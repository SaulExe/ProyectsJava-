package Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import conexBD.consultas;

import java.net.URL;

import interfacesGraficas.Menu;

public class LoginForm {

    private JFrame frame;
    private JTextField txtUserCreado;
    private JPasswordField txtPassCreado;
    private registroForm registroFormInstance;
    private int xMouse, yMouse;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginForm window = new LoginForm();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true); // Elimina la barra de título por defecto
        frame.setBounds(100, 100, 847, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Panel de título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(64, 0, 128)); // Color de la barra de título
        titlePanel.setBounds(0, 0, 847, 30);
        titlePanel.setLayout(null);
        frame.getContentPane().add(titlePanel);

        // Botón de cerrar
        JButton btnClose = new JButton("X");
        btnClose.setBounds(809, 0, 38, 30);
        btnClose.setBackground(Color.RED);
        btnClose.setForeground(Color.WHITE);
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(e -> System.exit(0));
        titlePanel.add(btnClose);

        // Panel para arrastrar la ventana
        titlePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xMouse = e.getX();
                yMouse = e.getY();
            }
        });

        titlePanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                frame.setLocation(x - xMouse, y - yMouse);
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 0, 128));
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBounds(0, 30, 847, 570); // Ajustar la ubicación del panel

        JLabel lblAcceso = new JLabel("LOGIN");
        lblAcceso.setForeground(Color.WHITE);
        lblAcceso.setFont(new Font("Lucida Sans", Font.BOLD, 24));
        lblAcceso.setBounds(184, 28, 100, 29);
        panel.add(lblAcceso);

        // Label para la imagen de login
        JLabel imgLogin = new JLabel();
        imgLogin.setBounds(174, 63, 100, 100); // Ajusta el tamaño del JLabel
        panel.add(imgLogin);

        URL imgLoginUrl = getClass().getResource("/Images/logoInicio2.png");
        if (imgLoginUrl != null) {
            ImageIcon imgLoginIcon = new ImageIcon(imgLoginUrl);
            Image imgLoginImage = imgLoginIcon.getImage().getScaledInstance(imgLogin.getWidth(), imgLogin.getHeight(), Image.SCALE_SMOOTH);
            imgLogin.setIcon(new ImageIcon(imgLoginImage));
        } else {
            System.err.println("Error: Image /Images/logoInicio2.png not found.");
        }

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        lblUsuario.setBounds(194, 173, 61, 17);
        panel.add(lblUsuario);

        txtUserCreado = new JTextField();
        txtUserCreado.setHorizontalAlignment(JTextField.CENTER);
        txtUserCreado.setForeground(Color.WHITE);
        txtUserCreado.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        txtUserCreado.setBackground(new Color(64, 0, 128));
        txtUserCreado.setBounds(135, 200, 180, 40);
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
        lblPass.setBounds(174, 250, 100, 17);
        panel.add(lblPass);

        txtPassCreado = new JPasswordField();
        txtPassCreado.setHorizontalAlignment(JTextField.CENTER);
        txtPassCreado.setForeground(Color.WHITE);
        txtPassCreado.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        txtPassCreado.setBackground(new Color(64, 0, 128));
        txtPassCreado.setBounds(135, 277, 180, 40);
        panel.add(txtPassCreado);

        JButton btnEntry = new JButton("Iniciar sesión");
        btnEntry.addActionListener(e -> {
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
        btnRegistrar.addActionListener(e -> {
            frame.setVisible(false);
            if (registroFormInstance == null) {
                registroFormInstance = new registroForm(LoginForm.this);
            }
            registroFormInstance.setVisible(true);
        });
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnRegistrar.setBackground(new Color(64, 0, 128));
        btnRegistrar.setBounds(135, 473, 180, 42);
        panel.add(btnRegistrar);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(401, 28, 446, 572);
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
        lblImgCarrito.setBounds(56, 152, 319, 257);
        panel_1.add(lblImgCarrito);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}

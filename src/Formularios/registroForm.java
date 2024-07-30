package Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

import Clases.consultas;

public class registroForm {

    private JFrame frame;
    private JTextField txtNuevoPass;
    private JTextField txtNuevoUser;
    private LoginForm loginFormInstance;
    private int xMouse, yMouse;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                registroForm window = new registroForm(null);
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public registroForm(LoginForm loginForm) {
        this.loginFormInstance = loginForm;
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true); // Elimina la barra de título por defecto
        frame.setBounds(100, 100, 779, 344);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Panel de título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(64, 0, 128)); // Color de la barra de título
        titlePanel.setBounds(0, 0, 779, 30);
        titlePanel.setLayout(null);
        frame.getContentPane().add(titlePanel);

        // Botón de cerrar
        JButton btnClose = new JButton("X");
        btnClose.setBounds(741, 0, 38, 30);
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

        // Panel principal
        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 0, 128));
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBounds(0, 30, 779, 314); // Ajustar la ubicación del panel

        JLabel lblRegistro = new JLabel("REGISTRO");
        lblRegistro.setForeground(Color.WHITE);
        lblRegistro.setFont(new Font("Lucida Sans", Font.BOLD, 24));
        lblRegistro.setBounds(157, 31, 160, 38);
        panel.add(lblRegistro);

        JLabel lblNombreUsuario = new JLabel("Usuario:");
        lblNombreUsuario.setForeground(Color.WHITE);
        lblNombreUsuario.setFont(new Font("Lucida Sans", Font.BOLD, 18));
        lblNombreUsuario.setBounds(65, 92, 81, 20);
        panel.add(lblNombreUsuario);

        txtNuevoUser = new JTextField();
        txtNuevoUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtNuevoUser.setBackground(new Color(64, 0, 128));
        txtNuevoUser.setForeground(Color.WHITE);
        txtNuevoUser.setBorder(null);
        txtNuevoUser.setBounds(196, 79, 180, 33);
        panel.add(txtNuevoUser);
        txtNuevoUser.setColumns(10);

        JSeparator separator1 = new JSeparator();
        separator1.setBackground(new Color(255, 255, 255));
        separator1.setForeground(new Color(255, 255, 255));
        separator1.setBounds(196, 110, 180, 2);
        panel.add(separator1);

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setForeground(Color.WHITE);
        lblClave.setFont(new Font("Lucida Sans", Font.BOLD, 18));
        lblClave.setBounds(65, 164, 101, 20);
        panel.add(lblClave);

        txtNuevoPass = new JTextField();
        txtNuevoPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtNuevoPass.setBackground(new Color(64, 0, 128));
        txtNuevoPass.setForeground(Color.WHITE);
        txtNuevoPass.setBorder(null);
        txtNuevoPass.setBounds(196, 139, 180, 33);
        panel.add(txtNuevoPass);
        txtNuevoPass.setColumns(10);

        JSeparator separator2 = new JSeparator();
        separator2.setBackground(new Color(255, 255, 255));
        separator2.setForeground(new Color(255, 255, 255));
        separator2.setBounds(196, 182, 180, 2);
        panel.add(separator2);

        JButton btnGuardar = new JButton("Registrarse");
        btnGuardar.addActionListener(e -> {
            consultas con = new consultas();
            con.guardarUsuario(txtNuevoUser.getText(), txtNuevoPass.getText());

            txtNuevoUser.setText("");
            txtNuevoPass.setText("");

            frame.setVisible(false);
            if (loginFormInstance != null) {
                loginFormInstance.setVisible(true);
            }
        });
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnGuardar.setBackground(new Color(64, 0, 128));
        btnGuardar.setBounds(209, 241, 132, 38);
        panel.add(btnGuardar);

        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(e -> {
            frame.setVisible(false);
            if (loginFormInstance != null) {
                loginFormInstance.setVisible(true);
            }
        });
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnVolver.setBackground(new Color(64, 0, 128));
        btnVolver.setBounds(53, 241, 110, 38);
        panel.add(btnVolver);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(443, 0, 336, 344);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(registroForm.class.getResource("/Images/logoRegistrarse.png")));
        lblNewLabel.setBounds(44, 58, 268, 235);
        panel_1.add(lblNewLabel);

        JSeparator separator2_1 = new JSeparator();
        separator2_1.setForeground(Color.WHITE);
        separator2_1.setBackground(Color.WHITE);
        separator2_1.setBounds(196, 122, 180, 2);
        panel.add(separator2_1);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}

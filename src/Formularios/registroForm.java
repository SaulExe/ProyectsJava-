package Formularios;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Clases.consultas;

import java.awt.Font;
import java.awt.Color;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registroForm {

    private JFrame frame;
    private JTextField txtNuevoPass;
    private JTextField txtNuevoUser;
	private LoginForm loginFormInstance;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registroForm window = new registroForm(null);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

  
    public registroForm(LoginForm loginForm) {
        this.loginFormInstance = loginForm;
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 779, 344);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 0, 128));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblRegistro = new JLabel("REGISTRO\r\n");
        lblRegistro.setForeground(Color.WHITE);
        lblRegistro.setFont(new Font("Lucida Sans", Font.BOLD, 24));
        lblRegistro.setBounds(159, 22, 160, 38);
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
        btnGuardar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		consultas con = new consultas();
        		con.guardarUsuario(txtNuevoUser.getText(), txtNuevoPass.getText());
        		
        		txtNuevoUser.setText("");
                txtNuevoPass.setText("");
                
                frame.setVisible(false);  
                if (loginFormInstance != null) {
                    loginFormInstance.setVisible(true);  
                }
                
        		
        	}
        });
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnGuardar.setBackground(new Color(64, 0, 128));
        btnGuardar.setBounds(209, 241, 132, 38);
        panel.add(btnGuardar);

        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	frame.setVisible(false);  
            if (loginFormInstance != null) {
                loginFormInstance.setVisible(true);  
            }
        	}
        });
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        btnVolver.setBackground(new Color(64, 0, 128));
        btnVolver.setBounds(53, 241, 110, 38);
        panel.add(btnVolver);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(443, 0, 322, 307);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(registroForm.class.getResource("/Images/logoRegistrarse.png")));
        lblNewLabel.setBounds(31, 22, 268, 235);
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

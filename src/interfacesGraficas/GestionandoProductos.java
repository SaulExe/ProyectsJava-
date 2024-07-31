package interfacesGraficas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionandoProductos {

    public JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GestionandoProductos window = new GestionandoProductos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GestionandoProductos() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(64, 0, 128));
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Gestion Productos");
        lblNewLabel.setBounds(70, 24, 290, 37);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Mostrar Tabla Productos");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.setVisible(false);
        		tablaGestionProductos tabGestProd = new tablaGestionProductos();
        		tabGestProd.frame.setVisible(true);
        		
        	}
        });
        btnNewButton.setBackground(new Color(128, 0, 255));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBounds(70, 115, 257, 120);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(btnNewButton);

        JButton btnActualizarProducto = new JButton("Actualizar Producto");
        btnActualizarProducto.setBackground(new Color(128, 0, 255));
        btnActualizarProducto.setForeground(new Color(255, 255, 255));
        btnActualizarProducto.setBounds(70, 254, 257, 120);
        btnActualizarProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(btnActualizarProducto);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
                MenuProductos menuProd = new MenuProductos();
                menuProd.frame.setVisible(true);
        	}
        });
        btnVolver.setBounds(10, 485, 85, 21);
        frame.getContentPane().add(btnVolver);

        // Configurar tamaño y posición de la ventana
        frame.setBounds(100, 100, 415, 553); // Establece las dimensiones de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }
}

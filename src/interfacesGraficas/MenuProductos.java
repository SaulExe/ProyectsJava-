package interfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import Formularios.LoginForm;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MenuProductos {

	public JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProductos window = new MenuProductos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MenuProductos() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setForeground(new Color(255, 255, 255));
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblProductos.setBounds(290, 52, 275, 43);
		frame.getContentPane().add(lblProductos);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Menu menu = new Menu();
                menu.setVisible(true);
			}
		});
		btnVolver.setBackground(new Color(128, 0, 255));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBounds(10, 412, 90, 33);
		frame.getContentPane().add(btnVolver);
		
		JLabel imgProductos = new JLabel("New label");
		imgProductos.setIcon(new ImageIcon(MenuProductos.class.getResource("/Images/productosPrincipal.png")));
		imgProductos.setBounds(192, 29, 97, 82);
		
		ImageIcon originalIcon = new ImageIcon(Menu.class.getResource("/Images/sisInventario.png"));
        Image image = originalIcon.getImage().getScaledInstance(imgProductos.getWidth(), imgProductos.getHeight(), Image.SCALE_SMOOTH);
        imgProductos.setIcon(new ImageIcon(image));
		frame.getContentPane().add(imgProductos);
		
		JButton btnAñadirProducto = new JButton("Nuevo Producto");
		btnAñadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				AñadiendoNuevoProducto nuevoProd = new AñadiendoNuevoProducto();
                nuevoProd.frame.setVisible(true);
				
			}
		});
		btnAñadirProducto.setForeground(new Color(255, 255, 255));
		btnAñadirProducto.setBackground(new Color(64, 0, 128));
		btnAñadirProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAñadirProducto.setBounds(154, 147, 213, 144);
		frame.getContentPane().add(btnAñadirProducto);
		
		JButton btnGestionProducto = new JButton("Gestionar Productos");
		btnGestionProducto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				GestionandoProductos gestProd = new GestionandoProductos();
				gestProd.frame.setVisible(true);
				
			}
		});
		btnGestionProducto.setForeground(new Color(255, 255, 255));
		btnGestionProducto.setBackground(new Color(64, 0, 128));
		btnGestionProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGestionProducto.setBounds(424, 147, 204, 144);
		frame.getContentPane().add(btnGestionProducto);
		frame.setBounds(100, 100, 790, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

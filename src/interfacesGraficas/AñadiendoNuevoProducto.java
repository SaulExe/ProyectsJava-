package interfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class AñadiendoNuevoProducto {

	public JFrame frame;
	private JTextField txtID;
	private JTextField txtNombreProd;
	/**
	 * @wbp.nonvisual location=212,-36
	 */
	private final JLabel lblProveedor_1 = new JLabel("Proveedor");
	private JTextField txtCantidad;
	private JTextField txtUnidadMedida;
	private JTextField txtCosto;
	private JTextField txtPrecioVenta;
	private JTextField txtSKU;
	private JTextField txtISBN;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadiendoNuevoProducto window = new AñadiendoNuevoProducto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AñadiendoNuevoProducto() {
		initialize();
	}


	private void initialize() {
		lblProveedor_1.setForeground(Color.WHITE);
		lblProveedor_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 0, 128));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNuevoProducto = new JLabel("Nuevo Producto");
		lblNuevoProducto.setForeground(new Color(255, 255, 255));
		lblNuevoProducto.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNuevoProducto.setBounds(292, 20, 267, 27);
		frame.getContentPane().add(lblNuevoProducto);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
                MenuProductos menuProd = new MenuProductos();
                menuProd.frame.setVisible(true);
			}
		});
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBackground(new Color(64, 0, 128));
		btnVolver.setBounds(735, 587, 114, 21);
		frame.getContentPane().add(btnVolver);
		
		txtID = new JTextField();
		txtID.setBounds(43, 132, 169, 27);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JLabel lblIDProducto = new JLabel("ID ");
		lblIDProducto.setForeground(new Color(255, 255, 255));
		lblIDProducto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIDProducto.setBounds(43, 109, 114, 13);
		frame.getContentPane().add(lblIDProducto);
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		lblNombreProducto.setForeground(Color.WHITE);
		lblNombreProducto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombreProducto.setBounds(43, 183, 169, 21);
		frame.getContentPane().add(lblNombreProducto);
		
		txtNombreProd = new JTextField();
		txtNombreProd.setColumns(10);
		txtNombreProd.setBounds(43, 214, 169, 27);
		frame.getContentPane().add(txtNombreProd);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCategoria.setBounds(43, 266, 169, 21);
		frame.getContentPane().add(lblCategoria);
		
		JComboBox cmbBoxCategoria = new JComboBox();
		cmbBoxCategoria.setBounds(43, 295, 169, 27);
		frame.getContentPane().add(cmbBoxCategoria);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setForeground(Color.WHITE);
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblProveedor.setBounds(43, 345, 169, 21);
		frame.getContentPane().add(lblProveedor);
		
		JComboBox cmbBoxProveedor = new JComboBox();
		cmbBoxProveedor.setBounds(43, 374, 169, 27);
		frame.getContentPane().add(cmbBoxProveedor);
		
		JTextArea txtAreaDescripProd = new JTextArea();
		txtAreaDescripProd.setBounds(43, 480, 267, 104);
		frame.getContentPane().add(txtAreaDescripProd);
		
		JLabel lblDescripcionProducto = new JLabel("Descripcion Producto");
		lblDescripcionProducto.setForeground(Color.WHITE);
		lblDescripcionProducto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDescripcionProducto.setBounds(43, 449, 215, 21);
		frame.getContentPane().add(lblDescripcionProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCantidad.setBounds(378, 109, 114, 13);
		frame.getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(378, 132, 169, 27);
		frame.getContentPane().add(txtCantidad);
		
		JLabel lblUnidadMedida = new JLabel("Unidad Medida");
		lblUnidadMedida.setForeground(Color.WHITE);
		lblUnidadMedida.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUnidadMedida.setBounds(378, 191, 169, 13);
		frame.getContentPane().add(lblUnidadMedida);
		
		txtUnidadMedida = new JTextField();
		txtUnidadMedida.setColumns(10);
		txtUnidadMedida.setBounds(378, 214, 169, 27);
		frame.getContentPane().add(txtUnidadMedida);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setForeground(Color.WHITE);
		lblCosto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCosto.setBounds(378, 272, 114, 13);
		frame.getContentPane().add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setColumns(10);
		txtCosto.setBounds(378, 295, 169, 27);
		frame.getContentPane().add(txtCosto);
		
		JLabel lblPrecioVenta = new JLabel("Precio Venta");
		lblPrecioVenta.setForeground(Color.WHITE);
		lblPrecioVenta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrecioVenta.setBounds(378, 351, 169, 13);
		frame.getContentPane().add(lblPrecioVenta);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setColumns(10);
		txtPrecioVenta.setBounds(378, 374, 169, 27);
		frame.getContentPane().add(txtPrecioVenta);
		
		JLabel lblUbicacionAlmacen = new JLabel("Ubicacion Almacen");
		lblUbicacionAlmacen.setForeground(Color.WHITE);
		lblUbicacionAlmacen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUbicacionAlmacen.setBounds(378, 449, 215, 21);
		frame.getContentPane().add(lblUbicacionAlmacen);
		
		JTextArea txtAreaUbicAlmac = new JTextArea();
		txtAreaUbicAlmac.setBounds(380, 480, 267, 104);
		frame.getContentPane().add(txtAreaUbicAlmac);
		
		JLabel lblSku = new JLabel("SKU");
		lblSku.setForeground(Color.WHITE);
		lblSku.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSku.setBounds(654, 109, 114, 13);
		frame.getContentPane().add(lblSku);
		
		txtSKU = new JTextField();
		txtSKU.setColumns(10);
		txtSKU.setBounds(654, 132, 169, 27);
		frame.getContentPane().add(txtSKU);
		
		JLabel lblUpceanisbn = new JLabel("UPC/EAN/ISBN");
		lblUpceanisbn.setForeground(Color.WHITE);
		lblUpceanisbn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUpceanisbn.setBounds(654, 191, 169, 13);
		frame.getContentPane().add(lblUpceanisbn);
		
		txtISBN = new JTextField();
		txtISBN.setColumns(10);
		txtISBN.setBounds(654, 214, 169, 27);
		frame.getContentPane().add(txtISBN);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(281, 57, 287, 13);
		frame.getContentPane().add(separator);
		
		JLabel imgNuevoProd = new JLabel("");
		imgNuevoProd.setIcon(new ImageIcon(AñadiendoNuevoProducto.class.getResource("/Images/nuevoProducto.png")));
		imgNuevoProd.setBounds(192, 10, 90, 60);
		ImageIcon originalIcon = new ImageIcon(Menu.class.getResource("/Images/nuevoProducto.png"));
        Image image = originalIcon.getImage().getScaledInstance(imgNuevoProd.getWidth(), imgNuevoProd.getHeight(), Image.SCALE_SMOOTH);
        imgNuevoProd.setIcon(new ImageIcon(image));
		frame.getContentPane().add(imgNuevoProd);
		frame.getContentPane().add(imgNuevoProd);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCrear.setBounds(654, 351, 169, 63);
		frame.getContentPane().add(btnCrear);
		frame.setBounds(100, 100, 873, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

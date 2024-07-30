package interfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private int xMouse, yMouse;

    public Menu() {
        // Llamar a setUndecorated(true) antes de setVisible(true)
        this.setUndecorated(true);

        // Configuración del contenido
        getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().setForeground(new Color(255, 255, 255));
        getContentPane().setBackground(new Color(64, 0, 128));
        getContentPane().setLayout(null);

        // Panel de título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(64, 0, 128)); // Color de la barra de título
        titlePanel.setBounds(0, 0, 843, 30);
        titlePanel.setLayout(null);
        getContentPane().add(titlePanel);

        // Botón de cerrar
        JButton btnClose = new JButton("X");
        btnClose.setBounds(805, 0, 38, 30);
        btnClose.setBackground(Color.RED);
        btnClose.setForeground(Color.WHITE);
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(e -> System.exit(0)); // Cierra la aplicación
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
                setLocation(x - xMouse, y - yMouse);
            }
        });

        
        JButton btnProducto = new JButton("Producto");
        btnProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnProducto.setForeground(new Color(255, 255, 255));
        btnProducto.setBackground(new Color(64, 0, 128));
        btnProducto.setBounds(38, 197, 231, 151);
        getContentPane().add(btnProducto);

        JLabel lblNewLabel = new JLabel("Sistema de Inventario");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setBounds(299, 65, 420, 39);
        getContentPane().add(lblNewLabel);

        JLabel imgInventario = new JLabel();
        imgInventario.setBounds(181, 21, 107, 122);
        getContentPane().add(imgInventario);

        // Escalar la imagen al tamaño del JLabel
        ImageIcon originalIcon = new ImageIcon(Menu.class.getResource("/Images/sisInventario.png"));
        Image image = originalIcon.getImage().getScaledInstance(imgInventario.getWidth(), imgInventario.getHeight(), Image.SCALE_SMOOTH);
        imgInventario.setIcon(new ImageIcon(image));

        JButton btnEntradaSalidaProductos = new JButton("Entrada | Salida Productos");
        btnEntradaSalidaProductos.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnEntradaSalidaProductos.setForeground(new Color(255, 255, 255));
        btnEntradaSalidaProductos.setBackground(new Color(64, 0, 128));
        btnEntradaSalidaProductos.setBounds(38, 371, 231, 151);
        getContentPane().add(btnEntradaSalidaProductos);

        JButton btnProveedor = new JButton("Proveedor");
        btnProveedor.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnProveedor.setForeground(new Color(255, 255, 255));
        btnProveedor.setBackground(new Color(64, 0, 128));
        btnProveedor.setBounds(299, 197, 231, 151);
        getContentPane().add(btnProveedor);

        JButton btnStock = new JButton("Stock");
        btnStock.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnStock.setForeground(new Color(255, 255, 255));
        btnStock.setBackground(new Color(64, 0, 128));
        btnStock.setBounds(299, 371, 231, 151);
        getContentPane().add(btnStock);

        JButton btnCategoria = new JButton("Categoria");
        btnCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCategoria.setForeground(new Color(255, 255, 255));
        btnCategoria.setBackground(new Color(64, 0, 128));
        btnCategoria.setBounds(555, 197, 231, 151);
        getContentPane().add(btnCategoria);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCerrar.setForeground(new Color(255, 255, 255));
        btnCerrar.setBackground(new Color(64, 0, 128));
        btnCerrar.setBounds(555, 371, 231, 151);
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón cerrar si se requiere algo más
                System.exit(0); // Cierra la aplicación
            }
        });
        getContentPane().add(btnCerrar);

        configurarVentana();
        initComponents();
    }

    private void configurarVentana() {
        this.setSize(843, 597);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Inventario");
    }

    private void initComponents() {
        // Aquí puedes inicializar otros componentes si es necesario
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }
}

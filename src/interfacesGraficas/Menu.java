package interfacesGraficas;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

    public static JDesktopPane jDesktopPane_menu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_actualizar_producto;
    private javax.swing.JMenuItem jMenuItem_cerrar_seccion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_venta;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenu jMenu_cerrar_seccion;
    private javax.swing.JMenu jMenu_ver_historial;
    private javax.swing.JMenuItem jMenuItem_ver_historial;

    public Menu() {
        initComponents();
        configurarVentana();
    }

    private void configurarVentana() {
        this.setSize(new Dimension(928, 237));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");

        getContentPane().setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        getContentPane().add(jDesktopPane_menu);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_producto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_venta = new javax.swing.JMenuItem();
        jMenu_ver_historial = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        jMenu_cerrar_seccion = new javax.swing.JMenu();
        jMenuItem_cerrar_seccion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); 

        jMenu2.setText("Producto ");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_gestionar_producto.setText("Gestionar Producto ");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_actualizar_producto.setText("Actualizar Producto");
        jMenuItem_actualizar_producto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu2.add(jMenuItem_actualizar_producto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_gestionar_cliente.setText("Gestionar Cliente");
        jMenuItem_gestionar_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Categoría");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_nueva_categoria.setText("Nueva Categoría");
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_gestionar_categoria.setText("Gestionar Categoría");
        jMenuItem_gestionar_categoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Proveedor");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_nueva_venta.setText("Nuevo Proveedor");
        jMenuItem_nueva_venta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_gestionar_venta.setText("Gestionar Proveedor");
        jMenuItem_gestionar_venta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu5.add(jMenuItem_gestionar_venta);

        jMenuBar1.add(jMenu5);

        jMenu_ver_historial.setText("Historial");
        jMenu_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jMenu_ver_historial.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_ver_historial.setText("Ver Historial");
        jMenuItem_ver_historial.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ver_historial.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu_ver_historial);

        jMenu_cerrar_seccion.setText("Cerrar Sección");
        jMenu_cerrar_seccion.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jMenu_cerrar_seccion.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_cerrar_seccion.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jMenuItem_cerrar_seccion.setText("Cerrar Sección");
        jMenuItem_cerrar_seccion.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_cerrar_seccion.add(jMenuItem_cerrar_seccion);

        jMenuBar1.add(jMenu_cerrar_seccion);

        setJMenuBar(jMenuBar1);
        
        pack();
    }

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}

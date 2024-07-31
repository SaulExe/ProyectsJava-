package interfacesGraficas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tablaGestionProductos {

    public JFrame frame;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tablaGestionProductos window = new tablaGestionProductos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public tablaGestionProductos() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(64, 0, 128));
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Tabla Productos Creados");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(55, 33, 394, 31);
        frame.getContentPane().add(lblNewLabel);
        
        // Envolver la tabla en un JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(55, 93, 692, 169);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "ID", "Nombre", "Categoria", "Proveedor", "Cantidad", "UM", "Costo", "Precio Venta"
            }
        ));
        scrollPane.setViewportView(table);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                GestionandoProductos gestProd = new GestionandoProductos();
                gestProd.frame.setVisible(true);
            }
        });
        btnVolver.setBounds(10, 340, 85, 21);
        frame.getContentPane().add(btnVolver);
        
        frame.setBounds(100, 100, 820, 408);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

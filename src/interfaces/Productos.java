package interfaces;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Productos extends JDialog {
	
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Productos dialog = new Productos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Productos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton cargarProductos = new JButton("Nuevos Productos");
		cargarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cargarProductos.setBounds(10, 11, 134, 34);
		getContentPane().add(cargarProductos);
		
		JButton cargarPromocion = new JButton("Nueva Promocion");
		cargarPromocion.setBounds(171, 11, 134, 34);
		getContentPane().add(cargarPromocion);
		
		
		TableModel modelo = new tablaProducto();
		table = new JTable();
		table.setModel(modelo);
		table.setBounds(58, 167, 217, -14);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 99, 434, 162);
		getContentPane().add(scrollPane);
	}
}

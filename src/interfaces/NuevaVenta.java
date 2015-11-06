package interfaces;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import javax.swing.table.TableModel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaVenta extends JDialog {
	private JTable table;

	public NuevaVenta() {
		setModal(true);
		setBounds(100, 100, 526, 373);
		getContentPane().setLayout(null);
		
		JLabel ID_text = new JLabel("0");
		ID_text.setBounds(210, 11, 88, 22);
		getContentPane().add(ID_text);
		
		TableModel modelo = new TablaModelLinea();
		table = new JTable();
		table.setModel(modelo);
		table.setBounds(58, 167, 217, -14);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(22, 69, 478, 226);
		getContentPane().add(scrollPane);
		
		Button agregar = new Button("Agregar Producto");
		agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		agregar.setBounds(20, 41, 126, 22);
		getContentPane().add(agregar);
		
		Button cancelar = new Button("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		cancelar.setBounds(403, 302, 97, 22);
		getContentPane().add(cancelar);
		
		Button guardar = new Button("Guardar");
		guardar.setBounds(299, 301, 97, 22);
		getContentPane().add(guardar);

	}
}

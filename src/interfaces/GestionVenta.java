package interfaces;



import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GestionVenta extends JDialog {
	private JTable table;


	public GestionVenta() {
		setModal(true);
		setBounds(100, 100, 450, 421);
		getContentPane().setLayout(null);
		
		JButton btnNuevaVenta = new JButton("Nueva Venta");
		btnNuevaVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaVenta venta = new NuevaVenta();
				venta.setLocationRelativeTo(null);
				venta.setVisible(true);
			}
		});
		btnNuevaVenta.setBounds(22, 64, 176, 35);
		getContentPane().add(btnNuevaVenta);
		
		JButton btnNewButton = new JButton("VerVenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(256, 64, 157, 35);
		getContentPane().add(btnNewButton);
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setBounds(195, 11, 46, 14);
		getContentPane().add(lblVentas);
		
		TablaModelHistorialVenta modelo = new TablaModelHistorialVenta();
		table = new JTable();
		table.setModel(modelo);
		table.setBounds(86, 35, 34, -11);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 110, 414, 261);
		getContentPane().add(scrollPane);
		
		JButton volver = new JButton("");
		volver.setSelectedIcon(new ImageIcon(GestionVenta.class.getResource("/Iconos/returns-icon.png")));
		volver.setIcon(new ImageIcon(GestionVenta.class.getResource("/Iconos/returns-icon.png")));
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		volver.setBounds(20, 11, 33, 28);
		getContentPane().add(volver);
		
		table = new JTable();
		table.setBounds(228, 98, 1, 1);
		getContentPane().add(table);

	}

}

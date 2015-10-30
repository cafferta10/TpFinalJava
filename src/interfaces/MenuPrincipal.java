package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class MenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnRealizarVenta = new JButton("Realizar Venta");
		btnRealizarVenta.setBackground(new Color(0, 255, 0));
		btnRealizarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnRealizarVenta, BorderLayout.NORTH);
		
		JButton btnCargarStock = new JButton("Cargar Stock");
		btnCargarStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCargarStock.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(btnCargarStock, BorderLayout.SOUTH);
		
		JButton btnHistorialDePrecio = new JButton("Historial de Precio");
		btnHistorialDePrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHistorialDePrecio.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(btnHistorialDePrecio, BorderLayout.WEST);
		
		JButton btnCargarPromocion = new JButton("Cargar Promocion");
		btnCargarPromocion.setBackground(new Color(0, 255, 0));
		btnCargarPromocion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnCargarPromocion, BorderLayout.EAST);
		
		JLabel lblImagenmenu = new JLabel("imagenMenu");
		frame.getContentPane().add(lblImagenmenu, BorderLayout.CENTER);
	}

}

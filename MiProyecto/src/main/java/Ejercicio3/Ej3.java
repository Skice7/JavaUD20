package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ej3 extends JFrame {
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JButton boton1;
	private JButton boton2;
	private JPanel panel;

	public Ej3() {
		etiqueta1 = new JLabel("Boton1: 0 veces");
		etiqueta2 = new JLabel("Boton 2: 0 veces");
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		panel = new JPanel();

		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(boton1);
		panel.add(boton2);
		add(panel);

		accion btn1 = new accion(etiqueta1);
		accion btn2 = new accion(etiqueta2);
		boton1.addActionListener(btn1);
		boton2.addActionListener(btn2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio3");
		setSize(300, 300);
		setVisible(true);
	}

	
	public class accion implements ActionListener {
		private int numVeces;
		private JLabel etiqueta;

		public accion(JLabel etiqueta) {
			numVeces = 0;
			this.etiqueta = etiqueta;

		}

		
		public void actionPerformed(ActionEvent e) {
			numVeces++;
			JButton boton = (JButton) e.getSource();
			etiqueta.setText(boton.getText() + ": " + numVeces + " veces");
		}

	}
}
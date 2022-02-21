package Ej2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ej2 extends JFrame {

	private JLabel etiqueta;
	private JButton boton1;
	private JButton boton2;
	private JPanel panel;

	public Ej2() {
		etiqueta = new JLabel("No se ha pulsado ningun botón");
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		panel = new JPanel();
		panel.add(etiqueta);
		panel.add(boton1);
		panel.add(boton2);
		add(panel);
		accion boton = new accion(); 

		boton1.addActionListener(boton);
		boton2.addActionListener(boton);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ej2");
		setSize(300, 300);
		setVisible(true);
	}

	


	class accion implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			etiqueta.setText("Has pulsado el: " + boton.getText());

		}

	}

}
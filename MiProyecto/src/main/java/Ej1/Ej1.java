package Ej1;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JLabel;

public class Ej1 extends JFrame  {
	private JLabel etiqueta;
	
	public Ej1(){
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		etiqueta = new JLabel("Ventana");
		add(etiqueta);
	
		
	}
	
	
}

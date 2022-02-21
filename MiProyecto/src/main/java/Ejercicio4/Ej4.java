package Ejercicio4;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// import java.util.concurrent.TimeUnit; estaba probando cosas de para procesos con el sleep.

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Ej4 extends JFrame implements WindowListener {

	private JTextArea areaTexto;
	private JLabel etiqueta;
	private JPanel panel;
	private final String FIN = "\n";
	

	public Ej4() {
		etiqueta = new JLabel("Eventos");
		areaTexto = new JTextArea(10, 50);

		areaTexto.setText("Texto inicial");
		panel = new JPanel();

		panel.add(etiqueta);
		panel.add(areaTexto);
		add(panel);

		addWindowListener(this);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("Ej4");
		setVisible(true);
		pack();
	}

	public void windowActivated(WindowEvent e) {
		areaTexto.append(FIN + "Ventana activada");

	}

	public void windowClosed(WindowEvent e) {
		areaTexto.append(FIN + "Ventana cerrada");

	}

	public void windowClosing(WindowEvent e) {
		areaTexto.append(FIN + "Ventana cerrandose");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Ventana Cerrada");
				
	}

		public void windowDeactivated(WindowEvent e) {
		areaTexto.append(FIN + "Ventana desactivada");

	}

	public void windowDeiconified(WindowEvent e) {
		areaTexto.append(FIN + "Ventana desiconizada");

	}

	public void windowIconified(WindowEvent e) {
		areaTexto.append(FIN + "Ventana iconizada");

	}

	public void windowOpened(WindowEvent e) {
		areaTexto.append(FIN + "Ventana abierta");

	}

	
}
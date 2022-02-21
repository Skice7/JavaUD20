package ud20.ud20_act6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField altura;
	private JTextField peso;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_altura = new JLabel("Altura (m)");
		lblNewLabel_altura.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_altura.setBounds(38, 29, 65, 14);
		contentPane.add(lblNewLabel_altura);
		
		JLabel lblNewLabel_peso = new JLabel("Peso (kg)");
		lblNewLabel_peso.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_peso.setBounds(221, 29, 65, 14);
		contentPane.add(lblNewLabel_peso);
		
		altura = new JTextField();
		altura.setBounds(115, 26, 96, 20);
		contentPane.add(altura);
		altura.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(296, 26, 96, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

				double resultado = Double.parseDouble(peso.getText()) / Math.pow(Double.parseDouble(altura.getText()),2);
				String res = resultado + "";
				result.setText(res);
			}
		});
		
		btnNewButton.setBounds(101, 82, 96, 95);
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		result.setBounds(233, 119, 96, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}

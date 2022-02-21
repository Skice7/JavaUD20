package ud20.ud20_act7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista extends JFrame {

	private JPanel contentPane;
	public JTextField convertir;
	private JTextField result;
	int tipo = 0;
	JFrame jFrame = new JFrame();
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
		
		JLabel lblNewLabel = new JLabel("cantidad a convertir");
		lblNewLabel.setBounds(30, 30, 101, 14);
		contentPane.add(lblNewLabel);
		
		convertir = new JTextField();
		convertir.setBounds(143, 27, 96, 20);
		contentPane.add(convertir);
		convertir.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("resultado");
		lblNewLabel_1.setBounds(256, 30, 47, 14);
		contentPane.add(lblNewLabel_1);
		
		result = new JTextField();
		result.setBounds(313, 27, 96, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		final JButton btnNewButton = new JButton("euros a pesetas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado;
				if (tipo == 0) {
					resultado = Double.parseDouble(convertir.getText())* 166.386;
					result.setText(resultado +"");
				}else {
					resultado = Double.parseDouble(convertir.getText()) / 166.386;
					result.setText(resultado +"");
				}
			}
		});
		btnNewButton.setBounds(98, 76, 112, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cambiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try{
			        Double.parseDouble(convertir.getText());
			        
			    }catch(NumberFormatException e1){
			        JOptionPane.showMessageDialog(jFrame, "ha habido un problema");

			    }	
				if (Integer.parseInt(convertir.getText())<0){
			        JOptionPane.showMessageDialog(jFrame, "ha habido un problema");
				}else if(tipo == 0) {
				
					btnNewButton.setText("pesetas a euros");
					tipo = 1;
				}else {
					btnNewButton.setText("euros a pesetas");
					tipo = 0;
				}
			}
		});
		btnNewButton_1.setBounds(244, 76, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir.setText("");
				result.setText("");
			}
		});
		btnNewButton_2.setBounds(185, 125, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}

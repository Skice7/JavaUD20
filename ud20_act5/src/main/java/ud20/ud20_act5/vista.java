package ud20.ud20_act5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"Has clicado, ");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textField.setText(textField.getText()+"El raton ha entrado, ");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textField.setText(textField.getText()+"El raton ha salido, ");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText()+"El raton ha presionado, ");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textField.setText(textField.getText()+"El raton ha soltado, ");
			}
		});
		textField.setBounds(0, 72, 436, 168);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton.setBounds(173, 24, 89, 23);
		contentPane.add(btnNewButton);
	}
}

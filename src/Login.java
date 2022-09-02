import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(-10, 0, 207, 306);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblNewLabel = new JLabel("PharmaC");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -41, SpringLayout.EAST, panel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel.add(lblNewLabel);

		JLabel lblSystem = new JLabel("");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSystem, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSystem, 0, SpringLayout.WEST, panel);
		lblSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystem.setForeground(Color.WHITE);
		lblSystem.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel.add(lblSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel_1.setBounds(196, 0, 233, 306);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(83, 30, 64, 32);
		lblNewLabel_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("UId");
		lblNewLabel_1_1.setBounds(30, 105, 23, 20);
		lblNewLabel_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_1.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(84, 105, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setBounds(10, 147, 64, 20);
		lblNewLabel_1_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_1.add(lblNewLabel_1_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(83, 149, 87, 20);
		passwordField.setEchoChar('*');
		panel_1.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setBounds(45, 226, 74, 30);
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBackground(new Color(34, 139, 34));
		btnNewButton_1.setBounds(129, 226, 74, 30);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_1.add(btnNewButton_1);

		JLabel lblNewLabel_1_2 = new JLabel("X");
		lblNewLabel_1_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(198, 0, 64, 32);
		panel_1.add(lblNewLabel_1_2);
		this.setLocationRelativeTo(null);
	}
}

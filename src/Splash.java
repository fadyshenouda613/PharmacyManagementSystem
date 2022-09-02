import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class Splash extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
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
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Pharma Management System");
		lblNewLabel.setBounds(189, 11, 305, 27);
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(132, 49, 385, 238);
		ImageIcon newImage = new ImageIcon(
				"C:\\Users\\fadys\\eclipse-workspace\\PharmacyManagement\\resources\\pharmacylogo.png");
		Image image = newImage.getImage();
		Image scaledImage = image.getScaledInstance(400, 200, Image.SCALE_DEFAULT);
		newImage = new ImageIcon(scaledImage);
		lblNewLabel_1.setIcon(newImage);
		contentPane.setLayout(null);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(34, 139, 34));
		progressBar.setBounds(0, 333, 690, 6);
		contentPane.add(progressBar);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);

		JLabel lblX = new JLabel("X");
		lblX.setForeground(new Color(34, 139, 34));
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblX.setBounds(654, 8, 23, 33);
		contentPane.add(lblX);
		this.setLocationRelativeTo(null);
	}
}

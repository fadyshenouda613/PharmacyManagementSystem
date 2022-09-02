import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Company extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Company frame = new Company();
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
	public Company() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 559);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(19, 19, 19, 19));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(0, 0, 123, 559);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{48, 0};
		gbl_panel.rowHeights = new int[]{41, 41, 41, 0, 59, 0, 54, 46, 75, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("COMPANY");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblSelling = new JLabel("SELLING");
		lblSelling.setForeground(Color.WHITE);
		lblSelling.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblSelling = new GridBagConstraints();
		gbc_lblSelling.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelling.fill = GridBagConstraints.BOTH;
		gbc_lblSelling.gridx = 0;
		gbc_lblSelling.gridy = 6;
		panel.add(lblSelling, gbc_lblSelling);
		
		JLabel lblAgents = new JLabel("AGENTS");
		lblAgents.setForeground(Color.WHITE);
		lblAgents.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblAgents = new GridBagConstraints();
		gbc_lblAgents.insets = new Insets(0, 0, 5, 0);
		gbc_lblAgents.anchor = GridBagConstraints.NORTH;
		gbc_lblAgents.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAgents.gridx = 0;
		gbc_lblAgents.gridy = 8;
		panel.add(lblAgents, gbc_lblAgents);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(148, 21, 711, 373);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MANAGE COMPANIES");
		lblNewLabel_2.setBounds(240, 30, 264, 32);
		lblNewLabel_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setBounds(0, 87, 71, 20);
		lblNewLabel_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("PHONE");
		lblNewLabel_1_2_1.setBounds(0, 199, 60, 20);
		lblNewLabel_1_2_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ADDRESS");
		lblNewLabel_1_1_1.setBounds(0, 144, 71, 20);
		lblNewLabel_1_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setBounds(104, 89, 115, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_2.setBounds(104, 146, 115, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(34, 139, 34));
		btnNewButton.setBounds(142, 289, 133, 50);
		panel_2.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFocusable(false);
		btnUpdate.setForeground(new Color(255, 215, 0));
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(306, 289, 133, 50);
		panel_2.add(btnUpdate);
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(459, 289, 133, 50);
		panel_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("COMPANIES LIST");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(34, 139, 34));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(240, 350, 225, 23);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("X");
		lblNewLabel_1_2_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1_2_2.setBounds(670, 0, 31, 32);
		panel_2.add(lblNewLabel_1_2_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(104, 201, 115, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("AGENT");
		lblNewLabel_1_1_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(424, 85, 71, 20);
		panel_2.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(528, 87, 115, 20);
		panel_2.add(textField_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(148, 405, 694, 143);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		String[][] data = {{"Fady","Fady","Fady","Fady"} ,{"Dodo","Dodo","Dodo","Dodo"}};
		String[] columnNames = {"Name","Number","Name","Name"};
		table = new JTable(data,columnNames);
		table.setFocusable(false);
		table.setDefaultEditor(Object.class, null);

		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(0, 0, 694, 143);
		panel_1.add(table);
		setLocationRelativeTo(null);
		
		
	}
}

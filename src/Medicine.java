import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.commons.dbutils.DbUtils;
import org.postgresql.util.PSQLException;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Medicine extends JFrame {

	private JPanel contentPane;
	private JTextField medId;
	private JTextField medName;
	private JTextField medPrice;
	private JTextField medQty;
	private JTable medTable;
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	java.util.Date FDate, EDate;
	java.sql.Date myFabDate, myExpDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicine frame = new Medicine();
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
	/**
	 * 
	 */
	public Medicine() {

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
		gbl_panel.columnWidths = new int[] { 48, 0 };
		gbl_panel.rowHeights = new int[] { 41, 41, 41, 0, 46, 0, 54, 0, 55, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
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

		JLabel lblNewLabel_2 = new JLabel("MANAGE MEDICINE");
		lblNewLabel_2.setBounds(240, 30, 230, 32);
		lblNewLabel_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(0, 87, 14, 20);
		lblNewLabel_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1);

		medId = new JTextField();
		medId.setBounds(104, 87, 115, 20);
		panel_2.add(medId);
		medId.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("FABDATE");
		lblNewLabel_1_2.setBounds(424, 87, 61, 20);
		lblNewLabel_1_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1 = new JLabel("MEDNAME");
		lblNewLabel_1_1.setBounds(0, 142, 71, 20);
		lblNewLabel_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("EXPDATE");
		lblNewLabel_1_2_1.setBounds(424, 142, 60, 20);
		lblNewLabel_1_2_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("PRICE");
		lblNewLabel_1_1_1.setBounds(0, 199, 38, 20);
		lblNewLabel_1_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("COMPANY");
		lblNewLabel_1_2_1_1.setBounds(424, 199, 72, 20);
		lblNewLabel_1_2_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_2_1_1);

		JComboBox medComp = new JComboBox();
		medComp.setModel(new DefaultComboBoxModel(new String[] { "Item1" }));
		medComp.setBounds(531, 197, 145, 24);
		medComp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		medComp.setForeground(new Color(34, 139, 34));
		panel_2.add(medComp);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("QUANTITY");
		lblNewLabel_1_1_1_1.setBounds(0, 256, 71, 20);
		lblNewLabel_1_1_1_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1_1_1_1);

		JDateChooser medFab = new JDateChooser();
		medFab.setBounds(531, 87, 145, 20);
		panel_2.add(medFab);

		JDateChooser medExp = new JDateChooser();
		medExp.setBounds(531, 142, 145, 20);
		panel_2.add(medExp);

		medName = new JTextField();
		medName.setBounds(104, 144, 115, 20);
		panel_2.add(medName);
		medName.setColumns(10);

		medPrice = new JTextField();
		medPrice.setBounds(104, 201, 115, 20);
		panel_2.add(medPrice);
		medPrice.setColumns(10);

		medQty = new JTextField();
		medQty.setBounds(104, 258, 115, 20);
		panel_2.add(medQty);
		medQty.setColumns(10);

		JButton addBtn = new JButton("ADD");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FDate = medFab.getDate();
					myFabDate = new java.sql.Date(FDate.getTime());
					EDate = medExp.getDate();
					myExpDate = new java.sql.Date(EDate.getTime());

					con = DriverManager.getConnection("jdbc:postgresql:Pharmacy?user=postgres&password=12345");
					PreparedStatement add = con.prepareStatement("insert into medicine values (?,?,?,?,?,?,?)");
					add.setInt(1, Integer.valueOf(medId.getText()));
					add.setString(2, medName.getText());
					add.setString(3, medPrice.getText());
					add.setInt(4, Integer.valueOf(medQty.getText()));
					add.setDate(5, myFabDate);
					add.setDate(6, myExpDate);
					add.setString(7, medComp.getSelectedItem().toString());
					add.executeUpdate();
					refreshTable();
					JOptionPane.showMessageDialog(contentPane, "Medicine Successfully Added.");
					con.close();

				} catch (PSQLException e5) {
					JOptionPane.showMessageDialog(contentPane,
							"The item you entered has already been entered. Please use the Update option.",
							"Duplicate ID", JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {

					e1.printStackTrace();
				} catch (NullPointerException e2) {
					JOptionPane.showMessageDialog(contentPane, "One or more fields have not been entered.", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException e3) {
					JOptionPane.showMessageDialog(contentPane, "One or more fields that you entered are invalid.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addBtn.setFocusable(false);
		addBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
		addBtn.setBackground(new Color(255, 255, 255));
		addBtn.setForeground(new Color(34, 139, 34));
		addBtn.setBounds(142, 289, 133, 50);
		panel_2.add(addBtn);

		JButton updateBtn = new JButton("UPDATE");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (medId.getText().isEmpty() || medName.getText().isEmpty() || medPrice.getText().isEmpty()
						|| medQty.getText().isEmpty() || medFab.getDate() == null || medExp.getDate() == null) {
					JOptionPane.showMessageDialog(contentPane, "Missing one or more fields.");
				} else {
					try {
						con = DriverManager.getConnection("jdbc:postgresql:Pharmacy?user=postgres&password=12345");
						FDate = medFab.getDate();
						myFabDate = new java.sql.Date(FDate.getTime());
						EDate = medExp.getDate();
						myExpDate = new java.sql.Date(EDate.getTime());

						con = DriverManager.getConnection("jdbc:postgresql:Pharmacy?user=postgres&password=12345");
						String query = "UPDATE medicine SET medid= "+medId.getText() +", medname='"+medName.getText() + "', medprice='"+medPrice.getText()+"', medqty='"+medQty.getText()+"', medfab='"+myFabDate+"', medexp='"+myExpDate+"', medcomp='" +medComp.getSelectedItem().toString()+"' WHERE medid ="+medId.getText();
						Statement st = con.createStatement();
						st.executeUpdate(query);
						refreshTable();
						con.close();
					}catch (PSQLException f) {
						JOptionPane.showMessageDialog(contentPane, "Please enter valid entries.","Error",JOptionPane.ERROR_MESSAGE);
					}
					catch (Exception e7) {
						e7.printStackTrace();
					}
					
				}
			}
		});
		updateBtn.setFocusable(false);
		updateBtn.setForeground(new Color(255, 215, 0));
		updateBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
		updateBtn.setBackground(Color.WHITE);
		updateBtn.setBounds(306, 289, 133, 50);
		panel_2.add(updateBtn);

		JButton deleteBtn = new JButton("DELETE");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (medId.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Enter Medicine ID to be deleted.");
				} else {
					try {
						con = DriverManager.getConnection("jdbc:postgresql:Pharmacy?user=postgres&password=12345");
						String id = medId.getText();
						String Query = "DELETE FROM medicine where medid=" + id;
						Statement delete = con.createStatement();
						delete.executeUpdate(Query);
						refreshTable();

					}
					catch (PSQLException f) {
						JOptionPane.showMessageDialog(contentPane, "Please enter valid entries.","Error",JOptionPane.ERROR_MESSAGE);
					}catch (SQLException e6) {
						e6.printStackTrace();
					}
				}
			}
		});
		deleteBtn.setFocusable(false);
		deleteBtn.setForeground(new Color(255, 0, 0));
		deleteBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
		deleteBtn.setBackground(Color.WHITE);
		deleteBtn.setBounds(459, 289, 133, 50);
		panel_2.add(deleteBtn);

		JLabel lblNewLabel_3 = new JLabel("Medicine List");
		lblNewLabel_3.setForeground(new Color(34, 139, 34));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(292, 350, 225, 23);
		panel_2.add(lblNewLabel_3);

		JLabel exit = new JLabel("X");
		exit.setForeground(new Color(34, 139, 34));
		exit.setFont(new Font("Segoe UI", Font.BOLD, 24));
		exit.setBounds(670, 0, 31, 32);
		panel_2.add(exit);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(148, 405, 694, 143);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		String[][] data = { { "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY" },
				{ "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY" } };
		String[] columnNames = { "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY" };

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(0, 0, 694, 143);
		panel_1.add(scrollPane);
		medTable = new JTable(data, columnNames);
		medTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) medTable.getModel();
				int MyIndex = medTable.getSelectedRow();
				medId.setText(model.getValueAt(MyIndex, 0).toString());
				medName.setText(model.getValueAt(MyIndex, 1).toString());
				medPrice.setText(model.getValueAt(MyIndex, 2).toString());
				medQty.setText(model.getValueAt(MyIndex, 3).toString());
				medFab.setDate((Date) model.getValueAt(MyIndex, 4));
				medExp.setDate((Date) model.getValueAt(MyIndex, 5));
				medComp.setSelectedItem(model.getValueAt(MyIndex, 6));
			}

		});
		medTable.setVerifyInputWhenFocusTarget(false);
		medTable.setOpaque(false);
		medTable.setFocusable(false);
		medTable.setFillsViewportHeight(true);
		medTable.setDragEnabled(true);
		scrollPane.setViewportView(medTable);
		medTable.setDefaultEditor(Object.class, null);
		medTable.getTableHeader().setReorderingAllowed(false);
		medTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		medTable.setBorder(null);
		setLocationRelativeTo(null);
		refreshTable();

	}

	private void refreshTable() {
		try {
			con = DriverManager.getConnection("jdbc:postgresql:Pharmacy?user=postgres&password=12345");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM medicine");
			medTable.setModel(resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static TableModel resultSetToTableModel(ResultSet rs) {
		try {
			ResultSetMetaData metaData = rs.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			Vector columnNames = new Vector();

			// Get the column names
			for (int column = 0; column < numberOfColumns; column++) {
				columnNames.addElement(metaData.getColumnLabel(column + 1));
			}

			// Get all rows.
			Vector rows = new Vector();

			while (rs.next()) {
				Vector newRow = new Vector();

				for (int i = 1; i <= numberOfColumns; i++) {
					newRow.addElement(rs.getObject(i));
				}

				rows.addElement(newRow);
			}

			return new DefaultTableModel(rows, columnNames);
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
}

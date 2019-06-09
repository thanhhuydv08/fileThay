package file;

import java.awt.EventQueue;import java.awt.LayoutManager;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent; 
public class BT9_2 {
	Object [] colums = {"Ten","Khoi","TBHK1","TBHK2","TBNH"};

	Object [] lsCom = {1,2,3,4,5,6,7,8,9,10,11,12};
	private JFrame frame;
	private JTextField txtName;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	DefaultTableModel dtm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT9_2 window = new BT9_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BT9_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 551, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 535, 385);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(110, 93, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		txtName = new JTextField();
		txtName.setBounds(110, 33, 178, 20);
		panel.add(txtName);
		txtName.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(110, 124, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("AddNew");

		btnNewButton.setBounds(330, 33, 109, 23);
		panel.add(btnNewButton);

		JComboBox comboBox = new JComboBox(lsCom);
		comboBox.setBounds(110, 61, 56, 20);
		panel.add(comboBox);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(26, 33, 51, 14);
		panel.add(lblNewLabel);

		JLabel lblClass = new JLabel("Khoi");
		lblClass.setBounds(26, 61, 51, 14);
		panel.add(lblClass);

		JLabel lblTbhk_1 = new JLabel("TBHK2");
		lblTbhk_1.setBounds(26, 124, 51, 14);
		panel.add(lblTbhk_1);

		JLabel lblTbhk = new JLabel("TBHK1");
		lblTbhk.setBounds(26, 93, 63, 14);
		panel.add(lblTbhk);




		dtm = new DefaultTableModel(colums,0);
		table_1 = new JTable(dtm);


		table_1.setBounds(0, 11, 515, 174);
		JScrollPane jScrollPane = new JScrollPane(table_1);
		jScrollPane.setLocation(10, 170);
		jScrollPane.setSize(515, 88);
		panel.add(jScrollPane);

		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DataInputStream dis;
				try {
					dis = new DataInputStream(new FileInputStream("tongketnamhoc.txt"));
					int so;
					while(true) {
						try {

							dtm.addRow(new Object[] {dis.readUTF(),dis.readInt(),dis.readDouble(),dis.readDouble(),1});
							//so=dis.readInt();
							//System.out.print(so+" ");
						}catch(EOFException eofx) {
							break;
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnRead.setBounds(330, 74, 109, 23);
		panel.add(btnRead);



		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataOutputStream dataOS= new DataOutputStream(new FileOutputStream("tongketnamhoc.txt", true));
					dataOS.writeUTF(txtName.getText());
					dataOS.writeInt((int) comboBox.getSelectedItem());
					dataOS.writeDouble(Double.parseDouble(textField_1.getText()));
					dataOS.writeDouble(Double.parseDouble(textField_2.getText()));
					dataOS.close();
					txtName.setText("");
					textField_1.setText("");
					textField_2.setText("");
					JOptionPane.showMessageDialog(frame, " Them moi sinh vien thanh cong ", "Thong Bao", JOptionPane.INFORMATION_MESSAGE);
					//DataInputStream dis = new DataInputStream(new FileInputStream("tongketnamhoc.txt"));


				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}
}

package buoi3;

import java.awt.EventQueue;


import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FrmList {
	String [] str = {"Cơm", "Phở","Bún","Miến", "Cháo"};
	 JFrame frame, frame1;
	 JTextField txtIndex;
	 JTextField txtValue;
	JButton jButtonFrame1;
	JTextField txtIndex1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmList window = new FrmList();
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
	public FrmList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 469, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(53, 87, 112, 20);
		comboBox.addItem("Cơm");
		comboBox.addItem("Phở");
		comboBox.addItem("Bún");
		comboBox.addItem("Miến");
		
		
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Chỉ Mục");
		lblNewLabel.setBounds(211, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtIndex = new JTextField();
		txtIndex.setBounds(305, 87, 86, 20);
		frame.getContentPane().add(txtIndex);
		txtIndex.setColumns(10);
		
		JLabel lblGiTr = new JLabel("Giá Trị");
		lblGiTr.setBounds(211, 127, 46, 14);
		frame.getContentPane().add(lblGiTr);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(305, 124, 86, 20);
		frame.getContentPane().add(txtValue);
		
		JButton btnNewButton = new JButton("Kết Quả");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String index ="",value="";
				index=String.valueOf(comboBox.getSelectedIndex());
				value= comboBox.getSelectedItem().toString();
				txtIndex.setText(index);
				txtValue.setText(value);
			}
		});
		btnNewButton.setBounds(211, 168, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnThmDanhSch = new JButton("Thêm Danh Sách");
		btnThmDanhSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 = new JFrame();
				frame1.setBounds(100, 100, 300, 300);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.getContentPane().setLayout(null);
				Createframe1();
				frame1.setVisible(true);
				jButtonFrame1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						comboBox.addItem(txtIndex1.getText().toString());
						frame1.setVisible(false);
					}
				});
			}
		});
		btnThmDanhSch.setBounds(53, 168, 133, 23);
		frame.getContentPane().add(btnThmDanhSch);
	}
	
	public void Createframe1() {
		JLabel lblNewLabel1 = new JLabel("Nhập tên :");
		lblNewLabel1.setBounds(20, 11,86, 20);
		frame1.getContentPane().add(lblNewLabel1);
		
		txtIndex1 = new JTextField();
		txtIndex1.setBounds(20, 40,86, 20);
		frame1.getContentPane().add(txtIndex1);
		jButtonFrame1 = new JButton("Xác Nhận");
		jButtonFrame1.setBounds(20, 80,40, 20);
		frame1.getContentPane().add(jButtonFrame1);
	}
}

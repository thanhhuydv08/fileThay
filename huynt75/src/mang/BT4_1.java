package mang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BT4_1 {
    public ArrayList<Integer> list ;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT4_1 window = new BT4_1();
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
	public BT4_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(137, 25, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 58, 287, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 143, 86, 20);
		frame.getContentPane().add(textField_2);
		
		
		
		
		JButton btnNewButton = new JButton("T\u00EDnh T\u1ED5ng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s=0;
				for (int i = 0; i < list.size(); i++) {
					s=s+list.get(i);
				}
				textField_2.setText(String.valueOf(s));
			}
			
		});
		btnNewButton.setBounds(137, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("S\u1ED1 Ph\u00E0n T\u1EED");
		lblNewLabel.setBounds(10, 28, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMngRandom = new JLabel("M\u1EA3ng Random");
		lblMngRandom.setBounds(10, 58, 86, 14);
		frame.getContentPane().add(lblMngRandom);
		
		JLabel lblTng = new JLabel("T\u1ED5ng");
		lblTng.setBounds(10, 146, 46, 14);
		frame.getContentPane().add(lblTng);
		
		JButton btnPhtSinhMng = new JButton("Ph\u00E1t Sinh M\u1EA3ng");
		btnPhtSinhMng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PhatSinhMang(Integer.parseInt(textField.getText()));
				System.out.println(textField.getText());
				String str = Arrays.toString(list.toArray()); 
				textField_1.setText(str);
			}
		});
		btnPhtSinhMng.setBounds(134, 109, 107, 23);
		frame.getContentPane().add(btnPhtSinhMng);
	}
	
	 public ArrayList PhatSinhMang(int keyboard) {
		//list.clear();
		 list = new ArrayList<>();
		Random e = new Random();
		for(int i=0;i<keyboard;i++) {
			list.add(e.nextInt(100));
			
		}
		return list;
		
	}
}

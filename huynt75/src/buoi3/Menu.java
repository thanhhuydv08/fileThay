package buoi3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.ORANGE);
		menuBar.setBounds(0, 0, 211, 30);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmExit = new JMenuItem("exit");
		mnFile.add(mntmExit);
		
		JMenu mnNewMenu = new JMenu("Bai Tap");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRead = new JMenuItem("List");
		mntmRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmList fl = new FrmList();
				
				
				
			}
		});
		mnNewMenu.add(mntmRead);
		JMenuItem item = new JMenuItem("Table");
		mnNewMenu.add(item);
		
	}
}

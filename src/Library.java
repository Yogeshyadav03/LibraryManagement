import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame =  new JFrame("Library Management");
		 frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		JLabel label = new JLabel("Library Management");
		label.setBounds(60, 50, 350, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.setBounds(90, 180, 240, 40);
		btnAdmin.setFont(new Font("Serif",Font.HANGING_BASELINE,23));
		btnAdmin.setBackground(Color.red);
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setBorderPainted(true);
		 btnAdmin.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
		JButton btnLibrarian = new JButton("Librarian Login");
		btnLibrarian.setBounds(90, 250, 240, 40);
		btnLibrarian.setFont(new Font("Serif",Font.HANGING_BASELINE,22));
		btnLibrarian.setBackground(Color.RED);;
		btnLibrarian.setForeground(Color.BLACK);
		btnLibrarian.setBorderPainted(true);
		btnLibrarian.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
		
		
		btnAdmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdminLogin.main(new String[] {});
				frame.dispose();
			}
		});
		
		btnLibrarian.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianLogi.main(new String [] {});
				frame.dispose();
			}
		});
		
		
		
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(btnAdmin);
		frame.add(btnLibrarian);
		
		
		
		
		frame.setSize(480, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

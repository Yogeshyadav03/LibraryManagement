import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Librarian Login");
		frame.getContentPane().setBackground(Color.yellow);
		
		
		JLabel label = new JLabel("Librarian Login");
		label.setBounds(140, 50, 220, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		JLabel librarianName = new JLabel("Name:");
		librarianName.setBounds(30, 150, 100, 35);
		librarianName.setFont(new Font("Serif",Font.TYPE1_FONT,28));
		librarianName.setForeground(Color.black);
		//adminName.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
		JTextField nameFiled = new JTextField();
		nameFiled.setBounds(180, 150, 250, 35);
		nameFiled.setFont(new Font ("Serif",Font.LAYOUT_LEFT_TO_RIGHT,25));
		nameFiled.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel librarianPass = new JLabel("Password:");
		librarianPass.setBounds(30, 215, 150, 35);
		librarianPass.setFont(new Font("Serif",Font.TYPE1_FONT,28));
		librarianPass.setForeground(Color.black);
		
		JPasswordField PassFiled = new JPasswordField();
		PassFiled.setBounds(180, 215, 250, 35);
		PassFiled.setFont(new Font ("Serif",Font.LAYOUT_LEFT_TO_RIGHT,25));
		PassFiled.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(140, 290, 200, 40);
		btnLogin.setFont(new Font("Seif", Font.TRUETYPE_FONT, 30));
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.setForeground(Color.black);
		btnLogin.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 15,110, 28);
		btnBack.setFont(new Font("Seif", Font.TRUETYPE_FONT, 20));
		btnBack.setBackground(Color.blue);
		btnBack.setForeground(Color.white);
		btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = nameFiled.getText();
				String password =String.valueOf(PassFiled.getPassword());
				
				if(LibrarianDao.librarianlogin(name, password)) {
			         LibrarianSuccess.main(new String [] {});
					
				} else {
					JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					nameFiled.setText("");
					PassFiled.setText("");
				}
			}
		});
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(librarianName);
		frame.add(nameFiled);
		frame.add(librarianPass);
		frame.add(PassFiled);
		frame.add(btnLogin);
		frame.add(btnBack);
		
		
		
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

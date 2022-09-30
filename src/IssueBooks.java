import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IssueBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Issue Book");
		frame.getContentPane().setBackground(Color.GREEN);
		
		
		JLabel  label = new JLabel("Issue Books");
		label.setBounds(130, 55, 240, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		JLabel callNo = new JLabel("Book Call No:");
		callNo.setBounds(20, 130, 150, 35);
		callNo.setForeground(Color.BLACK);
		callNo.setFont(new Font("Serif", Font.TYPE1_FONT, 22));
		
		
		JTextField callNOField = new JTextField();
		callNOField.setBounds(190, 130, 240, 35);
		callNOField.setFont(new Font("Serif", Font. PLAIN, 30));
		callNOField.setForeground(Color.BLACK);
		callNOField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JLabel studentID = new JLabel("Student ID:");
		studentID.setBounds(20, 190, 150, 35);
		studentID.setForeground(Color.BLACK);
		studentID.setFont(new Font("Serif", Font.TYPE1_FONT, 22));
		
		JTextField studentIDField = new JTextField();
		studentIDField.setBounds(190, 190, 240, 35);
		studentIDField.setFont(new Font("Serif", Font. PLAIN, 30));
		studentIDField.setForeground(Color.BLACK);
		studentIDField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel studentNAme= new JLabel("Student Name:");
		studentNAme.setBounds(20, 250, 150, 35);
		studentNAme.setForeground(Color.BLACK);
		studentNAme.setFont(new Font("Serif", Font.TYPE1_FONT, 22));
		
		
		
		JTextField studentNAmeField = new JTextField();
		studentNAmeField.setBounds(190, 250, 240, 35);
		studentNAmeField.setFont(new Font("Serif", Font. PLAIN, 30));
		studentNAmeField.setForeground(Color.BLACK);
		studentNAmeField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		
		JLabel studentContact = new JLabel("Student Contact:");
		studentContact.setBounds(20, 310, 160, 35);
		studentContact.setForeground(Color.BLACK);
		studentContact.setFont(new Font("Serif", Font.TYPE1_FONT, 22));
		
		JTextField studentContactField = new JTextField();
		studentContactField.setBounds(190, 310, 240, 35);
		studentContactField.setFont(new Font("Serif", Font. PLAIN, 30));
		studentContactField.setForeground(Color.BLACK);
		studentContactField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton btnissueBooks = new JButton("Issue Books");
		 btnissueBooks.setBounds(140, 380, 200, 40);
		 btnissueBooks.setFont(new Font("Seif", Font.TRUETYPE_FONT, 30));
		 btnissueBooks.setBackground(Color.MAGENTA);
		 btnissueBooks.setForeground(Color.black);
		 btnissueBooks.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 15,110, 28);
		btnBack.setFont(new Font("Seif", Font.TRUETYPE_FONT, 20));
		btnBack.setBackground(Color.blue);
		btnBack.setForeground(Color.white);
		btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel  label2 = new JLabel("Note: Please check Student ID Carefully before issuing book!");
		label2.setBounds(10, 420, 480, 40);
		label2.setFont(new Font("Serif",Font.BOLD,16));
		label2.setForeground(Color.red);
		
		
		btnissueBooks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String bookcallno=callNOField.getText();
				int studentid = Integer.parseInt(studentIDField.getText());
				String studentname = studentNAmeField.getText();
				String studentcontact = studentContactField.getText();
				
				if (IssueBooksDao.checkBook(bookcallno)) {
					int i =IssueBooksDao.save(bookcallno, studentid, studentname, studentcontact);
					
					if (i>0) {
						JOptionPane.showMessageDialog(null,"Book issued successfully!");
						LibrarianSuccess.main(new String[]{});
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null,"Sorry, unable to issue!");
					}
				}else {
					JOptionPane.showMessageDialog(null,"Sorry, Callno doesn't exist!");
				} 
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(callNo);
		frame.add(callNOField);
		frame.add(studentID);
		frame.add(studentIDField);
		frame.add(studentNAme);
		frame.add(studentNAmeField);
		frame.add(studentContact);
		frame.add(studentContactField);
		frame.add(label2);
		
		
		
		frame.add( btnissueBooks);
		frame.add(btnBack);
		
		
		frame.setSize(500,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

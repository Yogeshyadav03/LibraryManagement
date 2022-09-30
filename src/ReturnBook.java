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

public class ReturnBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Retutn Book");
		frame.getContentPane().setBackground(Color.yellow);
		
		
		JLabel label = new JLabel("Retrun Book");
		label.setBounds(140, 50, 220, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		JLabel bookcallno = new JLabel("Book callno:");
		bookcallno.setBounds(30, 150, 130, 35);
		bookcallno.setFont(new Font("Serif",Font.TYPE1_FONT,24));
		bookcallno.setForeground(Color.black);
		//adminName.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
		JTextField bookcallnoFiled = new JTextField();
		bookcallnoFiled.setBounds(190, 150, 250, 35);
		bookcallnoFiled.setFont(new Font ("Serif",Font.LAYOUT_LEFT_TO_RIGHT,25));
		bookcallnoFiled.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel studentid = new JLabel("Student ID:");
		 studentid.setBounds(30, 215, 150, 35);
		 studentid.setFont(new Font("Serif",Font.TYPE1_FONT,25));
		 studentid.setForeground(Color.black);
		
		JPasswordField  studentidFiled = new JPasswordField();
		 studentidFiled.setBounds(190, 215, 250, 35);
		 studentidFiled.setFont(new Font ("Serif",Font.LAYOUT_LEFT_TO_RIGHT,25));
		 studentidFiled.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton btnreturnbook = new JButton("Return Book");
		 btnreturnbook .setBounds(140, 290, 200, 40);
		 btnreturnbook .setFont(new Font("Seif", Font.TRUETYPE_FONT, 30));
		 btnreturnbook .setBackground(Color.ORANGE);
		 btnreturnbook .setForeground(Color.black);
		 btnreturnbook .setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JLabel label2 = new JLabel("Note: Check the book properly!");
		 label2 .setBounds(30, 340, 350, 35);
		 label2 .setFont(new Font("Serif",Font.TYPE1_FONT,23));
		 label2 .setForeground(Color.RED);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 15,110, 28);
		btnBack.setFont(new Font("Seif", Font.TRUETYPE_FONT, 20));
		btnBack.setBackground(Color.blue);
		btnBack.setForeground(Color.white);
		btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		btnreturnbook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String bookcallno = bookcallnoFiled.getText();
				int studentid = Integer.parseInt(studentidFiled.getText());
				 int i = ReturnBookdao.delete(bookcallno, studentid);
				 if(i>0){
						JOptionPane.showMessageDialog(null,"Book returned successfully!");
						LibrarianSuccess.main(new String[]{});
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(null,"Sorry, unable to return book!");
					}
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianSuccess.main(new String [] {});
				frame.dispose();
			}
		});
		
		
		
		
		
		
		
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(bookcallno);
		frame.add(bookcallnoFiled);
		frame.add( studentid);
		frame.add( studentidFiled);
		frame.add( btnreturnbook );
		frame.add(btnBack);
		frame.add( label2 );
		
		
		
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

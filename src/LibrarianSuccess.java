import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LibrarianSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Librarian Section");
		frame.getContentPane().setBackground(Color.GREEN);
		
		
		JLabel label = new JLabel("Librarian Section");
		label.setBounds(135, 45, 280, 42);
		label.setFont(new Font("Serif", Font.BOLD, 36));
		label.setForeground(Color.BLACK);
		
		
		JButton addBook = new JButton("Add Book");
		addBook.setBounds(130, 130,240, 50);
		addBook.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		addBook.setBackground(Color.magenta);
		addBook.setForeground(Color.black);
		addBook.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton viewBook = new JButton("View Book");
		viewBook.setBounds(130, 190,240, 50);
		viewBook.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		viewBook.setBackground(Color.magenta);
		viewBook.setForeground(Color.black);
		viewBook.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton issueBook = new JButton("Issue Book");
		issueBook.setBounds(130, 250,240, 49);
		issueBook.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		issueBook.setBackground(Color.magenta);
		issueBook.setForeground(Color.black);
		issueBook.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton viewIssueBook = new JButton(" View Issue Book");
		viewIssueBook.setBounds(130, 310,240, 49);
		viewIssueBook.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		viewIssueBook.setBackground(Color.magenta);
		viewIssueBook.setForeground(Color.black);
		viewIssueBook.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));

		JButton returnBook = new JButton("Return Book");
		returnBook.setBounds(130, 370,240, 49);
		returnBook.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		returnBook.setBackground(Color.magenta);
		returnBook.setForeground(Color.black);
		returnBook.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(130, 430,240, 49);
		btnLogout.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		btnLogout.setBackground(Color.magenta);
		btnLogout.setForeground(Color.black);
		btnLogout.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		addBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddBooks.main(new String [] {});
				frame.dispose();
			}
		});
		
		viewBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewBooks.main(new String [] {});
				
			}
		});
		
		issueBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IssueBooks.main(new String [] {});
				frame.dispose();
			}
		});
		
		viewIssueBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewIssuedBook.main(new String [] {});
			}
		});
		
		viewIssueBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReturnBook.main(new String [] {});
				frame.dispose();
			}
		});
		
		
	
     btnLogout.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Library.main(new String [] {});
			frame.dispose();
			JOptionPane.showMessageDialog(null, "Successfully LogOut");
		}
	});
     
    
		
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(addBook);
		frame.add(viewBook);
		frame.add(issueBook);
		frame.add(viewIssueBook);
		frame.add(returnBook);
		frame.add(btnLogout);
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setVisible(true);
	}

}

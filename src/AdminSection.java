import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AdminSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Admin Section");
		frame.getContentPane().setBackground(Color.GREEN);
		
		
		JLabel label = new JLabel("Admin Section");
		label.setBounds(135, 50, 250, 42);
		label.setFont(new Font("Serif", Font.BOLD, 40));
		label.setForeground(Color.BLACK);
		
		
		JButton addLibrarian = new JButton("Add Librarian");
		addLibrarian.setBounds(130, 150,240, 50);
		addLibrarian.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		addLibrarian.setBackground(Color.magenta);
		addLibrarian.setForeground(Color.black);
		addLibrarian.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton viewLibrarian = new JButton("View Librarian");
		viewLibrarian.setBounds(130, 230,240, 50);
		viewLibrarian.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		viewLibrarian.setBackground(Color.magenta);
		viewLibrarian.setForeground(Color.black);
		viewLibrarian.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton deleteLibrarian = new JButton("Delete Librarian");
		deleteLibrarian.setBounds(130, 310,240, 49);
		deleteLibrarian.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		deleteLibrarian.setBackground(Color.magenta);
		deleteLibrarian.setForeground(Color.black);
		deleteLibrarian.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(130, 390,240, 49);
		btnLogout.setFont(new Font("Serif", Font.HANGING_BASELINE, 30));
		btnLogout.setBackground(Color.magenta);
		btnLogout.setForeground(Color.black);
		btnLogout.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		addLibrarian.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 AddLibrarian.main(new String [] {});
				 frame.dispose();
			}
		});
		
	viewLibrarian.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ViewLibrarian.main(new String [] {});
			frame.dispose();
		}
	});
	
	deleteLibrarian.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			DeleteLibrarian.main(new String[] {});
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
		frame.add(addLibrarian);
		frame.add(viewLibrarian);
		frame.add(deleteLibrarian);
		frame.add(btnLogout);
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setVisible(true);
	}

}

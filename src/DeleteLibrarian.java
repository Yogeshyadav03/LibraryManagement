import java.awt.BorderLayout;
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

public class DeleteLibrarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame("Delete Librarian");
		frame.getContentPane().setBackground(Color.magenta);
		
	    JLabel LiId = new JLabel("Enter Id:");
	    LiId.setBounds(20, 75, 210, 40);
	    LiId.setFont(new Font("Serif", Font.PLAIN, 30));
	    
	    JTextField IDField = new JTextField();
	    IDField.setBounds(140, 75, 220, 40);
	    IDField.setFont(new Font("Serif", Font.PLAIN, 30));
	    IDField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
	    
	    
	    JButton deletebtn = new JButton("Delete");
	    deletebtn.setBounds(70, 142, 150, 35);
	    deletebtn.setFont(new Font("Serif",Font.ROMAN_BASELINE,30 ));
	    deletebtn.setBackground(Color.blue);
	    deletebtn.setForeground(Color.white);
	    deletebtn.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
	    
	    
	    JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 15,110, 28);
		btnBack.setFont(new Font("Seif", Font.TRUETYPE_FONT, 20));
		btnBack.setBackground(Color.blue);
		btnBack.setForeground(Color.white);
		btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
	    
	    deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sid = IDField.getText();
				if (sid ==null|| sid.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "ID can't be blank");
					
				}else {
					int id = Integer.parseInt(sid);
					int i =LibrarianDao.delete(id);
					if(i>0) {
						JOptionPane.showMessageDialog(null, "Record deleted successfully!");
					} else {
						JOptionPane.showMessageDialog(null, "unable to delete given id!");
					}
				}
			}
		});
	    
	    btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdminSection.main(new String[] {});
				frame.dispose();
			}
		});
	    
	    
		
		
		frame.setLayout(null);
		frame.add(LiId);
		frame.add(IDField);
		frame.add(deletebtn);
		frame.add(btnBack);
		
		
		
		frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}

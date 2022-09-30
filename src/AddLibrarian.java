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

public class AddLibrarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Add Librarian");
		frame.getContentPane().setBackground(Color.RED);
		
		
		JLabel  label = new JLabel("Add Librarian");
		label.setBounds(130, 55, 240, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		JLabel librarianName = new JLabel("Name:");
		librarianName.setBounds(20, 130, 130, 35);
		librarianName.setForeground(Color.BLACK);
		librarianName.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		JTextField liNameField = new JTextField();
		liNameField.setBounds(170, 130, 240, 35);
		liNameField.setFont(new Font("Serif", Font. PLAIN, 30));
		liNameField.setForeground(Color.BLACK);
		liNameField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JLabel librarianPass = new JLabel("Password:");
		librarianPass.setBounds(20, 190, 140, 35);
		librarianPass.setForeground(Color.BLACK);
		librarianPass.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		JPasswordField liPassField = new JPasswordField();
		liPassField.setBounds(170, 190, 240, 35);
		liPassField.setFont(new Font("Serif", Font. PLAIN, 30));
		liPassField.setForeground(Color.BLACK);
		liPassField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel librarianEmail= new JLabel("Email:");
		librarianEmail.setBounds(20, 250, 140, 35);
		librarianEmail.setForeground(Color.BLACK);
		librarianEmail.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		
		JTextField liEmailField = new JTextField();
		liEmailField.setBounds(170, 250, 240, 35);
		liEmailField.setFont(new Font("Serif", Font. PLAIN, 30));
		liEmailField.setForeground(Color.BLACK);
		liEmailField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		
		JLabel librarianAddress= new JLabel("Address:");
		librarianAddress.setBounds(20, 310, 140, 35);
		librarianAddress.setForeground(Color.BLACK);
		librarianAddress.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		JTextField liAddressField = new JTextField();
		liAddressField.setBounds(170, 310, 240, 35);
		liAddressField.setFont(new Font("Serif", Font. PLAIN, 30));
		liAddressField.setForeground(Color.BLACK);
		liAddressField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel librarianCity= new JLabel("City:");
		librarianCity.setBounds(20, 370, 140, 35);
		librarianCity.setForeground(Color.BLACK);
		librarianCity.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		JTextField liCityField = new JTextField();
		liCityField.setBounds(170, 370, 240, 35);
		liCityField.setFont(new Font("Serif", Font. PLAIN, 30));
		liCityField.setForeground(Color.BLACK);
		liCityField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel librarianContact= new JLabel("Contact:");
		librarianContact.setBounds(20, 430, 140, 35);
		librarianContact.setForeground(Color.BLACK);
		librarianContact.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		JTextField liContactField = new JTextField();
		liContactField.setBounds(170, 430, 240, 35);
		liContactField.setFont(new Font("Serif", Font. PLAIN, 30));
		liContactField.setForeground(Color.BLACK);
		liContactField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JButton btnAddLi = new JButton("Add Librarian");
		btnAddLi.setBounds(140, 490, 200, 40);
		btnAddLi.setFont(new Font("Seif", Font.TRUETYPE_FONT, 30));
		btnAddLi.setBackground(Color.MAGENTA);
		btnAddLi.setForeground(Color.black);
		btnAddLi.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 15,110, 28);
		btnBack.setFont(new Font("Seif", Font.TRUETYPE_FONT, 20));
		btnBack.setBackground(Color.blue);
		btnBack.setForeground(Color.white);
		btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		
		btnAddLi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = liNameField.getText();
				String password =String.valueOf(liPassField.getPassword());
				String email = liEmailField.getText();
				String address = liAddressField.getText();
				String city = liCityField.getText();
				String contact = liContactField.getText();
				
				
				int i=LibrarianDao.save(name, password, email, address, city, contact);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "Librarian added successfully!");
					AdminSection.main(new String[] {});
					frame.dispose();
				} else {
                  JOptionPane.showMessageDialog(null, "Sorry, unable to save");
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
		frame.add(label);
		frame.add(librarianName);
		frame.add(liNameField);
		frame.add(librarianPass);
		frame.add(liPassField);
		frame.add(librarianEmail);
		frame.add(liEmailField);
		frame.add(librarianAddress);
		frame.add(liAddressField);
		frame.add(librarianCity);
		frame.add(liCityField);
		frame.add(librarianContact);
		frame.add(liContactField);
		frame.add(btnAddLi);
		frame.add(btnBack);
		
		
		frame.setSize(500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

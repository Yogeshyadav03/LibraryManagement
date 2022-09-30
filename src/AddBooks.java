import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Add Books");
		frame.getContentPane().setBackground(Color.GREEN);
		
		
		JLabel  label = new JLabel("Add Books");
		label.setBounds(130, 55, 240, 40);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		JLabel callNo = new JLabel("Call No:");
		callNo.setBounds(20, 130, 130, 35);
		callNo.setForeground(Color.BLACK);
		callNo.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		JTextField callNOField = new JTextField();
		callNOField.setBounds(170, 130, 240, 35);
		callNOField.setFont(new Font("Serif", Font. PLAIN, 30));
		callNOField.setForeground(Color.BLACK);
		callNOField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		JLabel booksname = new JLabel("Name:");
		booksname.setBounds(20, 190, 140, 35);
		booksname.setForeground(Color.BLACK);
		booksname.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		JTextField booksnameField = new JTextField();
		booksnameField.setBounds(170, 190, 240, 35);
		booksnameField.setFont(new Font("Serif", Font. PLAIN, 30));
		booksnameField.setForeground(Color.BLACK);
		booksnameField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel authorNAme= new JLabel("Author:");
		authorNAme.setBounds(20, 250, 140, 35);
		authorNAme.setForeground(Color.BLACK);
		authorNAme.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		
		JTextField authorNAmeField = new JTextField();
		authorNAmeField.setBounds(170, 250, 240, 35);
		authorNAmeField.setFont(new Font("Serif", Font. PLAIN, 30));
		authorNAmeField.setForeground(Color.BLACK);
		authorNAmeField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		
		JLabel booksPublisher = new JLabel("Publisher:");
		booksPublisher.setBounds(20, 310, 140, 35);
		booksPublisher.setForeground(Color.BLACK);
		booksPublisher.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		JTextField booksPublisheField = new JTextField();
		booksPublisheField.setBounds(170, 310, 240, 35);
		booksPublisheField.setFont(new Font("Serif", Font. PLAIN, 30));
		booksPublisheField.setForeground(Color.BLACK);
		booksPublisheField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel booksQuantity= new JLabel("Quantity:");
		booksQuantity.setBounds(20, 370, 140, 35);
		booksQuantity.setForeground(Color.BLACK);
		booksQuantity.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		JTextField booksQuantityField = new JTextField();
		booksQuantityField.setBounds(170, 370, 240, 35);
		booksQuantityField.setFont(new Font("Serif", Font. PLAIN, 30));
		booksQuantityField.setForeground(Color.BLACK);
		booksQuantityField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		JLabel booksissued= new JLabel("Issued:");
		booksissued.setBounds(20, 420, 140, 35);
		booksissued.setForeground(Color.BLACK);
		booksissued.setFont(new Font("Serif", Font.TYPE1_FONT, 30));
		
		
		JTextField booksisssuedField = new JTextField();
		booksisssuedField.setBounds(170, 420, 240, 35);
		booksisssuedField.setFont(new Font("Serif", Font. PLAIN, 30));
		booksisssuedField.setForeground(Color.BLACK);
		booksisssuedField.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		
		
		
		
		JButton btnAddLi = new JButton("Add Books");
		btnAddLi.setBounds(140, 460, 200, 40);
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
				String callno=callNOField.getText();
				String name = booksnameField.getText();
				String author = authorNAmeField.getText();
				String publisher = booksPublisheField.getText();
				int quantity = Integer.parseInt(booksQuantityField.getText());
				int issued = Integer.parseInt(booksisssuedField.getText());
				
				int i= BooksDao.Addbooks(callno, name, author, publisher, quantity, issued);
				
				if (i>0) {
					JOptionPane.showMessageDialog(null,"Books added successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Sorry, unable to save!");
				}
			
				
			}
		});
		
		btnBack.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianSuccess.main(new String[] {});
				frame.dispose();
			}
		});
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(callNo);
		frame.add(callNOField);
		frame.add(booksname);
		frame.add(booksnameField);
		frame.add(authorNAme);
		frame.add(authorNAmeField);
		frame.add(booksPublisher);
		frame.add(booksPublisheField);
		frame.add(booksQuantity);
		frame.add(booksQuantityField);
		frame.add(booksissued);
		frame.add(booksisssuedField);
		
		
		frame.add(btnAddLi);
		frame.add(btnBack);
		
		
		frame.setSize(500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

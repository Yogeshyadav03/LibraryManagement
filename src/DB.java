import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
	
	public static Connection con =null;
	public static PreparedStatement statement;
	
	public static Connection connect() {
		String URL= "jdbc:mysql://localhost:3306/Library?allowPublicKeyRetrieval=true&useSSL =false";
		String username ="root";
		String password ="Yogesh@321";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, username, password);
			System.out.println("Connnected to Database....");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}

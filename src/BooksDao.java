import java.sql.PreparedStatement;

public class BooksDao {

	public  static int Addbooks(String callno,String name,String author, String publisher,int quantity,int issued)
	{
		int status=0;
		try {
			DB.con = DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("insert into books(callno,name,author,publisher,quantity,issued )values(?,?,?,?,?,?)");
			ps.setString(1,callno);
			ps.setString(2,name);
			ps.setString(3,author);
			ps.setString(4,publisher);
			ps.setInt(5,quantity);
			ps.setInt(6, issued);
			status=ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
}

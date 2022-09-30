import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IssueBooksDao {
	public static boolean checkBook(String bookcallno){
		boolean status=false;
		try{
			Connection con=DB.connect();
			PreparedStatement ps=con.prepareStatement("select * from books where callno=?");
			ps.setString(1,bookcallno);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int save(String bookcallno,int studentid,String studentname,String studentcontact) {
		int status = 0;
		try {
			DB.con= DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact)values(?,?,?,?)");
		    ps.setString(1, bookcallno);
		    ps.setInt(2, studentid);
		    ps.setString(3, studentname);
		    ps.setString(4, studentcontact);
		    status =ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	


}

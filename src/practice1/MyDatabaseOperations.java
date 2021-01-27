package practice1;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyDatabaseOperations {

	MyConnection db = new MyConnection();
	Statement st;
	 PreparedStatement ps;
	boolean status=false;

	public  boolean validate(String usr,String pass)
	{
		ps=db.getPreparedStatement("select * from emp where id=? and pass=? ");
		try {
			ps.setString(1, usr);  
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
		
		
		
		
		return status;	
		
	}

}

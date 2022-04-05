package exceptionhandle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionHandle {

	public static void main(String[] args) {
		
		
		try {
			Connection con=DriverManager.getConnection("  ") ;
			
			if(con!=null) {
				
				con.commit();
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}

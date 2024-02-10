package login;
import java.sql.*;

import database.*;

/*
CREATE TABLE users (
	username VARCHAR(50) NOT NULL PRIMARY KEY,
	password VARCHAR(100) NOT NULL
);
*/

public class Verifier 
{
	public static boolean verifyUser(String uname, String pass)
	{
		String password = null;
		try 
		{
			Connection con = DBConnection.getCon();
			
			String selectQuery = "SELECT * FROM `users` WHERE `username`=?";
	        try(PreparedStatement ps = con.prepareStatement(selectQuery)) 
	        {
	            ps.setString(1, uname);
	            ResultSet rs = ps.executeQuery();
	            
	            if(!rs.next())
	            	return false;
	            
	            password = rs.getString("password");
	        }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(password!=null && password.equals(pass)) return true;
    	else return false;
	}
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/jdbc";
    //jdbc:mysql://192.168.29.150/ce4_59
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection con = null;

    // Private constructor to prevent instantiation from outside
    private DBConnection() {
    }

    static 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } 
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Failed to initialize database connection", e);
        }
    }

    public static Connection getCon() {
        return con;
    }

    public static void closeConnection() 
    {
        try 
        {
            if(con != null && !con.isClosed()) 
            {
                con.close();
            }
        } 
        catch (SQLException e) {
            System.err.println("Error closing database connection: " + e.getMessage());
        }
    }
}

package mypack;
import java.sql.*;

/*
CREATE TABLE `student` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`fname` varchar(50) NOT NULL,
`lname` varchar(50) NOT NULL,
`uname` varchar(50) NOT NULL,
`pass` varchar(50) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
*/

public class Task1 {

	public static void printStudentInfo(ResultSet rs)
	{
		try {
			while(rs.next()) {
				System.out.println("........................");
				System.out.println("Auto id: " + rs.getInt(1));
				System.out.println("First Name: " + rs.getString(2));
				System.out.println("Last Name: " + rs.getString(3));
				System.out.println("Username: " + rs.getString(4));
				System.out.println("Password: " + rs.getString(5));
				System.out.println("........................");
				System.out.println();
			}
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59"))
		{
			Statement s;
			s = con.createStatement();
			
			String createTable = "CREATE TABLE `student` (\n"
					+ "`id` int(11) NOT NULL AUTO_INCREMENT,\n"
					+ "`fname` varchar(50) NOT NULL,\n"
					+ "`lname` varchar(50) NOT NULL,\n"
					+ "`uname` varchar(50) NOT NULL,\n"
					+ "`pass` varchar(50) NOT NULL,\n"
					+ "PRIMARY KEY (`id`)\n"
					+ ")";
			boolean bool = s.execute(createTable);
			System.out.println("Table Created Successfully: "+ bool); 
			
			String insertQuery = "INSERT INTO `student`(`fname`, `lname`, `uname`, `pass`) VALUES( 'sonal', 'mehta', 'sonu', 'test123')";
			int i = s.executeUpdate(insertQuery);
			System.out.println(i + " - rows inserted");
			insertQuery = "INSERT INTO `student`(`fname`, `lname`, `uname`, `pass`) VALUES( 'monal', 'gupta', 'monu', 'test321')";
			i = s.executeUpdate(insertQuery);
			System.out.println(i + " - rows inserted");
			
			String selectQuery = "SELECT * FROM `student`";
			ResultSet rs;
			rs = s.executeQuery(selectQuery);
				
			
			selectQuery = "SELECT * FROM `student`";
            rs = s.executeQuery(selectQuery);

            // Demonstrating various ResultSet methods
            System.out.println("Using ResultSet Methods:");
            System.out.println("----------------------------");
            
            // Absolute method
            rs.absolute(2);
            printStudentInfo(rs);

            // AfterLast method
            rs.afterLast();
            printStudentInfo(rs);

            // BeforeFirst method
            rs.beforeFirst();
            printStudentInfo(rs);

            // First method
            rs.first();
            printStudentInfo(rs);

            // IsFirst method
            System.out.println("Is First: " + rs.isFirst());

            // IsLast method
            System.out.println("Is Last: " + rs.isLast());

            // Last method
            rs.last();
            printStudentInfo(rs);

            // Previous method
            rs.previous();
            printStudentInfo(rs);

            // Next method
            rs.next();
            printStudentInfo(rs);

            // Relative method
            rs.relative(1);
            printStudentInfo(rs);
		} 
		
		catch (SQLException e) {
			System.out.println(e);
		}
	}

}

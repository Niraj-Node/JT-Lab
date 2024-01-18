package mypack;
import java.sql.*;

/*
CREATE TABLE `movies` (
`id` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`genre` varchar(50) NOT NULL,
`relyear` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
*/

class Movie {

	private Integer id = 0;
	private String title;
	private String genre;
	private Integer yearOfRelease;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(Integer yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
	void createMovie(Movie m) 
	{
	    String title = m.title;
	    String genre = m.genre;
	    Integer relyear = m.yearOfRelease;

	    try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59")) 
	    {
	        String insertQuery = "INSERT INTO `movies`(`title`, `genre`, `relyear`) VALUES (?, ?, ?)";

	        try(PreparedStatement ps = con.prepareStatement(insertQuery)) 
	        {
	            ps.setString(1, title);
	            ps.setString(2, genre);
	            ps.setInt(3, relyear);

	            int i = ps.executeUpdate();
	            System.out.println(i + " - rows inserted");
	        }
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}

	
	void deleteMovie(int movieID) 
	{
	    try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59")) 
	    {
	        String deleteQuery = "DELETE FROM `movies` WHERE `id` = ?";
	        
	        try(PreparedStatement ps = con.prepareStatement(deleteQuery)) 
	        {
	            ps.setInt(1, movieID);

	            int i = ps.executeUpdate();
	            System.out.println(i + " - rows deleted");
	        }
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}

	void updateMovieTitle(String title, int id) 
	{
	    try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59")) 
	    {
	        String updateQuery = "UPDATE `movies` SET `title` = ? WHERE `id` = ?";
	        
	        try(PreparedStatement ps = con.prepareStatement(updateQuery)) 
	        {
	            ps.setString(1, title);
	            ps.setInt(2, id);

	            int i = ps.executeUpdate();
	            System.out.println(i + " - rows updated");
	        }
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}
	
	void findMovieById(int movieId) 
	{
	    try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59")) 
	    {
	        String selectQuery = "SELECT * FROM `movies` WHERE `id` = ?";
	        
	        try(PreparedStatement ps = con.prepareStatement(selectQuery)) 
	        {
	            ps.setInt(1, movieId);

	            try(ResultSet rs = ps.executeQuery()) 
	            {
	                while (rs.next()) {
	                    System.out.println("........................");
	                    System.out.println("Auto id: " + rs.getInt(1));
	                    System.out.println("Title: " + rs.getString(2));
	                    System.out.println("Genre: " + rs.getString(3));
	                    System.out.println("yearOfRelease: " + rs.getInt(4));
	                    System.out.println("........................");
	                    System.out.println();
	                }
	            }
	        }
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}


	void findAllMovie() 
	{
	    try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59")) 
	    {
	        String selectQuery = "SELECT * FROM `movies`";

	        try(PreparedStatement ps = con.prepareStatement(selectQuery)) 
	        {
	        	try(ResultSet rs = ps.executeQuery())
	        	{
		            while (rs.next()) {
		                System.out.println("........................");
		                System.out.println("Auto id: " + rs.getInt(1));
		                System.out.println("Title: " + rs.getString(2));
		                System.out.println("Genre: " + rs.getString(3));
		                System.out.println("yearOfRelease: " + rs.getInt(4));
		                System.out.println("........................");
		                System.out.println();
		            }
	        	}
	        }
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}

}

public class Task2 {
	
	public static void main(String[] args) 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.150/ce4_59", "ce4_59", "ce4_59"))
		{
			Statement s;
			s = con.createStatement();
			
			String createTable = "CREATE TABLE `movies` (\n"
					+ "`id` int(11) NOT NULL,\n"
					+ "`title` varchar(50) NOT NULL,\n"
					+ "`genre` varchar(50) NOT NULL,\n"
					+ "`relyear` int(5) NOT NULL\n"
					+ ")";
			boolean bool = s.execute(createTable);
			System.out.println("Table Created Successfully: "+ bool);
		
			Movie m = new Movie();
			m.setTitle("The Shawshank Redemption");
			m.setGenre("Thriller");
			m.setYearOfRelease(1994);
			
			m.createMovie(m);
			m.findMovieById(1);
			m.findAllMovie();
			m.deleteMovie(1);
			m.findAllMovie();
		}
		catch (SQLException e) {
			System.out.println(e);
		} 
	}
}
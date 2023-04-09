package mysqldemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLupdate {

	public static void main(String[] args) throws SQLException {
		
		
		//1. Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","joselxavier");
		
		
		
		//2. Create statement/Query
		
		Statement stmt = con.createStatement();

		
		String s="UPDATE STUDENT SET NAME='ravi' WHERE STUDENT_ID=4";
		
		//3. Execute statment/Query
		
		stmt.execute(s);
		
		// 4.close the connection 
		
		con.close();
		
		
		System.out.println("Query executed");
		
		
	}  
	
}

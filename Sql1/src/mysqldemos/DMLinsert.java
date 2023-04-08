package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//1. Create a connection
//2. Create statement/Query
//3. Execute statment/Query
//4. Store the results in result set
//5.  close connection

public class DMLinsert {

	public static void main(String[] args) throws SQLException {
		
		
		//1. Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","joselxavier");
		
		
		
		//2. Create statement/Query
		
		Statement stmt = con.createStatement();

		
		String s="INSERT INTO STUDENT VALUES(5,'beena')";
		
		//3. Execute statment/Query
		
		stmt.execute(s);
		
		// 4.close the connection 
		
		con.close();
		
		
		System.out.println("Query executed");
		
		
	}  
	
}

package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectCmd {
public static void main(String[] args) throws SQLException {
		
		
		//1. Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","joselxavier");
		
		
		
		//2. Create statement/Query
		
		Statement stmt = con.createStatement();

		
		String s="SELECT * FROM STUDENT";
		
		//3. Execute Query & 4. store in result set 
		
		ResultSet rs = stmt.executeQuery(s);
		
		

		while(rs.next()) {
			
			int student_id=rs.getInt("student_id");
			String name = rs.getString("name");
			
			System.out.println("studentID :" + student_id + "   Name  : "+name);
		}
		
		
		// 4.close the connection 
		con.close();
		
		
		
		System.out.println("Query executed");
		
		
	}  
}

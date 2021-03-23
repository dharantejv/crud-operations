package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Alter
{
	public static void main(String[] args) throws Exception 
	{

		Scanner scan = new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306?user=root&password=12345";

		String query="ALTER TABLE test.studentinfo add COLUMN ? VARCHAR(2)";

		Connection connection=DriverManager.getConnection(url);

		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		System.out.println("enter the attribute");
		
		preparedStatement.setString(1, scan.next());
		
		preparedStatement.execute();
         
	
	}
}

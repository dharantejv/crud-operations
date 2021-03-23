package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Drop 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306?user=root&password=12345";

		String query="alter table test.studentinfo drop fan varchar(1)";

		Connection connection=DriverManager.getConnection(url);

		Statement statement=connection.createStatement();
		
		statement.execute(query);
		
		System.out.println("Added succesfully");
	}
}

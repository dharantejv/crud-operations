package files;

import java.io.File; 
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;


public class Prhj 
{
	public static void main(String[] args) throws Exception
	{	

		Scanner scan = new Scanner(System.in);
		
		File f=new File("D:\\Java programs\\fileprogram1.txt");

		PrintWriter pw=new PrintWriter(f); 
		pw.write("");
		pw.flush();
		pw.close();
		System.out.println("no.of records");
		int a=scan.nextInt();
		for(int i =1;i<=a;i++)
		{
			ArrayList a1=new ArrayList();
			System.out.println("Enter first name");
			a1.add(scan.next());
			System.out.println("Enter second name");
			a1.add(scan.next());
			System.out.println("Enter the mobile number");
			a1.add(scan.nextLong());
			System.out.println("Enter the latitude location");
			a1.add(scan.nextDouble());

			ListIterator i1=a1.listIterator();

			Object o1=i1.next();
			String firstname=(String)o1;

			Object o2=i1.next();
			String lastname=(String)o2;

			Object o3=i1.next();
			long mobileNumber=(long)o3;

			Object o4=i1.next();
			Double latloc=(Double)o4;

			FileWriter fw=new FileWriter(f);
			fw.write(firstname+" , "+lastname+" , "+mobileNumber+" , "+latloc);
			fw.close();

			String url="jdbc:mysql://localhost:3306?user=root&password=12345";

			String query="insert into test.studentinfo values(?,?,?,?)";

			Connection connection=DriverManager.getConnection(url);

			PreparedStatement preparedStatement=connection.prepareStatement(query);

			preparedStatement.setString(1,firstname );

			preparedStatement.setString(2,lastname );

			preparedStatement.setLong(3,mobileNumber);

			preparedStatement.setDouble(4,latloc);

			preparedStatement.executeUpdate();
			
		}
		scan.close();	
		PrintWriter pw1=new PrintWriter(f); 
		pw1.write("");
		pw1.flush();
		pw1.close();

	} 
} 


 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbCRUD {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connect2DB();
		CreateTable();
		InserData();
		UpdateData();
		Showdata();
		Deletedata();
		

	}
	
	public static void Connect2DB()
	{
	Connection con=null;
	
	try
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgres");
	}
	catch(Exception e)
	{
		System.err.println(e.getClass().getName() + ": " + e.getMessage());
		System.exit(0);
	}
	System.out.println("Connected to database successfully");
	}
	
	public static void CreateTable()
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgres");
		System.out.println("Connection established");
		stmt=con.createStatement();
		String query="CREATE TABLE IF NOT EXISTS Employee1 (EmpId INTEGER PRIMARY KEY, EmpName CHAR(50) NOT NULL, EmpDesignation  TEXT  NOT NULL, added_on DATE NOT NULL DEFAULT CURRENT_DATE)";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("table created successfully");
	}
	
	public static void InserData()
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgres");
		System.out.println("Connection established");
		stmt=con.createStatement();
		String query="insert into Employee1 (EmpId , EmpName , EmpDesignation ) values"+ "(7,'Testuser7','Trainee')";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("data inserted successfully");
	}
		
	public static void UpdateData()
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","postgres");
			stmt=con.createStatement();
			String Query="Update Employee set empdesignation='Account manager' where EmpId=1";
			stmt.executeUpdate(Query);
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("data updated succesfully");
	}

	public static void Showdata()
	{
		Connection con=null;
		Statement stmt=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","postgres");
			stmt=con.createStatement();
			String query="Select * from Employee1";
			ResultSet rs = stmt.executeQuery( query);
	         while ( rs.next() ) {
	            int id = rs.getInt("EmpId");
	            String  name = rs.getString("EmpName");
	           
	            String  designation = rs.getString("EmpDesignation");
	            String date = rs.getString("added_on");
	            System.out.println( "EmpID = " + id );
	            System.out.println( "EmpNAME = " + name );
	            System.out.println( "Emp Designation = " + designation );
	            System.out.println( "Added on = " + date );
	           
	            System.out.println();
	         }
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("Employees information");
	}
	public static void Deletedata()
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","postgres");
			stmt=con.createStatement();
			String query="DELETE from Employee where EmpId=7";
			stmt.executeUpdate(query);
			stmt.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("data deleted successfully");
	}
}

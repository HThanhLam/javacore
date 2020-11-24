package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.*;
import utils.Scannerutils;

public class ProjectRepository{
	public int print_project_member(String projectname) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		int a=0;
		String mysl= "SELECT id,Fullname,Email FROM Employee WHERE Employee.ID in (SELECT idEmployees FROM Project WHERE ProjectName=? group by idEmployees) UNION " 
			+	"SELECT id,Fullname,Email FROM Manager WHERE  Manager.ID in (SELECT idManager FROM Project WHERE ProjectName=? group by idEmployees)" ;
		String URL= "jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="0914661056";
		Connection conn = DriverManager.getConnection(URL, username, password);
		PreparedStatement mStat= conn.prepareStatement(mysl);
		mStat.setString(1,projectname);
		mStat.setString(2,projectname);
		ResultSet myResult= mStat.executeQuery();
		System.out.printf("%-15s %-25s %-25s\n", "ID", "Email", "Fullname");
		while(myResult.next())
		{	
		System.out.printf("%-15s %-25s %-25s\n", myResult.getString("id"), myResult.getString("FullName"), myResult.getString("Email"));
			
		};
		conn.close();
		mStat.close();
		return a;
	 };
	 public List<Manager> print_Manager() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		 	List<Manager> a= new ArrayList<Manager>();
		 String URL= "jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="0914661056";
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement mStat= conn.createStatement();
			ResultSet myResult= mStat.executeQuery("  SELECT * FROM Manager WHERE id in (SELECT idManager FROM Project )");
			while(myResult.next())
			{	Manager b= new Manager();
				b.setId(myResult.getInt("id"));
				b.setFullname(myResult.getString("FullName"));
				b.setEmail(myResult.getString("Email"));
				b.setExpInYear(myResult.getInt("ExpInYear"));
				b.setPassword(myResult.getString("password"));
				a.add(b);
			};
			conn.close();
			mStat.close();
			return a;
	 }
	 public String login (String Email,String Password) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		 Scannerutils a= new Scannerutils();
		 String URL= "jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="0914661056";
			Connection conn = DriverManager.getConnection(URL, username, password);
			String mysql="SELECT Email,password FROM Employee UNION  "
					+ "	SELECT Email,password FROM Manager  ";
			Statement mStat= conn.createStatement();
			ResultSet myRE= mStat.executeQuery(mysql);
		while(true){
		 while(myRE.next()){
			 if( myRE.getString("Email").equals(Email) && myRE.getString("password").equals(Password) ) {
				 String a1="login success";
				 return a1;
			 }
		
		 };
	
	 
}
}
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFronDataBase {

	public static void main(String[] args) throws SQLException {
		
		Driver dbDriver=new Driver();
		
		DriverManager.registerDriver(dbDriver);
		
		
		
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz", "root","root");
		
		Statement statement=connect.createStatement();
		ResultSet result=statement.executeQuery("select*from students;");
		//int result=statement.executeUpdate("insert into students(id,name,adress)values(103,'xyz','hyderabad')");
		
		while(result.next()) {
			System.out.println(result.getString("id")+result.getString("name")+"\t"+result.getString("adress"));
		
		}
		
		
		
		
		//if(result==1)
			//System.out.println("DB Updated suuceccfully");
		//else
			//System.out.println("DB Not Updated");
	
		connect.close();
		
		
		

	}

}

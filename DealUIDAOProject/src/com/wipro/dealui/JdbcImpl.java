package com.wipro.dealui;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JdbcImpl {
	public static void main(String[] args){
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs=null;
		try {
			OracleDriver driver =new OracleDriver();
					//(OracleDriver) Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
			DriverManager.registerDriver(driver);
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String password="tiger";
			//jdbc:oracle::thin:@localhost:5560:XE?user=scott&password=tiger
			con=DriverManager.getConnection(url,user,password);
			String query ="select * from person";
			stmt= con.createStatement();
			
			rs= stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString(1));
				//System.out.println(rs.getNString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));
				System.out.println(rs.getTimestamp(3)); //getting date as timestamp
				//System.out.println(rs.getDate(4)); //getting timestamp as date
				System.out.println(rs.getTimestamp(4));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

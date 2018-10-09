package com.cg.learning.util;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DBUtil {

	private static Connection con;
	public static Connection getConnection(){
		
		try {
			InitialContext context= new InitialContext();
			DataSource ds= (DataSource) context.lookup("java:/jdbc/OracleDS");
    		 con= ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
			
	
	}
}

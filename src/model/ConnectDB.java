package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectDB {
	private static Connection instance;
    public static Connection getInstance(){
        if(instance == null){
            instance =  connect();
        }
        return instance;
    }
	public static  Connection connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			String connectionUrl = "jdbc:sqlserver://localhost;database=J2EE;integratedSecurity=true;user=sa;password=sa" ; 
			Connection con = DriverManager.getConnection(connectionUrl); 
			return con;
		} catch (SQLException | ClassNotFoundException e ) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	public  void thucThiSQL(String sql) throws Exception{
		Statement stmt = getInstance().createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet chonDuLieu(String sql) throws Exception{
		Statement stmt = getInstance().createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	}
	public static void main(String[] args) {
		
	}
}
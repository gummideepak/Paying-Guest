/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sit-dt-9
 */
public class DBConnection {
    public static java.sql.Connection con;
static{
	try {
		Class.forName(DBIntializer.DRIVER);
		con=DriverManager.getConnection(DBIntializer.CON_STRING,DBIntializer.USERNAME,DBIntializer.PASSWORD);
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
	
		System.out.println("Exception in Connection");
	}
	
}
public static java.sql.Connection getConnection(){
	return con;
}
}

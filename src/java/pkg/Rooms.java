/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static pkg.Authentication.con;

/**
 *
 * @author sit-dt-9
 */
public class Rooms {
    static Connection con;
    static{
        con = DBConnection.getConnection();
    }
    public int addRooms(String username,String address,String city,String locality,String maxP,String gender,String rooms,String ac,String wifi,String food,String cost){
        PreparedStatement ps;
        int status =0;
	try {
               // con = DBConnection.getConnection();
		ps = con.prepareStatement("Insert into rooms values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,address);
		ps.setString(3,city);
                ps.setString(4,locality);
		ps.setString(5,maxP);
		ps.setString(6,gender);
		ps.setString(7,rooms);
                ps.setString(8,ac);
                ps.setString(9,wifi);
                ps.setString(10,food);
                ps.setString(11,cost);
                ps.setString(12,"A");
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
        return status;   
    }
}

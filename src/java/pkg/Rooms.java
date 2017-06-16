/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletResponse;
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
    
    public void searchByCity(String city,HttpServletResponse response){
        String query="SELECT * FROM rooms WHERE CITY='"+city+"'";
        try{
        //System.out.println("assssssssssssssssssss");
        PreparedStatement st = con.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        PrintWriter out = response.getWriter();
        if(rs.next()){
        //System.out.println(rs.getString(1));
           out.println("<");
        }
        else 
        out.println("NO");
        }
        catch(Exception e){
            System.out.println("Exception in auth");
            e.printStackTrace();
        }
    }
}

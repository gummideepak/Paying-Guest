/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
/**
 *
 * @author sit-dt-9
 */
public class Authentication {
    
    static Connection con;
    static{
        con = DBConnection.getConnection();
    }
    public int register(String username,String password,String name,String dob,String email,String gender,String contact){
	PreparedStatement ps;
        int status =0;
	try {
               // con = DBConnection.getConnection();
		ps = con.prepareStatement("Insert into registration values(?,?,?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,name);
                ps.setString(4,dob);
		ps.setString(5,email);
		ps.setString(6,gender);
		ps.setString(7,contact);
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
        return status;
    }
    
    public boolean login(String username,String password){
        String query="SELECT * FROM registration WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'";
        try{
        //System.out.println("assssssssssssssssssss");
        PreparedStatement st = con.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        
        if(rs.next()){
        //System.out.println(rs.getString(1));
            return true;
        }
        else 
        return false;
        }
        catch(Exception e){
            System.out.println("Exception in auth");
            e.printStackTrace();
        }
        return false;
        
        
    }
    
    
    public boolean sendEmail(String username,String email){
       //Mailer mail = new Mail();
       //from,password,to,subject,message 
       Random r = new Random();
       int pin = r.nextInt(10000)+1000;
     boolean sent = Mailer.send("deepak.sai231254@gmail.com","deepak2354",email,"Paying Guest Email Verification",String.valueOf(pin));  
     //change from, password and to 
     if(sent){
         PreparedStatement ps;
         try{
             ps=con.prepareStatement("INSERT INTO validity values(?,?,?,?)");
             ps.setString(1,username);
             ps.setString(2,String.valueOf(pin));
             ps.setString(3,"0");//sms
             ps.setString(4,"NA");
             int stored=ps.executeUpdate();
             return true;
         }
         catch(Exception e){}
     }
  
         return false;
       
    }
    
    public boolean verifyPhoneNumber(String number){
        
        return false;
    }
    
    
    public boolean verifyEOTP(String username,String otp){
        Statement stm=null;
        String query = "select * from validity where username='"+username+"' and epin='"+otp+"';";
        try{
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if(rs.next()){
                PreparedStatement ps = con.prepareStatement("UPDATE validity SET status='A' WHERE username='"+username+"';");
                ps.executeUpdate();
                return true;
            }
            else 
                return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
}

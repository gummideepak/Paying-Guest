/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sit-dt-9
 */
public class RegisterServletController extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                        
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int status=0;
                int sent = 0;
		String name=request.getParameter("reg_name");
		//String lastname=request.getParameter("reg_lname");
		String  email=request.getParameter("reg_email");
                String  username=request.getParameter("reg_uname");
                String  password=request.getParameter("reg_password");
                String  dob=request.getParameter("reg_dob");
                String  gender=request.getParameter("reg_gender");
                String  contact=request.getParameter("reg_contact");
                
                
        Authentication au = new Authentication();
        //verify email and passowrd
        status = au.register(username, password,name,dob, email, gender, contact);
        //insterted into database
	if(status>0){
		out.print("<center>WELCOME! YOUR ACCOUNT HAS OPENED PLEASE VERIFY YOUR EMAIL TO GAIN FULL ACESS</center>");
                au.sendEmail(username,email);//Send otp to mail and store the OTP in Validity Data Base.
                //Send OTP to phone << PENDING >>
		RequestDispatcher rd=request.getRequestDispatcher("verifyotp.html");
		rd.include(request, response);
	}
	else{
		out.print("<center>Sorry,Registration failed. please try later</center>");
                RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.include(request, response);
	}
	out.close();	
	}

}


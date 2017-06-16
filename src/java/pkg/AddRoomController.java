/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sit-dt-9
 */
public class AddRoomController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //out.println("AddRoom Servelet Called");
        Rooms rm = new Rooms();
        HttpSession se = request.getSession();
        String username = (String) se.getAttribute("username");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String locality = request.getParameter("locality");
        String maxP = request.getParameter("maxpeople");
        String gender = request.getParameter("gender");
        String rooms = request.getParameter("rooms");
        String ac = request.getParameter("ac");
        String wifi = request.getParameter("wifi");
        String food = request.getParameter("food");
        String cost = request.getParameter("cost");
        //out.println(username + address + city + locality + maxP + gender + rooms + ac + wifi + food);
        int status = rm.addRooms(username, address, city, locality, maxP, gender, rooms, ac, wifi, food,cost);
        if(status>0){
                
                response.sendRedirect("home.jsp?status="+status);
		
	}
	else{
		response.sendRedirect("home.jsp?status="+status);
                
	}
        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

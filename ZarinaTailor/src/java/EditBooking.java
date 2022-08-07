/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ahmad Dannial Dzulkarnain
 */
public class EditBooking extends HttpServlet {

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
        PrintWriter out=response.getWriter();
        out.println("<h1>Update User</h1>");
        String sid = request.getParameter("id");
        int id=Integer.parseInt(sid);
        
        Booking e=BookingDao.getBookingById(id);
        
        out.print("<form action='EditBooking2' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"
                +e.getId()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"
                +e.getName()+"'/></td></tr>");
        out.print("<tr><td>Email</td><td><input type='text' name='email' value='"
                +e.getEmail()+"'/></td></tr>");
        out.print("<tr><td>Services:</td><td>");
        out.print("<select name='services' style='width:150px'>");
        out.print("<option>Select Options</option>");
        out.print("<option>Zip Changes</option>");
        out.print("<option>Waist Pant Changing</option>");
        out.print("<option>Change or add new clothes sponge</option>");
        out.print("<option>Modifying clothes size</option>");
        out.print("<option>Modifying blazer or coat</option>");
        out.print("<option>Make sleeping pillow & decoration on cushion pillow</option>");
        out.print("<option>Curtain stiching</option>");
        out.print("<option>Women's clothing stiching</option>");
        out.print("</select>");
        out.print("<tr><td>Description</td><td><input type='text' name='description' value='"
                +e.getDescription()+"'/></td></tr>");
        out.print("</td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save'/></td></tr>");
        out.print("</table>");
        out.print("</form>");
        
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

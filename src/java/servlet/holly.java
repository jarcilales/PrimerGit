/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osojo
 */
@WebServlet(name = "holly", urlPatterns = {"/holly"})
public class holly extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

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
        String usuario=request.getParameter("usuario");
         String contra=request.getParameter("pwd");
          String sexo=request.getParameter("sexo");
          String pelicula=request.getParameter("pelicula");
          
       response.setContentType("text/html; charset=UTF-8");
       PrintWriter out = response.getWriter();
       out.println("<DOCTYPE html>");
       out.println("<html");
       out.println("<head>");
       out.println("<title>holi soy servlet</title>");
       out.println("</head>");
       out.println("<body>"
               + "<h1>Si estas viendo esto el "+usuario +" es gay</h1>"
               +"<h1>Holi deja te enseño mi contraseña "+contra +" jeje</h1>"
               +"<h1>Yo soy de genero "+sexo +" como la ves?</h1>"
               +"<h1>Mi pelicula favorita es "+pelicula+"</h1>"
               + "</body>");
       out.println("</html>");
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

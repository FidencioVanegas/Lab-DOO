/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Metal
 */
@WebServlet(urlPatterns = {"/Formulario"})
public class Formulario extends HttpServlet {

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
        
            /* TODO output your page here. You may use following sample code. */
        
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
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css.css\">");
            out.println("<title>Formulario</title>");            
            out.println("</head>");
            out.println("<body background=\"fondo.jpg\">");
            out.println("<form action=\"Formulario\" method=\"post\">");
            out.println("<h1><center>Formulario</h1><br>");
            out.println("<p>Nombre(s): <input type = \"text\" name = \"nombre\"><br>");
            out.println("Apellido Paterno: <input type = \"text\" name = \"ApellidoP\"><br>");
            out.println("Apellido Materno: <input type = \"text\" name = \"ApellidoM\"><br>");
            out.println("Correo Electronico: <input type = \"text\" name = \"Correo\"><br>");
            out.println("Contraseña: <input type = \"password\" name = \"Contra\"><br>");
            out.println("Fecha de nacimiento: <input type = \"date\" name = \"FechaN\"><br>");
            out.println("<input type=\"submit\" value=\"Enviar\"/></p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css.css\">");
            out.println("<title>Formulario</title>");            
            out.println("</head>");
            out.println("<body background=\"fondo.jpg\">");
            out.println("<h1><center>Formulario</h1><br>");
            out.println("<p>Nombre:"+ request.getParameter("nombre")+" "+ request.getParameter("ApellidoP")+" "+ request.getParameter("ApellidoM") +"<br>");
            out.println("Correo Electronico:"+ request.getParameter("Correo") + "<br>");
            out.println("Contraseña:"+ request.getParameter("Contra")+"<br>");
            out.println("Fecha de nacimiento:" + request.getParameter("FechaN")+"<br></p>");
            out.println("</body>");
            out.println("</html>");
        }
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

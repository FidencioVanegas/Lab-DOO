/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Metal
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        /*try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
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
        
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            
            String user = request.getParameter("usuario");
            String pass = request.getParameter("contra");
            Cookie cookieuser = new Cookie("user", user);
            Cookie cookiepass = new Cookie ("pass", pass);
            response.addCookie(cookieuser);
            response.addCookie(cookiepass);
           
            long creationTime = session.getCreationTime();
            long lastAccessedTime = session.getLastAccessedTime();
            Date createDate= new Date(creationTime);
            Date lastAccessedDate= new Date(lastAccessedTime);
            
            Integer contador = (Integer)session.getAttribute("counter");
            if(contador==null)
            {
                contador=1;
                session.setAttribute("counter",contador);
            }
            else 
            {
                session.setAttribute("counter",contador+1);
            }
            out.println("<HTML> <HEAD> </HEAD> <BODY><FORM action=\"Logout\" type=\"POST \">");
            if(contador > 1)
            {
                out.println("<h1>Bienvido de nuevo</h1>");
            }
            else
            {
                out.println("<h1>Bienvedo</h1>");
            }
            //agregar el logout 
            out.println(" <BR/> ");
            out.println("<STRONG> Tiempo de Creacion: </STRONG>: " + createDate);
            out.println(" <BR/> ");
            out.println("<STRONG> Ultimo acceso: </STRONG>" + lastAccessedDate);
            out.println(" <BR/> ");
            out.println("<STRONG> contador </STRONG>: " + contador);
            out.println("<input type=\"submit\" value=\"Logout\"> ");
            out.println("</FORM> </BODY> </HTML> ");
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

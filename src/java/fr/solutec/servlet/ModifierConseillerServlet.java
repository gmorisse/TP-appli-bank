/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.servlet;

import fr.solutec.dao.PersonDao;
import fr.solutec.model.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pierre
 */
@WebServlet(name = "ModifierConseillerServlet", urlPatterns = {"/ModifierConseiller"})
public class ModifierConseillerServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ModifierConseillerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ModifierConseillerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession session = request.getSession(true);
        Person p = (Person) session.getAttribute("userConnect");
        if (p != null) {
            try {
                request.getRequestDispatcher("WEB-INF/ModifierConseiller.jsp").forward(request, response);

            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.println("exp : " + e.getMessage());
            }
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
        String login = request.getParameter("loginDemande");

        try {
            Person p = PersonDao.getByLogin(login);
            
            if (login.equals(p.getLogin()) && PersonDao.isConseiller(p)){
                /*request.setAttribute("nom", p.getNom());
                request.setAttribute("prenom", p.getPrenom());
                request.setAttribute("login", p.getLogin());
                request.setAttribute("email", p.getMail());*/
                request.setAttribute("pers", p);
                request.setAttribute("isConseiller", PersonDao.isConseiller(p));
                request.getRequestDispatcher("WEB-INF/ModifierConseiller.jsp").forward(request, response);
            }
            else {
                request.setAttribute("msg", "Login incorrect");
                request.getRequestDispatcher("WEB-INF/ModifierConseiller.jsp").forward(request, response);
            }
           
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print("err : " + e.getMessage());
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

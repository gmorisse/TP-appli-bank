/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.servlet;

import fr.solutec.dao.*;
import fr.solutec.model.*;
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
 * @author btern
 */
@WebServlet(name = "CreationConseillerServlet", urlPatterns = {"/CreationConseiller"})
public class CreationConseillerServlet extends HttpServlet {

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
            out.println("<title>Servlet CreationConseillerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreationConseillerServlet at " + request.getContextPath() + "</h1>");
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
                request.getRequestDispatcher("WEB-INF/Creation_Conseiller.jsp").forward(request, response);

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
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String login = request.getParameter("login");
        String password = request.getParameter("pwd");
        String mail = request.getParameter("mail");

        Person p = new Person(1, nom, prenom, login, password, mail);
        if (PersonDao.inscriptionValide(p)) {
            try {
                PersonDao.insertConseiller(p);

            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.print("exp : " + e.getMessage());
            }
            request.getRequestDispatcher("WEB-INF/Admin.jsp").forward(request, response);
        } else {
            request.setAttribute("msgInscription", "Veuillez remplir tous les champs");
            request.getRequestDispatcher("WEB-INF/Creation_Conseiller.jsp").forward(request, response);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cédric
 */
public class Inscription extends HttpServlet {

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
            out.println("<title>Servlet Inscription</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Inscription at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupération des paramètres du formulaire
        String nom = request.getParameter("nom");
        String sexe = request.getParameter("sexe");
        String naissance = request.getParameter("naissance");
        String salaire = request.getParameter("salaire");
        String longitude = request.getParameter("longitude");
        String poids = request.getParameter("poids");
        String couleur = request.getParameter("couleur");
        String bacc = request.getParameter("bacc");
        String finoana = request.getParameter("finoana");
        String fiangonana = request.getParameter("fiangonana");
        String lettre = request.getParameter("lettre");

        CallAPI api = new CallAPI();
        boolean val = api.callInscriptionAPI(
                nom,
                sexe,
                naissance,
                salaire,
                longitude,
                poids,
                couleur,
                bacc,
                finoana,
                fiangonana,
                lettre);

        if (val) {
            response.sendRedirect("preference.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupération des paramètres du formulaire
        String client_id = request.getParameter("client_id");
        String sexe = request.getParameter("sexe");

        String naissance1 = request.getParameter("naissance1");
        String naissance2 = request.getParameter("naissance2");
        String naissance3 = request.getParameter("naissance3");

        String salaire1 = request.getParameter("salaire1");
        String salaire2 = request.getParameter("salaire2");
        String salaire3 = request.getParameter("salaire3");

        String longitude1 = request.getParameter("longitude1");
        String longitude2 = request.getParameter("longitude2");
        String longitude3 = request.getParameter("longitude3");

        String poids1 = request.getParameter("poids1");
        String poids2 = request.getParameter("poids2");
        String poids3 = request.getParameter("poids3");

        String couleur1 = request.getParameter("couleur1");
        String couleur2 = request.getParameter("couleur2");
        String couleur3 = request.getParameter("couleur3");

        String bacc1 = request.getParameter("bacc1");
        String bacc2 = request.getParameter("bacc2");
        String bacc3 = request.getParameter("bacc3");

        String finoana1 = request.getParameter("finoana1");
        String finoana2 = request.getParameter("finoana2");

        String fiangonana1 = request.getParameter("fiangonana1");
        String fiangonana2 = request.getParameter("fiangonana2");
        String fiangonana3 = request.getParameter("fiangonana3");

        String note = request.getParameter("note");

        CallAPI api = new CallAPI();
        Object[] ret = api.callGiveMyLoveAPI(client_id,sexe,naissance1,naissance2,naissance3, salaire1,salaire2,salaire3, longitude1,longitude2,longitude3,poids1,poids2,poids3,couleur1, couleur2, couleur3, bacc1, bacc2,bacc3, finoana1,finoana2,fiangonana1,fiangonana2,fiangonana3,note);

        request.getSession().setAttribute("liste", ret);
        response.sendRedirect("liste.jsp");
    }
}

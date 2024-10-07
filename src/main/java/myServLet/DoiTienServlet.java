/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myServLet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class DoiTienServlet extends HttpServlet {

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
            String sotienParam = request.getParameter("sotien");
            String ngoaiteParam = request.getParameter("ngoaite");
            double sotien = Double.parseDouble(sotienParam);
            double tyGia = 0.0;
            switch (ngoaiteParam) {
                case "USD":
                    tyGia = 21380.00;
                    break;
                case "GBP":
                    tyGia = 32622.80;
                    break;
                case "EUR":
                    tyGia = 23555.67;
                    break;
                case "JPY":
                    tyGia = 178.61;
                    break;
                case "AUD":
                    tyGia = 16727.44;
                    break;
            }
            double tienVND = sotien * tyGia;
            out.println("<html><body>");
            out.println("<h2>Kết quả chuyển đổi tiền tệ</h2>");
            out.println("<p>Số tiền: " + sotien + " " + ngoaiteParam + "</p>");
            out.println("<p>Tỷ giá: 1 " + ngoaiteParam + " = " + tyGia + " VND</p>");
            out.println("<p>Số tiền sau khi chuyển đổi: " + tienVND + " VND</p>");
            out.println("</body></html>");
            out.println("<html><body>");
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
        protected void doGet
        
            (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo  
            () {
        return "Short description";
        }// </editor-fold>
    }



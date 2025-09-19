package com.poly.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UrlInfoServlet", urlPatterns = {"/urlinfo/*"})
public class UrlInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<html><body style='font-family:Arial;'>");
            out.println("<h2>Thông tin URL</h2>");
            out.println("<ul>");
            out.println("<li><b>URL:</b> " + request.getRequestURL().toString() + "</li>");
            out.println("<li><b>URI:</b> " + request.getRequestURI() + "</li>");
            out.println("<li><b>QueryString:</b> " + request.getQueryString() + "</li>");
            out.println("<li><b>ServletPath:</b> " + request.getServletPath() + "</li>");
            out.println("<li><b>ContextPath:</b> " + request.getContextPath() + "</li>");
            out.println("<li><b>PathInfo:</b> " + request.getPathInfo() + "</li>");
            out.println("<li><b>Method:</b> " + request.getMethod() + "</li>");
            out.println("</ul>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
      
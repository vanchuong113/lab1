package com.poly.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletSecurityElement;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/poly/hello.php")
public class helloservlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException{
	resp.getWriter().println("<h1>FPT polytechnic</h1>");
}
}
	
package lab2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/UserServlet")
public class bai2 extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        // Gửi message
        req.setAttribute("message", "Welcome to FPT Polytechnic");

        // Tạo map user
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", "Male");
        map.put("country", "Việt Nam");

        // Đặt attribute user
        req.setAttribute("user", map);

        // Forward sang JSP
        req.getRequestDispatcher("view/page.jsp").forward(req, resp);
    }
}

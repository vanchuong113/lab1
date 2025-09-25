package lab2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/form/update")
public class bai3 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Tạo dữ liệu user mặc định
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", true);   // true = Male, false = Female
        map.put("country", "VN");

        // Gửi dữ liệu sang JSP
        req.setAttribute("user", map);
        req.setAttribute("editable", true); // true = cho phép chỉnh sửa

        // Forward sang form.jsp
        req.getRequestDispatcher("/view/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String fullname = req.getParameter("fullname");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");

        System.out.println("Fullname: " + fullname);
        System.out.println("Gender: " + gender);
        System.out.println("Country: " + country);

        // Forward lại về form.jsp
        req.getRequestDispatcher("/view/form.jsp").forward(req, resp);
    }

}

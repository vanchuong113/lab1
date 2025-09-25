package lab2;


	import java.io.IOException;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/form/Update")
	public class FormServlet extends HttpServlet {
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        // Tạo dữ liệu mặc định
	        user bean = new user();
	        bean.setFullname("Nguyễn Văn Tèo");
	        bean.setGender(true);
	        bean.setCountry("VN");

	        // Gửi qua JSP
	        req.setAttribute("user", bean);
	        req.setAttribute("editable", true);

	        req.getRequestDispatcher("/view/bai4.jsp").forward(req, resp);
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        // Lấy dữ liệu từ form
	        String fullname = req.getParameter("fullname");
	        boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
	        String country = req.getParameter("country");

	        // Đổ lại vào bean
	        user bean = new user();
	        bean.setFullname(fullname);
	        bean.setGender(gender);
	        bean.setCountry(country);

	        // Gửi lại dữ liệu qua JSP
	        req.setAttribute("user", bean);
	        req.setAttribute("editable", false);

	        req.getRequestDispatcher("/view/bai4.jsp").forward(req, resp);
	    }
}

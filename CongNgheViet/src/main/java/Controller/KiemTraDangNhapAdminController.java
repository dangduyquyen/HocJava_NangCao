package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Adminbean;
import bo.Adminbo;

/**
 * Servlet implementation class KiemTraDangNhapAdminController
 */
@WebServlet("/KiemTraDangNhapAdminController")
public class KiemTraDangNhapAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KiemTraDangNhapAdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminName = request.getParameter("adminname");
		String adminPassword = request.getParameter("adminpassword");

		if (adminName != null && adminPassword != null) {

			Adminbo adminbo = new Adminbo();
			Adminbean admin = adminbo.dangNhapAdmin(adminName, adminPassword);

			if (admin != null) {
				HttpSession session = request.getSession();
				session.setAttribute("admin", admin);
				response.sendRedirect("Admin.jsp ");
			} else {
				String tbLogin = "Tên tài khoản hoặc mật khẩu không chính xác!";
				request.setAttribute("tbLogin", (String) tbLogin);
				RequestDispatcher rd = request.getRequestDispatcher("DangNhapAdmin.jsp");
				rd.forward(request, response);
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("DangNhapAdmin.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHangbean;
import bo.KhachHangbo;

/**
 * Servlet implementation class KiemTraDangNhapUserController
 */
@WebServlet("/KiemTraDangNhapUserController")
public class KiemTraDangNhapUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KiemTraDangNhapUserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if (userName != null && password != null) {

			KhachHangbo khbo = new KhachHangbo();
			KhachHangbean kh = khbo.dangNhapUser(userName, password);

			if (kh != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", kh);
				response.sendRedirect("HomeController");
			} else {
				String tbLogin = "Tên tài khoản hoặc mật khẩu không chính xác!";
				request.setAttribute("tbLogin", (String) tbLogin);
				RequestDispatcher rd = request.getRequestDispatcher("DangNhap.jsp");
				rd.forward(request, response);
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("DangNhap.jsp");
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

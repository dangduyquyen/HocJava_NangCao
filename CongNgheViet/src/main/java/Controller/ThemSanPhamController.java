package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.GioHangbo;

/**
 * Servlet implementation class ThemSanPhamController
 */
@WebServlet("/ThemSanPhamController")
public class ThemSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemSanPhamController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String maSP = request.getParameter("maSP");
		String tenSP = request.getParameter("tenSP");
		long giaSP = Long.parseLong(request.getParameter("giaSP"));
		String anhSP = request.getParameter("anhSP");

		GioHangbo gh;

		if (session.getAttribute("gio") == null) {
			gh = new GioHangbo();
			session.setAttribute("gio", gh);
		}

		gh = (GioHangbo) session.getAttribute("gio");
		gh.themSanPham(maSP, tenSP, giaSP, 1, anhSP);
		session.setAttribute("gio", gh);

		response.sendRedirect("GioHangController");
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

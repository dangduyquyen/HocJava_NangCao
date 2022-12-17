package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHangbean;
import bean.LichSuDonHangbean;
import bo.LichSuDonHangbo;

/**
 * Servlet implementation class LichSuDonHangController
 */
@WebServlet("/LichSuDonHangController")
public class LichSuDonHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LichSuDonHangController() {
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
		KhachHangbean kh = (KhachHangbean) session.getAttribute("user");

		if (kh == null) {
			response.sendRedirect("KiemTraDangNhapUserController");
		} else {
			LichSuDonHangbo lsbo = new LichSuDonHangbo();
			ArrayList<LichSuDonHangbean> ds = new ArrayList<LichSuDonHangbean>();
			ds = lsbo.getDonHang(kh.getMaKhachHang());

			request.setAttribute("dsDonHang", ds);
			RequestDispatcher rd = request.getRequestDispatcher("LichSuDonHang.jsp");
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

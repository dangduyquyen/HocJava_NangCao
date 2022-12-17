package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GioHangbean;
import bean.KhachHangbean;
import bo.ChiTietDonHangbo;
import bo.GioHangbo;
import bo.HoaDonbo;

/**
 * Servlet implementation class DatHangController
 */
@WebServlet("/DatHangController")
public class DatHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DatHangController() {
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
			GioHangbo gh = (GioHangbo) session.getAttribute("gio");
			HoaDonbo hdbo = new HoaDonbo();
			ChiTietDonHangbo ctbo = new ChiTietDonHangbo();
			hdbo.them(kh.getMaKhachHang());
			long maxHD = hdbo.getMaxHD();
			for (GioHangbean g : gh.ds) {
				ctbo.Them(maxHD, g.getMaSP().trim(), g.getSoLuong());
			}
			session.removeAttribute("gio");
			response.sendRedirect("LichSuDonHangController");
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

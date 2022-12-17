package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.ChiTietDonHangbo;
import bo.HoaDonbo;

/**
 * Servlet implementation class AdminXacNhanDonHangController
 */
@WebServlet("/AdminXacNhanDonHangController")
public class AdminXacNhanDonHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminXacNhanDonHangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maHoaDon = request.getParameter("maHD");
		String tbXacNhan = null;
		if (maHoaDon != null) {
			long maHD = Long.parseLong(maHoaDon);
			HoaDonbo dhbo = new HoaDonbo();
			ChiTietDonHangbo ctbo = new ChiTietDonHangbo();
			if (dhbo.xacNhanDH(maHD) == true && ctbo.xacNhanCTDH(maHD) == true) {
				tbXacNhan = "Xác nhận đơn hàng thành công!";
			} else {
				tbXacNhan = "Xác nhận đơn hàng thành công!";
			}
		}
		request.setAttribute("tbXacNhan", (String) tbXacNhan);
		RequestDispatcher rd = request.getRequestDispatcher("QuanLyDonHangController");
		rd.forward(request, response);
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

package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.KhachHangbo;

/**
 * Servlet implementation class DangKyController
 */
@WebServlet("/DangKyController")
public class DangKyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangKyController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String hoTen = request.getParameter("hoTen");
		String email = request.getParameter("email");
		String diaChi = request.getParameter("diaChi");
		String SDT = request.getParameter("SDT");
		String tenDN = request.getParameter("tenDN");
		String matKhauDN = request.getParameter("matKhauDN");
		KhachHangbo khbo = new KhachHangbo();
		if (khbo.KiemTraTenDN(tenDN)) {
			if (hoTen.equals("") || email.equals("") || diaChi.equals("") || SDT.equals("") || tenDN.equals("")
					|| matKhauDN.equals("")) {
				String thongBaoThieuThongTin = "Vui lòng nhập đầy đủ thông tin!";
				request.setAttribute("tbThieuThongTin", thongBaoThieuThongTin);
				RequestDispatcher rd = request.getRequestDispatcher("DangKy.jsp");
				rd.forward(request, response);
			} else {

				khbo.themTKKH(hoTen, email, diaChi, SDT, tenDN, matKhauDN);
				response.sendRedirect("DangNhap.jsp");
			}
		} else {
			String thongBaoLoiTenDN = "Tên đăng nhập của bạn đã tồn tại. Chọn tên khác!";
			request.setAttribute("tbLoiTenDN", thongBaoLoiTenDN);
			RequestDispatcher rd = request.getRequestDispatcher("DangKy.jsp");
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

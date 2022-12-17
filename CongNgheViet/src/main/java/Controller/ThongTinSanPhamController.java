package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoaiSanPhambean;
import bean.SanPhambean;
import bean.ThongSoKyThuatbean;
import bo.LoaiSanPhambo;
import bo.ThongTinSanPhambo;

/**
 * Servlet implementation class ThongTinSanPhamController
 */
@WebServlet("/ThongTinSanPhamController")
public class ThongTinSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThongTinSanPhamController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maSP = request.getParameter("maSP");

		LoaiSanPhambo lspbo = new LoaiSanPhambo();
		ThongTinSanPhambo ttspbo = new ThongTinSanPhambo();

		ArrayList<LoaiSanPhambean> dsloaiSP = lspbo.getloai();
		ThongSoKyThuatbean tsktsp = null;
		SanPhambean sp = null;

		if (maSP != null) {
			tsktsp = ttspbo.getThongSoKyThuat(maSP);
			sp = ttspbo.getThongTinSanPham(maSP);
		}

		request.setAttribute("dsloaiSP", (ArrayList<LoaiSanPhambean>) dsloaiSP);
		request.setAttribute("tsktsp", (ThongSoKyThuatbean) tsktsp);
		request.setAttribute("sp", (SanPhambean) sp);
		RequestDispatcher rd = request.getRequestDispatcher("ThongTinSanPham.jsp");
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

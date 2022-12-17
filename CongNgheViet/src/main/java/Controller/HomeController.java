package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.HoatDongCuaHangbean;
import bean.LoaiSanPhambean;
import bean.SanPhambean;
import bo.HoatDongCuaHangbo;
import bo.LoaiSanPhambo;
import bo.SanPhambo;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LoaiSanPhambo lspbo = new LoaiSanPhambo();
		HoatDongCuaHangbo hdbo = new HoatDongCuaHangbo();
		SanPhambo spbo = new SanPhambo();

		ArrayList<LoaiSanPhambean> dsloaiSP = lspbo.getloai();
		ArrayList<SanPhambean> dsSanPham = spbo.getSanPham();
		ArrayList<HoatDongCuaHangbean> dsHoatDong = hdbo.getHoatDong();

		request.setAttribute("dsHoatDong", (ArrayList<HoatDongCuaHangbean>) dsHoatDong);
		request.setAttribute("dsloaiSP", (ArrayList<LoaiSanPhambean>) dsloaiSP);
		request.setAttribute("dsSanPham", (ArrayList<SanPhambean>) dsSanPham);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
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

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
import bo.LoaiSanPhambo;
import bo.SanPhambo;

/**
 * Servlet implementation class HienThiSanPham
 */
@WebServlet("/HienThiSanPham")
public class HienThiSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HienThiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maLoai = request.getParameter("ml");
		String keySearch = request.getParameter("search");

		LoaiSanPhambo lspbo = new LoaiSanPhambo();
		SanPhambo spbo = new SanPhambo();

		ArrayList<LoaiSanPhambean> dsloaiSP = lspbo.getloai();
		ArrayList<SanPhambean> dsSanPham = new ArrayList<SanPhambean>();
		if (maLoai != null) {
			if (maLoai.equals("DT")) {
				dsSanPham = spbo.getDienThoai();
			}
			if (maLoai.equals("LT")) {
				dsSanPham = spbo.getLapTop();
			}
		}

		if (keySearch != null) {
			dsSanPham = spbo.timKiem(keySearch);
		}

		request.setAttribute("dsloaiSP", (ArrayList<LoaiSanPhambean>) dsloaiSP);
		request.setAttribute("dsSanPham", (ArrayList<SanPhambean>) dsSanPham);
		RequestDispatcher rd = request.getRequestDispatcher("HienThiSanPham.jsp");
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

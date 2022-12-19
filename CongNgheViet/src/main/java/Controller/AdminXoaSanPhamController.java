package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.SanPhambo;

/**
 * Servlet implementation class AdminXoaSanPhamController
 */
@WebServlet("/AdminXoaSanPhamController")
public class AdminXoaSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminXoaSanPhamController() {
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
		String tbeditSanPham = null;
		SanPhambo spbo = new SanPhambo();
		if (maSP != null) {
			if (spbo.xoaSP(maSP.trim())) {
				tbeditSanPham = "Sản phảm đã được xóa thành công!";
			} else {
				tbeditSanPham = "Lỗi!";
			}
		}
		request.setAttribute("tbeditSP", tbeditSanPham);
		RequestDispatcher rd = request.getRequestDispatcher("QuanLySanPhamController");
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

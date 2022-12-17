package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.LoaiSanPhambo;

/**
 * Servlet implementation class AdminThemLoaiSanPhamController
 */
@WebServlet("/AdminThemLoaiSanPhamController")
public class AdminThemLoaiSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminThemLoaiSanPhamController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		LoaiSanPhambo lspbo = new LoaiSanPhambo();

		String maLoaiSP = request.getParameter("maLoaiSP");
		String tenLoaiSP = request.getParameter("tenLoaiSP");

		String tbEditLoaiSP = null;
		if (maLoaiSP != null && tenLoaiSP != null) {
			if (lspbo.themLoaiSP(maLoaiSP, tenLoaiSP)) {
				tbEditLoaiSP = "Đã thêm thành công loại sản phẩm!";
			}
		} else {
			tbEditLoaiSP = "Nhập đầy đủ thông tin cần thêm!";
		}

		request.setAttribute("tbEditLoaiSP", (String) tbEditLoaiSP);
		RequestDispatcher rd = request.getRequestDispatcher("QuanLyLoaiSanPhamController");
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

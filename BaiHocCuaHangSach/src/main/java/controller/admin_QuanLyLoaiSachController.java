package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bo.admin_QuanLyLoaiSachbo;

/**
 * Servlet implementation class admin_QuanLyLoaiSachController
 */
@WebServlet("/admin_QuanLyLoaiSachController")
public class admin_QuanLyLoaiSachController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin_QuanLyLoaiSachController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		admin_QuanLyLoaiSachbo adminlbo = new admin_QuanLyLoaiSachbo();
		ArrayList<loaibean> dsloai = adminlbo.getloai();

		request.setAttribute("dsloai", dsloai);
		RequestDispatcher rd = request.getRequestDispatcher("admin_QuanLyLoaiSach.jsp");
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

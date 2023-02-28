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
import bo.HoatDongCuaHangbo;

/**
 * Servlet implementation class AdminQLHoatDong
 */
@WebServlet("/AdminQLHoatDong")
public class AdminQLHoatDong extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminQLHoatDong() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HoatDongCuaHangbo hdbo = new HoatDongCuaHangbo();
		ArrayList<HoatDongCuaHangbean> dsHoatDong = hdbo.getHoatDong();
		request.setAttribute("dsHoatDong", (ArrayList<HoatDongCuaHangbean>) dsHoatDong);
		RequestDispatcher rd = request.getRequestDispatcher("AdminQuanLyHoatDong.jsp");
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

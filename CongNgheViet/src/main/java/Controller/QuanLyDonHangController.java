package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AdminDonHangbean;
import bo.AdminDonHangbo;

/**
 * Servlet implementation class QuanLyDonHangController
 */
@WebServlet("/QuanLyDonHangController")
public class QuanLyDonHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuanLyDonHangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AdminDonHangbo adhbo = new AdminDonHangbo();
		ArrayList<AdminDonHangbean> dsDonHang = adhbo.getDonHang();
		String tbXacNhan = null;
		tbXacNhan = (String) request.getAttribute("tbXacNhan");

		request.setAttribute("tbXacNhan", (String) tbXacNhan);
		request.setAttribute("dsDonHang", (ArrayList<AdminDonHangbean>) dsDonHang);
		RequestDispatcher rd = request.getRequestDispatcher("AdminDonHang.jsp");
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

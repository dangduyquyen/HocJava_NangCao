package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.khachhangbean;
import bo.chitietbo;
import bo.hoadonbo;

/**
 * Servlet implementation class thanhtoanController
 */
@WebServlet("/thanhtoanController")
public class thanhtoanController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public thanhtoanController() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    HttpSession session = request.getSession();
    khachhangbean kh = (khachhangbean) session.getAttribute("kh");
    if (kh == null)
      response.sendRedirect("ktdn");
    else {
      hoadonbo hdbo = new hoadonbo();
      chitietbo ctbo = new chitietbo();
      long makh = kh.getMakh();
      long maxhd = hdbo.getmaxhd();
      hdbo.Thanhtoan(maxhd);
      response.sendRedirect("thanhtoan.jsp?kt=1");
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}

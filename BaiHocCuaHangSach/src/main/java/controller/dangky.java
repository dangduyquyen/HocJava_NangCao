package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.khachhangbean;
import bo.khachhangbo;

/**
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public dangky() {
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
    String un = request.getParameter("txtun");
    String pass = request.getParameter("txtpass");
    String ht = request.getParameter("txtht");
    String dc = request.getParameter("txtdc");
    String sdt = request.getParameter("txtsdt");
    String email = request.getParameter("txtemail");

    if (un != null && pass != null && ht != null && dc != null) {
      khachhangbo khbo = new khachhangbo();
      ArrayList<khachhangbean> dskh = khbo.getkh();
      if (khbo.Kiemtra(un, pass) == 0) {
        khbo.ThemKH(ht, dc, sdt, email, un, pass);
        response.sendRedirect("dangnhap.jsp");
      } else {
        RequestDispatcher rd = request.getRequestDispatcher("dangky.jsp?kt=1");
        rd.forward(request, response);
      }
    } else {
      RequestDispatcher rd = request.getRequestDispatcher("dangky.jsp");
      rd.forward(request, response);
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

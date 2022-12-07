package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bo.giohangbo;

/**
 * Servlet implementation class themsach
 */
@WebServlet("/themsach")
public class themsach extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public themsach() {
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
    String maSach = request.getParameter("ms");
    String tenSach = request.getParameter("ts");
    long gia = Long.parseLong(request.getParameter("gia"));
    String anh = request.getParameter("anh");
    giohangbo gh;

    if (session.getAttribute("gio") == null) {
      gh = new giohangbo();
      session.setAttribute("gio", gh);
    }

    gh = (giohangbo) session.getAttribute("gio");
    gh.Them(maSach, tenSach, anh, gia, 1);
    session.setAttribute("gio", gh);

    response.sendRedirect("htgioController");
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

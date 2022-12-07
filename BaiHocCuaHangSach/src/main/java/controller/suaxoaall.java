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
 * Servlet implementation class xoaall
 */
@WebServlet("/suaxoaall")
public class suaxoaall extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public suaxoaall() {
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
    String masach = request.getParameter("ms");
    giohangbo gh = (giohangbo) session.getAttribute("gio");

    if (request.getParameter("btnsua") != null) {
      long soluong = Long.parseLong(request.getParameter("txtsl"));
      gh.Them(masach, "", "", 0, soluong);
    } else
      gh.Xoa(masach);

    session.setAttribute("gio", gh);

    if (request.getParameter("btnxoaall") != null) {
      session.removeAttribute("gio");
    }

    if (gh.ds.size() != 0)
      response.sendRedirect("htgioController");
    else
      response.sendRedirect("htsachController");
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

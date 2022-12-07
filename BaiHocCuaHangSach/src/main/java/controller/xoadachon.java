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
 * Servlet implementation class xoadachon
 */
@WebServlet("/xoadachon")
public class xoadachon extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public xoadachon() {
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
    giohangbo gh = (giohangbo) session.getAttribute("gio");

    if (session.getAttribute("gio") == null) {
      gh = new giohangbo();
      session.setAttribute("gio", gh);
    }



    String[] masachdachon = request.getParameterValues("dachon");

    if (request.getParameter("btnxoadachon") != null) {
      for (int i = 0; i < masachdachon.length; i++) {
        gh.Xoa(masachdachon[i]);
      }
    }

    session.setAttribute("gio", gh);

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

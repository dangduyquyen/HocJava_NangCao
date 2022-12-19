package Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bo.SanPhambo;
import bo.ThongTinSanPhambo;

/**
 * Servlet implementation class AdminThemSanPhamController
 */
@WebServlet("/AdminThemSanPhamController")
public class AdminThemSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminThemSanPhamController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		DiskFileItemFactory factory = new DiskFileItemFactory();
		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		String dirUrl1 = "D:\\Workspace_JAVA_nang_cao\\CongNgheViet\\src\\main\\webapp\\img";
		response.getWriter().println(dirUrl1);
		String maSP = null;
		String maLoaiSP = null;
		String tenSP = null;
		long soLuong = 0;
		long gia = 0;
		String AnhSP = null;
		String tenAnhSP = null;
		String nhaSX = null;
		String namSX = null;
		String thoiGianBaoHanh = null;
		String thongTinSP = null;
		String thongSo1 = null;
		String thongSo2 = null;
		String thongSo3 = null;
		String thongSo4 = null;
		String thongSo5 = null;
		String thongSo6 = null;
		String thongSo7 = null;
		String thongSo8 = null;
		String thongSo9 = null;
		String thongSo10 = null;
		String tbeditSP = null;
		SanPhambo spbo = new SanPhambo();
		ThongTinSanPhambo ttbo = new ThongTinSanPhambo();
		try {
			List<FileItem> fileItems = upload.parseRequest(request);
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {
					String nameimg = fileItem.getName();
					if (!nameimg.equals("")) {
						String dirUrl = "D:\\Workspace_JAVA_nang_cao\\CongNgheViet\\src\\main\\webapp\\img";
						File dir = new File(dirUrl);
						if (!dir.exists()) {
							dir.mkdir();
						}
						String fileImg = dirUrl + File.separator + nameimg;
						File file = new File(fileImg);
						try {
							fileItem.write(file);
							System.out.println("UPLOAD THÀNH CÔNG...!");
							System.out.println("ĐƯỜNG DẪN KIỂM TRA UPLOAD HÌNH ẢNH : \n" + dirUrl);
						} catch (Exception e) {
							System.out.println("CÓ LỖ TRONG QUÁ TRÌNH UPLOAD!");
							e.printStackTrace();
						}
					}
				} else {
					request.setCharacterEncoding("utf-8");
					response.setCharacterEncoding("utf-8");
					String tentk = fileItem.getFieldName();
					if (tentk.equals("maSP"))
						maSP = fileItem.getString();
					if (tentk.equals("maLoaiSP"))
						maLoaiSP = fileItem.getString();
					if (tentk.equals("tenSP"))
						tenSP = fileItem.getString();
					if (tentk.equals("soLuong"))
						soLuong = Long.parseLong(fileItem.getString());
					if (tentk.equals("gia"))
						gia = Long.parseLong(fileItem.getString());
					if (tentk.equals("tenAnhSP"))
						AnhSP = fileItem.getString();
					if (tentk.equals("nhaSX"))
						nhaSX = fileItem.getString();
					if (tentk.equals("namSX"))
						namSX = fileItem.getString();
					if (tentk.equals("thoiGianBaoHanh"))
						thoiGianBaoHanh = fileItem.getString();
					if (tentk.equals("thongTinSP"))
						thongTinSP = fileItem.getString();
					if (tentk.equals("thongSo1"))
						thongSo1 = fileItem.getString();
					if (tentk.equals("thongSo2"))
						thongSo2 = fileItem.getString();
					if (tentk.equals("thongSo3"))
						thongSo3 = fileItem.getString();
					if (tentk.equals("thongSo4"))
						thongSo4 = fileItem.getString();
					if (tentk.equals("thongSo5"))
						thongSo5 = fileItem.getString();
					if (tentk.equals("thongSo6"))
						thongSo6 = fileItem.getString();
					if (tentk.equals("thongSo7"))
						thongSo7 = fileItem.getString();
					if (tentk.equals("thongSo8"))
						thongSo8 = fileItem.getString();
					if (tentk.equals("thongSo9"))
						thongSo9 = fileItem.getString();
					if (tentk.equals("thongSo10"))
						thongSo10 = fileItem.getString();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		tenAnhSP = "img/" + AnhSP + ".jpg";
		if (spbo.themSP(maSP, maLoaiSP, tenSP, soLuong, gia, tenAnhSP, nhaSX, namSX, thoiGianBaoHanh, thongTinSP)
				&& ttbo.themTSKT(maSP, thongSo1, thongSo2, thongSo3, thongSo4, thongSo5, thongSo6, thongSo7, thongSo8,
						thongSo9, thongSo10)) {
			tbeditSP = "Thêm sản phẩm thành công!";
		} else {
			tbeditSP = "Lỗi";
		}
		request.setAttribute("tbeditSP", tbeditSP);
		RequestDispatcher rd = request.getRequestDispatcher("QuanLySanPhamController");
		rd.forward(request, response);
	}

}

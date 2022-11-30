package bo;

import dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao khdao = new KhachHangdao();

	public void themTKKH(String hoTen, String email, String diaChi, String sDT, String tenDN, String matKhauDN) {
		khdao.ThemTKKH(hoTen, email, diaChi, sDT, tenDN, matKhauDN);
	}

	public boolean KiemTraTenDN(String tenDN) {
		return khdao.KiemTraTenDN(tenDN);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		KhachHangbo khbo = new KhachHangbo();
//		khbo.themTKKH("Nguyễn Văn B", "nguyenvanb@gmail.com", "Huế", "0989876763", "nvb", "nvb123");
//		if (khbo.KiemTraTenDN("nva")) {
//			System.out.println("true");
//		} else
//			System.out.println("false");
//	}

}

package bo;

import bean.SanPhambean;
import bean.ThongSoKyThuatbean;
import dao.SanPhamdao;
import dao.ThongSoKyThuatdao;

public class ThongTinSanPhambo {
	ThongSoKyThuatdao tsdao = new ThongSoKyThuatdao();

	public ThongSoKyThuatbean getThongSoKyThuat(String maSP) {
		ThongSoKyThuatbean ts;
		ts = tsdao.getThongSoKyThuat(maSP);
		return ts;
	}

	public SanPhambean getThongTinSanPham(String maSP) {
		SanPhamdao spdao = new SanPhamdao();
		SanPhambean sp;
		sp = spdao.getSanPhamTheoMaSP(maSP);
		return sp;
	}

	public boolean themTSKT(String maSP, String thongSo1, String thongSo2, String thongSo3, String thongSo4,
			String thongSo5, String thongSo6, String thongSo7, String thongSo8, String thongSo9, String thongSo10) {
		if (tsdao.ThemTSKT(maSP, thongSo1, thongSo2, thongSo3, thongSo4, thongSo5, thongSo6, thongSo7, thongSo8,
				thongSo9, thongSo10)) {
			return true;
		} else {
			return false;
		}
	}
}

package bo;

import bean.SanPhambean;
import bean.ThongSoKyThuatbean;
import dao.SanPhamdao;
import dao.ThongSoKyThuatdao;

public class ThongTinSanPhambo {
	public ThongSoKyThuatbean getThongSoKyThuat(String maSP) {
		ThongSoKyThuatdao tsdao = new ThongSoKyThuatdao();
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
}

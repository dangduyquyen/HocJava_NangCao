package bo;

import java.util.ArrayList;

import bean.SanPhambean;
import dao.SanPhamdao;

public class SanPhambo {
	ArrayList<SanPhambean> ds;

	SanPhamdao spdao = new SanPhamdao();

	public ArrayList<SanPhambean> getSanPham() {
		ds = spdao.getSanPham();
		return ds;
	}

	public ArrayList<SanPhambean> getDienThoai() {
		ds = spdao.getDienThoai();
		return ds;
	}

	public ArrayList<SanPhambean> getLapTop() {
		ds = spdao.getLapTop();
		return ds;
	}

	public ArrayList<SanPhambean> timKiem(String key) {
		ArrayList<SanPhambean> tam = new ArrayList<SanPhambean>();
		ds = spdao.getSanPham();
		for (SanPhambean s : ds) {
			if (s.getTenSP().toLowerCase().contains(key.toLowerCase())
					|| s.getNhaSX().toLowerCase().contains(key.toLowerCase())
					|| s.getMaLoaiSP().toLowerCase().contains(key.toLowerCase())) {
				tam.add(s);
			}
		}
		return tam;
	}

	public boolean themSP(String MaSP, String MaLoaiSP, String TenSP, long SoLuong, long Gia, String AnhSP,
			String NhaSX, String NamSX, String ThoiGianBaoHanh, String ThongTinSP) {
		if (spdao.themSP(MaSP, MaLoaiSP, TenSP, SoLuong, Gia, AnhSP, NhaSX, NamSX, ThoiGianBaoHanh, ThongTinSP)) {
			return true;
		} else {
			return false;
		}
	}

	// xoa sp;
	public boolean xoaSP(String maSP) {
		if (spdao.xoaSP(maSP)) {
			return true;
		} else {
			return false;
		}
	}

}
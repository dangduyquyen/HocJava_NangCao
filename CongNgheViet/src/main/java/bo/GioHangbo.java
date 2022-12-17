package bo;

import java.util.ArrayList;

import bean.GioHangbean;

public class GioHangbo {
	public ArrayList<GioHangbean> ds = new ArrayList<GioHangbean>();

	public void themSanPham(String maSP, String tenSP, long gia, long soLuong, String anh) {
		for (GioHangbean sp : ds) {
			if (sp.getMaSP().equals(maSP)) {
				sp.setSoLuong(sp.getSoLuong() + soLuong);
				return;
			}
		}
		ds.add(new GioHangbean(maSP, tenSP, gia, soLuong, anh));
	}

	public long tongTien() {
		long s = 0;
		for (GioHangbean sp : ds) {
			s = s + sp.getThanhTien();
		}
		return s;
	}

	public void xoaSP(String maSP) {
		for (GioHangbean sp : ds) {
			if (sp.getMaSP().equals(maSP)) {
				ds.remove(sp);
			}
		}
	}

	public void CapNhatSL(String maSP, long soLuong) {

	}
}

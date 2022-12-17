package bo;

import dao.ChiTietDonHangdao;

public class ChiTietDonHangbo {
	ChiTietDonHangdao ctdao = new ChiTietDonHangdao();

	public int Them(long maHD, String maSP, long soLuongSP) {
		return ctdao.Them(maHD, maSP, soLuongSP);
	}

	public boolean xacNhanCTDH(long maHD) {
		if (ctdao.xacNhanCTDH(maHD)) {
			return true;
		} else {
			return false;
		}
	}
}

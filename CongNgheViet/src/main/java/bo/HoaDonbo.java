package bo;

import dao.HoaDondao;

public class HoaDonbo {
	HoaDondao hddao = new HoaDondao();

	public long getMaxHD() {
		return hddao.getMaxHD();
	}

	public int them(long maKH) {
		return hddao.Them(maKH);
	}

	public boolean xacNhanDH(long maHD) {
		if (hddao.xacNhanDH(maHD)) {
			return true;
		} else {
			return false;
		}
	}
}

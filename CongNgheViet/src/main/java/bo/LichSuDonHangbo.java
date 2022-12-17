package bo;

import java.util.ArrayList;

import bean.LichSuDonHangbean;
import dao.LichSuDonHangdao;

public class LichSuDonHangbo {
	LichSuDonHangdao lsdao = new LichSuDonHangdao();
	ArrayList<LichSuDonHangbean> ds = new ArrayList<LichSuDonHangbean>();

	public ArrayList<LichSuDonHangbean> getDonHang(long MaKH) {
		ds = lsdao.getDonHang(MaKH);
		return ds;
	}

}

package bo;

import java.util.ArrayList;

import bean.AdminDonHangbean;
import dao.AdminDonHangDao;

public class AdminDonHangbo {
	AdminDonHangDao adhdao = new AdminDonHangDao();
	ArrayList<AdminDonHangbean> dsDonHang = new ArrayList<AdminDonHangbean>();

	public ArrayList<AdminDonHangbean> getDonHang() {
		return adhdao.getDonHang();
	}
}

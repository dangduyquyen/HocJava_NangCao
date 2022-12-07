package bo;

import java.util.ArrayList;

import bean.loaibean;
import dao.admin_QuanLyLoaiSachdao;

public class admin_QuanLyLoaiSachbo {
	admin_QuanLyLoaiSachdao adminldao = new admin_QuanLyLoaiSachdao();
	ArrayList<loaibean> ds;

	public ArrayList<loaibean> getloai() {
		ds = adminldao.getloai();
		return ds;
	}
}

package bo;

import bean.Adminbean;
import dao.Admindao;

public class Adminbo {
	Admindao admindao = new Admindao();
	Adminbean admin = new Adminbean();

	public Adminbean dangNhapAdmin(String adminname, String adminpassword) {
		admin = admindao.dangNhapAdmin(adminname, adminpassword);
		return admin;
	}
}

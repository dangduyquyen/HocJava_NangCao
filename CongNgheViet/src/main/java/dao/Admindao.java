package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Adminbean;

public class Admindao {
	public Adminbean dangNhapAdmin(String user, String pass) {
		Adminbean admin = new Adminbean();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String Sql = "select * from Admin where TenDN = ? and MKDN = ?";

		try {
			PreparedStatement cmd = kn.cn.prepareStatement(Sql);
			cmd.setString(1, user);
			cmd.setString(2, pass);

			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String tenAdmin = rs.getString("TenAdmin");
				String tenDN = rs.getString("TenDN");
				String matKhauDN = rs.getString("MKDN");
				boolean quyen = rs.getBoolean("Quyen");
				admin = new Adminbean(tenAdmin, tenDN, matKhauDN, quyen);
			}
			kn.cn.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return admin;
	}
}

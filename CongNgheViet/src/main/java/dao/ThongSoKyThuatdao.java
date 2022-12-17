package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.ThongSoKyThuatbean;

public class ThongSoKyThuatdao {
	public ThongSoKyThuatbean getThongSoKyThuat(String MaSP) {
		ThongSoKyThuatbean ts = new ThongSoKyThuatbean();
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = "select * from ThongSoKyThuat where MaSP = ?";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, MaSP);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {

				String maSP = rs.getString("maSP");
				String thongSo1 = rs.getString("thongSo1");
				String thongSo2 = rs.getString("thongSo2");
				String thongSo3 = rs.getString("thongSo3");
				String thongSo4 = rs.getString("thongSo4");
				String thongSo5 = rs.getString("thongSo5");
				String thongSo6 = rs.getString("thongSo6");
				String thongSo7 = rs.getString("thongSo7");
				String thongSo8 = rs.getString("thongSo8");
				String thongSo9 = rs.getString("thongSo9");
				String thongSo10 = rs.getString("thongSo10");

				ts = new ThongSoKyThuatbean(maSP, thongSo1, thongSo2, thongSo3, thongSo4, thongSo5, thongSo6, thongSo7,
						thongSo8, thongSo9, thongSo10);
			}
			rs.close();
			kn.cn.close();
			return ts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}

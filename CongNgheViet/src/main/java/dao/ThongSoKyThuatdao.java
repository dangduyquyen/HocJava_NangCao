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

	public boolean ThemTSKT(String maSP, String thongSo1, String thongSo2, String thongSo3, String thongSo4,
			String thongSo5, String thongSo6, String thongSo7, String thongSo8, String thongSo9, String thongSo10) {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = "insert into ThongSoKyThuat (MaSP,ThongSo1,ThongSo2,ThongSo3,ThongSo4,ThongSo5,ThongSo6,ThongSo7,ThongSo8,ThongSo9,ThongSo10) values (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, maSP);
			cmd.setString(2, thongSo1);
			cmd.setString(3, thongSo2);
			cmd.setString(4, thongSo3);
			cmd.setString(5, thongSo4);
			cmd.setString(6, thongSo5);
			cmd.setString(7, thongSo6);
			cmd.setString(8, thongSo7);
			cmd.setString(9, thongSo8);
			cmd.setString(10, thongSo9);
			cmd.setString(11, thongSo10);

			cmd.executeUpdate();

			kn.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

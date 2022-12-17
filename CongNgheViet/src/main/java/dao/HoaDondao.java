package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoaDondao {
	public long getMaxHD() {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = " select max(MaHD) as maxHD from HoaDon";

			PreparedStatement cmd = kn.cn.prepareStatement(sql);

			ResultSet rs = cmd.executeQuery();
			long max = 0;

			if (rs.next()) {
				max = rs.getLong("maxHD");
			}
			rs.close();
			kn.cn.close();
			return max;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public int Them(long maKH) {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = " insert into HoaDon(MaKhachHang, NgayMua, DaMua) values (?,?,?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setLong(1, maKH);
			Date n = new Date();
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			String ngay = dd.format(n);
			Date ngayMua = dd.parse(ngay);
			cmd.setDate(2, new java.sql.Date(ngayMua.getTime()));
			cmd.setBoolean(3, false);
			int kq = cmd.executeUpdate();

			kn.cn.close();

			return kq;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}

	public boolean xacNhanDH(long maHD) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "update HoaDon set DaMua = '1' where MaHD = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setLong(1, maHD);
			cmd.executeUpdate();

			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
}

package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.AdminDonHangbean;

public class AdminDonHangDao {
	public ArrayList<AdminDonHangbean> getDonHang() {
		ArrayList<AdminDonHangbean> dsDonHang = new ArrayList<AdminDonHangbean>();

		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from View_AdminDonHang ORDER BY NgayMua DESC";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				long maHD = rs.getLong("MaHD");
				String tenSP = rs.getString("TenSP");
				String AnhSP = rs.getString("AnhSP");
				long soLuongMua = rs.getLong("SoLuongSP");
				long gia = rs.getLong("Gia");
				long thanhTien = rs.getLong("ThanhTien");
				Date ngayMua = rs.getDate("NgayMua");
				int daMua = rs.getInt("DaMua");
				dsDonHang.add(new AdminDonHangbean(maHD, tenSP, AnhSP, soLuongMua, gia, thanhTien, ngayMua, daMua));
			}
			kn.cn.close();
			cmd.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return dsDonHang;
	}
}

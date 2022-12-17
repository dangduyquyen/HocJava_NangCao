package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.LichSuDonHangbean;

public class LichSuDonHangdao {
	public ArrayList<LichSuDonHangbean> getDonHang(long MaKH) {
		ArrayList<LichSuDonHangbean> ds = new ArrayList<LichSuDonHangbean>();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "Select * from View_LichSuDonHang where MaKhachHang = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setLong(1, MaKH);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				long maKH = rs.getLong("MaKhachHang");
				String tenSP = rs.getString("TenSP");
				String AnhSP = rs.getString("AnhSP");
				long soLuongMua = rs.getLong("SoLuongSP");
				long gia = rs.getLong("Gia");
				long thanhTien = rs.getLong("ThanhTien");
				Date ngayMua = rs.getDate("NgayMua");
				int daMua = rs.getInt("DaMua");
				ds.add(new LichSuDonHangbean(maKH, tenSP, AnhSP, soLuongMua, gia, thanhTien, ngayMua, daMua));
			}
			kn.cn.close();
			cmd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return ds;
	}
}

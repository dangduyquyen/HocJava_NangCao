package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.KhachHangbean;

public class KhachHangdao {
	public void ThemTKKH(String hoTen, String email, String diaChi, String sDT, String tenDN, String matKhauDN) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "insert	into KhachHang(HoTen, Email, DiaChi, SDT, TenDN, MatKhauDN)"
				+ "values (?, ?, ?, ?, ?, ?)";

		PreparedStatement cmd;
		try {
			cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, hoTen);
			cmd.setString(2, email);
			cmd.setString(3, diaChi);
			cmd.setString(4, sDT);
			cmd.setString(5, tenDN);
			cmd.setString(6, matKhauDN);

			// them tk kh
			cmd.executeUpdate();

			// dong ket noi
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean KiemTraTenDN(String tenDN) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from KhachHang where TenDN =  ?";

		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, tenDN);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public KhachHangbean dangNhapUser(String user, String pass) {
		KhachHangbean kh = null;
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from KhachHang where TenDN = ? and MatKhauDN = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, user);
			cmd.setString(2, pass);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				long MaKhachHang = rs.getLong("MaKhachHang");
				String HoTen = rs.getString("HoTen");
				String Email = rs.getString("Email");
				String DiaChi = rs.getString("DiaChi");
				String SDT = rs.getString("SDT");
				String TenDN = rs.getString("TenDN");
				String MatKhauDN = rs.getString("MatKhauDN");
				kh = new KhachHangbean(MaKhachHang, HoTen, Email, DiaChi, SDT, TenDN, MatKhauDN);
			}
			rs.close();
			kn.cn.close();
			return kh;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}

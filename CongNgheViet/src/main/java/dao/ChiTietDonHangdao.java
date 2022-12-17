package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChiTietDonHangdao {
	public int Them(long maHD, String maSP, long soLuongSP) {

		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = " insert into ChiTietDonHang(MaHD, MaSP, SoLuongSP, DaMua) values (?,?,?,?)";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setLong(1, maHD);
			cmd.setString(2, maSP);
			cmd.setLong(3, soLuongSP);
			cmd.setBoolean(4, false);

			int kq = cmd.executeUpdate();
			kn.cn.close();
			return kq;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public boolean xacNhanCTDH(long maHD) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "update ChiTietDonHang set DaMua = '1' where MaHD = ?";
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

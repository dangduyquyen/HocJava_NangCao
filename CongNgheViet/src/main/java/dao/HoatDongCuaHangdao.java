package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bean.HoatDongCuaHangbean;

public class HoatDongCuaHangdao {
	// tao phuong thuc lay về hoạt động có thời gian được thêm vào mới nhất
	public ArrayList<HoatDongCuaHangbean> getHoatDong() {
		ArrayList<HoatDongCuaHangbean> ds = new ArrayList<HoatDongCuaHangbean>();

		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "select top(2) * from HoatDongCH ORDER BY ngayTaoHD DESC";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String maHoatDong = rs.getString("maHoatDong");
				String tenHoatDong = rs.getString("tenHoatDong");
				String anhHD = rs.getString("anhHD");
				Date ngayTaoHD = rs.getDate("ngayTaoHD");
				ds.add(new HoatDongCuaHangbean(maHoatDong, tenHoatDong, anhHD, ngayTaoHD));

			}
			rs.close();
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
	}
}

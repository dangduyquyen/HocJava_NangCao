package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.SanPhambean;

public class SanPhamdao {

	public ArrayList<SanPhambean> getSanPham() {
		ArrayList<SanPhambean> ds = new ArrayList<SanPhambean>();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from SanPham";

		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String MaSP = rs.getString("MaSP");
				String MaLoaiSP = rs.getString("MaLoaiSP");
				String TenSP = rs.getString("TenSP");
				long SoLuong = rs.getLong("SoLuong");
				long Gia = rs.getLong("Gia");
				String AnhSP = rs.getString("AnhSP");
				String NhaSX = rs.getString("NhaSX");
				long NamSX = rs.getLong("NamSX");
				String ThoiGianBaoHanh = rs.getString("ThoiGianBaoHanh");
				String ThongTinSP = rs.getString("ThongTinSP");
				ds.add(new SanPhambean(MaSP, MaLoaiSP, TenSP, SoLuong, Gia, AnhSP, NhaSX, NamSX, ThoiGianBaoHanh,
						ThongTinSP));
			}
			rs.close();
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return ds;
	}

	// lay san pham la dien thoai
	public ArrayList<SanPhambean> getDienThoai() {
		ArrayList<SanPhambean> ds = new ArrayList<SanPhambean>();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from SanPham where MaLoaiSP = 'DT'";

		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String MaSP = rs.getString("MaSP");
				String MaLoaiSP = rs.getString("MaLoaiSP");
				String TenSP = rs.getString("TenSP");
				long SoLuong = rs.getLong("SoLuong");
				long Gia = rs.getLong("Gia");
				String AnhSP = rs.getString("AnhSP");
				String NhaSX = rs.getString("NhaSX");
				long NamSX = rs.getLong("NamSX");
				String ThoiGianBaoHanh = rs.getString("ThoiGianBaoHanh");
				String ThongTinSP = rs.getString("ThongTinSP");
				ds.add(new SanPhambean(MaSP, MaLoaiSP, TenSP, SoLuong, Gia, AnhSP, NhaSX, NamSX, ThoiGianBaoHanh,
						ThongTinSP));
			}
			rs.close();
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
	}
	// lay san pham là lap top

	public ArrayList<SanPhambean> getLapTop() {
		ArrayList<SanPhambean> ds = new ArrayList<SanPhambean>();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from SanPham where MaLoaiSP = 'LT'";

		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String MaSP = rs.getString("MaSP");
				String MaLoaiSP = rs.getString("MaLoaiSP");
				String TenSP = rs.getString("TenSP");
				long SoLuong = rs.getLong("SoLuong");
				long Gia = rs.getLong("Gia");
				String AnhSP = rs.getString("AnhSP");
				String NhaSX = rs.getString("NhaSX");
				long NamSX = rs.getLong("NamSX");
				String ThoiGianBaoHanh = rs.getString("ThoiGianBaoHanh");
				String ThongTinSP = rs.getString("ThongTinSP");
				ds.add(new SanPhambean(MaSP, MaLoaiSP, TenSP, SoLuong, Gia, AnhSP, NhaSX, NamSX, ThoiGianBaoHanh,
						ThongTinSP));
			}
			rs.close();
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
	}

	// lay san pham bang ma san pham

	public SanPhambean getSanPhamTheoMaSP(String maSP) {
		SanPhambean sp = new SanPhambean();
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "select * from SanPham where MaSP = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, maSP);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String MaSP = rs.getString("MaSP");
				String MaLoaiSP = rs.getString("MaLoaiSP");
				String TenSP = rs.getString("TenSP");
				long SoLuong = rs.getLong("SoLuong");
				long Gia = rs.getLong("Gia");
				String AnhSP = rs.getString("AnhSP");
				String NhaSX = rs.getString("NhaSX");
				long NamSX = rs.getLong("NamSX");
				String ThoiGianBaoHanh = rs.getString("ThoiGianBaoHanh");
				String ThongTinSP = rs.getString("ThongTinSP");

				sp = new SanPhambean(MaSP, MaLoaiSP, TenSP, SoLuong, Gia, AnhSP, NhaSX, NamSX, ThoiGianBaoHanh,
						ThongTinSP);
			}
			rs.close();
			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sp;
	}

	// them sp
	public boolean themSP(String MaSP, String MaLoaiSP, String TenSP, long SoLuong, long Gia, String AnhSP,
			String NhaSX, String NamSX, String ThoiGianBaoHanh, String ThongTinSP) {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = "INSERT INTO SanPham(MaSP,MaLoaiSP,TenSP,SoLuong,Gia,AnhSP,NhaSX,NamSX,ThoiGianBaoHanh,ThongTinSP)VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, MaSP);
			cmd.setString(2, MaLoaiSP);
			cmd.setString(3, TenSP);
			cmd.setLong(4, SoLuong);
			cmd.setLong(5, Gia);
			cmd.setString(6, AnhSP);
			cmd.setString(7, NhaSX);
			cmd.setString(8, NamSX);
			cmd.setString(9, ThoiGianBaoHanh);
			cmd.setString(10, ThongTinSP);

			cmd.executeUpdate();

			kn.cn.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// soa sp
	public boolean xoaSP(String maSP) {

		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "delete from SanPham where MaSP = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, maSP);
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

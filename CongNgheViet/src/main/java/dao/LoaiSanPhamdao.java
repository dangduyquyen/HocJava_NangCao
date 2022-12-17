package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.LoaiSanPhambean;

public class LoaiSanPhamdao {
	public ArrayList<LoaiSanPhambean> getLoai() {
		// tao mang luu ds loai san pham
		ArrayList<LoaiSanPhambean> ds = new ArrayList<LoaiSanPhambean>();
		// ket noi csdl
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		// tao cau truy van lay du lieu ve
		String sql = "select * from LoaiSanPham";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			// dua du lieu vao mang
			while (rs.next()) {
				String MaLoaiSP = rs.getString("MaLoaiSP");
				String TenLoaiSP = rs.getString("TenLoaiSP");
				ds.add(new LoaiSanPhambean(MaLoaiSP, TenLoaiSP));
			}
			rs.close();
			kn.cn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ds;
	}

	public boolean themLoaiSP(String maLoaiSP, String tenLoaiSP) {

		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "insert into LoaiSanPham (MaLoaiSP,TenLoaiSP) values (?,?)";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, maLoaiSP);
			cmd.setString(2, tenLoaiSP);
			cmd.executeUpdate();

			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean xoaLoaiSP(String maLoaiSP) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "delete from LoaiSanPham where MaLoaiSP = ?";
		try {
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, maLoaiSP);

			cmd.executeUpdate();

			kn.cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LoaiSanPhamdao lspdao = new LoaiSanPhamdao();
//		ArrayList<LoaiSanPhambean> dsloaiSP = lspdao.getLoai();
//		for (LoaiSanPhambean l : dsloaiSP) {
//			System.out.println(l.getTenLoaiSP());
//		}
//	}

}

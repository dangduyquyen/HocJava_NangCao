package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import bean.xacnhanbean;

public class xacnhandao {

  public ArrayList<xacnhanbean> getxacnhan() {
    try {
      // Tao 1 mang luu all loai
      ArrayList<xacnhanbean> ds = new ArrayList<xacnhanbean>();
      // b1: ket noi vao csdl
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      // b2: lay du lieu ve
      String sql = "select * from VXN";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      ResultSet rs = cmd.executeQuery();
      // b3: dua du lieu vao mang ds
      while (rs.next()) {
        String macthd = rs.getString("MaChiTietHD");
        String mahd = rs.getString("MaHoaDon");
        String hoten = rs.getString("hoten");
        long soluongmua = rs.getLong("SoLuongMua");
        long gia = rs.getLong("gia");
        long thanhtien = rs.getLong("ThanhTien");
        boolean damua = rs.getBoolean("damua");
        Date ngaymua = rs.getDate("NgayMua");

        ds.add(new xacnhanbean(macthd, mahd, hoten, soluongmua, thanhtien, gia, damua, ngaymua));

      }
      // b4: dong ket noi
      rs.close();
      kn.cn.close();
      return ds;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }

  public int Xacnhan(long mact) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "update VXN set damua = 1 where MaChiTietHD = ?";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setLong(1, mact);
      int kq = cmd.executeUpdate();
      kn.cn.close();
      return kq;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }
}

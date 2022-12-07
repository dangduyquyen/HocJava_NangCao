package dao;

import java.sql.PreparedStatement;

public class chitietdao {

  public int Them(String masach, long soluongmua, long mahd) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "insert into ChiTietHoaDon(MaSach, SoLuongMua, MaHoaDon, damua) values(?,?,?,?)";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setString(1, masach);
      cmd.setLong(2, soluongmua);
      cmd.setLong(3, mahd);
      cmd.setBoolean(4, false);
      int kq = cmd.executeUpdate();
      kn.cn.close();
      return kq;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    chitietdao cthd = new chitietdao();
    cthd.Them("b12", 3, 8);
  }

}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hoadondao {

  public long getmaxhd() {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "select max(MaHoaDon) as maxhd from hoadon";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      ResultSet rs = cmd.executeQuery();
      long max = 0;
      if (rs.next())
        max = rs.getLong("maxhd");
      rs.close();
      kn.cn.close();
      return max;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public int Them(long makh) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "insert into hoadon(makh, NgayMua, damua) values(?,?,?)";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setLong(1, makh);
      Date n = new Date();
      SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
      String ngay = dd.format(n);
      Date ngaymua = dd.parse(ngay);
      cmd.setDate(2, new java.sql.Date(ngaymua.getTime()));
      cmd.setBoolean(3, false);
      int kq = cmd.executeUpdate();
      kn.cn.close();
      return kq;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public int Thanhtoan(long makh) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "update hoadon set damua = 1 where MaHoaDon = ?";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setLong(1, makh);
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
    hoadondao hd = new hoadondao();
    System.out.println(hd.getmaxhd());
    hd.Thanhtoan(hd.getmaxhd());
  }

}

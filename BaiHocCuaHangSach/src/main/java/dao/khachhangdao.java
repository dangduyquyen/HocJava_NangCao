package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bean.khachhangbean;

public class khachhangdao {

  public ArrayList<khachhangbean> getkh() {
    try {
      // Tao 1 mang luu all loai
      ArrayList<khachhangbean> ds = new ArrayList<khachhangbean>();
      // b1: ket noi vao csdl
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      // b2: lay du lieu ve
      String sql = "select * from KhachHang";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      ResultSet rs = cmd.executeQuery();
      // b3: dua du lieu vao mang ds
      while (rs.next()) {
        long makh = rs.getLong("makh");
        String hoten = rs.getString("hoten");
        String diachi = rs.getString("diachi");
        String sodt = rs.getString("sodt");
        String email = rs.getString("email");
        String tendn = rs.getString("tendn");
        String pass = rs.getString("pass");
        ds.add(new khachhangbean(makh, hoten, diachi, sodt, email, tendn, pass));
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

  public khachhangbean ktdn(String tendn, String pass) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql = "select * from KhachHang where tendn=? and pass=?";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setString(1, tendn);
      cmd.setString(2, pass);
      ResultSet rs = cmd.executeQuery();
      khachhangbean kh = null;
      if (rs.next()) { // dang nhap thanh cong
        long makh = rs.getLong("makh");
        String hoten = rs.getString("hoten");
        String diachi = rs.getString("diachi");
        String sodt = rs.getString("sodt");
        String email = rs.getString("email");
        kh = new khachhangbean(makh, hoten, diachi, sodt, email, tendn, pass);
      }
      rs.close();
      kn.cn.close();
      return kh;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public int ThemKH(String hoten, String diachi, String sodt, String email, String tendn,
      String pass) {
    try {
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      String sql =
          "insert into KhachHang(hoten, diachi, sodt, email, tendn, pass) values (?, ?, ?, ?, ?, ?)";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setString(1, hoten);
      cmd.setString(2, diachi);
      cmd.setString(3, sodt);
      cmd.setString(4, email);
      cmd.setString(5, tendn);
      cmd.setString(6, pass);
      ResultSet rs = cmd.executeQuery();

      int kq = cmd.executeUpdate();
      kn.cn.close();
      return kq;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static void main(String[] args) {
    khachhangdao kh = new khachhangdao();
    System.out.println(kh.ktdn("nkchung", "123").getHoten());
  }
}

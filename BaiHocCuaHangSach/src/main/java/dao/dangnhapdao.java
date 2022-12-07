package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bean.dangnhapbean;

public class dangnhapdao {

  public ArrayList<dangnhapbean> getdangnhap() {
    try {
      // Tao 1 mang luu all loai
      ArrayList<dangnhapbean> ds = new ArrayList<dangnhapbean>();
      // b1: ket noi vao csdl
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      // b2: lay du lieu ve
      String sql = "select * from DangNhap";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      ResultSet rs = cmd.executeQuery();
      // b3: dua du lieu vao mang ds
      while (rs.next()) {
        String tendn = rs.getString("TenDangNhap");
        String pass = rs.getString("MatKhau");
        ds.add(new dangnhapbean(tendn, pass));
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

}

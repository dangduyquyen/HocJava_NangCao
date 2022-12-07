package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import bean.lichsubean;

public class lichsudao {

  public ArrayList<lichsubean> getlichsu(long makh) {
    try {
      // Tao 1 mang luu all loai
      ArrayList<lichsubean> ds = new ArrayList<lichsubean>();
      // b1: ket noi vao csdl
      KetNoi kn = new KetNoi();
      kn.KetNoi();
      // b2: lay du lieu ve
      String sql = "select * from VLS where makh=?";
      PreparedStatement cmd = kn.cn.prepareStatement(sql);
      cmd.setLong(1, makh);
      ResultSet rs = cmd.executeQuery();
      // b3: dua du lieu vao mang ds
      while (rs.next()) {

        // long makh = rs.getLong("makh");
        String tensach = rs.getString("tensach");
        long soluongmua = rs.getLong("SoLuongMua");
        long gia = rs.getLong("gia");
        long thanhtien = rs.getLong("ThanhTien");
        Date ngaymua = rs.getDate("NgayMua");
        int damua = rs.getInt("damua");
        ds.add(new lichsubean(makh, tensach, soluongmua, gia, thanhtien, ngaymua, damua));

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


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    lichsudao ls = new lichsudao();
    ArrayList<lichsubean> ds = new ArrayList<lichsubean>();
    ds = ls.getlichsu(20);
    for (lichsubean l : ds) {
      System.out.println(l.getGia() + " " + l.getMakh() + " " + l.getSoluongmua());
    }
  }
}

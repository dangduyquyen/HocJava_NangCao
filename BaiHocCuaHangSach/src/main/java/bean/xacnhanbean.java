package bean;

import java.util.Date;

public class xacnhanbean {

  private String macthd;
  private String mahd;
  private String hoten;
  private long soluongmua;
  private long gia;
  private long thanhtien;
  private boolean damua;
  private Date ngaymua;

  public xacnhanbean() {
    super();
    // TODO Auto-generated constructor stub
  }

  public xacnhanbean(String macthd, String mahd, String hoten, long soluongmua, long gia,
      long thanhtien, boolean damua, Date ngaymua) {
    super();
    this.macthd = macthd;
    this.mahd = mahd;
    this.hoten = hoten;
    this.soluongmua = soluongmua;
    this.gia = gia;
    this.thanhtien = thanhtien;
    this.damua = damua;
    this.ngaymua = ngaymua;
  }

  public String getMacthd() {
    return macthd;
  }

  public void setMacthd(String macthd) {
    this.macthd = macthd;
  }

  public String getMahd() {
    return mahd;
  }

  public void setMahd(String mahd) {
    this.mahd = mahd;
  }

  public String getHoten() {
    return hoten;
  }

  public void setHoten(String hoten) {
    this.hoten = hoten;
  }

  public long getSoluongmua() {
    return soluongmua;
  }

  public void setSoluongmua(long soluongmua) {
    this.soluongmua = soluongmua;
  }

  public long getGia() {
    return gia;
  }

  public void setGia(long gia) {
    this.gia = gia;
  }

  public long getThanhtien() {
    return thanhtien;
  }

  public void setThanhtien(long thanhtien) {
    this.thanhtien = thanhtien;
  }

  public boolean isDamua() {
    return damua;
  }

  public void setDamua(boolean damua) {
    this.damua = damua;
  }

  public Date getNgaymua() {
    return ngaymua;
  }

  public void setNgaymua(Date ngaymua) {
    this.ngaymua = ngaymua;
  }



}

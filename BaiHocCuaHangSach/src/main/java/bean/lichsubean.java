package bean;

import java.util.Date;

public class lichsubean {

  private long makh;
  private String tensach;
  private long soluongmua;
  private long gia;
  private long thanhtien;
  private Date ngaymua;
  private int damua;

  public lichsubean() {
    super();
    // TODO Auto-generated constructor stub
  }

  public lichsubean(long makh, String tensach, long soluongmua, long gia, long thanhtien,
      Date ngaymua, int damua) {
    super();
    this.makh = makh;
    this.tensach = tensach;
    this.soluongmua = soluongmua;
    this.gia = gia;
    this.thanhtien = thanhtien;
    this.ngaymua = ngaymua;
    this.damua = damua;
  }

  public long getMakh() {
    return makh;
  }

  public void setMakh(long makh) {
    this.makh = makh;
  }

  public String getTensach() {
    return tensach;
  }

  public void setTensach(String tensach) {
    this.tensach = tensach;
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

  public Date getNgaymua() {
    return ngaymua;
  }

  public void setNgaymua(Date ngaymua) {
    this.ngaymua = ngaymua;
  }

  public int getDamua() {
    return damua;
  }

  public void setDamua(int damua) {
    this.damua = damua;
  }



}

package bo;

import dao.hoadondao;

public class hoadonbo {

  hoadondao hddao = new hoadondao();

  public long getmaxhd() {
    return hddao.getmaxhd();
  }

  public int Them(long makh) {
    return hddao.Them(makh);
  }

  public int Thanhtoan(long makh) {
    return hddao.Thanhtoan(makh);
  }
}

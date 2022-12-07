package bo;

import java.util.ArrayList;
import bean.dangnhapbean;
import dao.dangnhapdao;

public class dangnhapbo {

  ArrayList<dangnhapbean> ds;
  dangnhapdao dndao = new dangnhapdao();

  public ArrayList<dangnhapbean> getdangnhap() {
    ds = dndao.getdangnhap();
    return ds;
  }

  public int Kiemtra(String tendn, String pass) {
    int check = 0;
    for (dangnhapbean dn : ds)
      if (dn.getTendn().equals(tendn) && dn.getPass().equals(pass))
        check = 1;
    return check;
  }

  public void ThemDN(String tendn, String pass) {
    for (dangnhapbean h : ds)
      if (h.getTendn().equals(tendn)) {
        return;
      }
    ds.add(new dangnhapbean(tendn, pass));
  }
}

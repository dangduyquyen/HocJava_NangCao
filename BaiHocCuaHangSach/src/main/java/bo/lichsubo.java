package bo;

import java.util.ArrayList;
import bean.lichsubean;
import dao.lichsudao;

public class lichsubo {

  ArrayList<lichsubean> ds;
  lichsudao lsdao = new lichsudao();

  public ArrayList<lichsubean> getlichsu(long makh) {
    return lsdao.getlichsu(makh);
  }

}

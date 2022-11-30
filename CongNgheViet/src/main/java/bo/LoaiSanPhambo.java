package bo;

import java.util.ArrayList;

import bean.LoaiSanPhambean;
import dao.LoaiSanPhamdao;

public class LoaiSanPhambo {
	LoaiSanPhamdao lspdao = new LoaiSanPhamdao();
	ArrayList<LoaiSanPhambean> dsloaiSP;

	public ArrayList<LoaiSanPhambean> getloai() {
		dsloaiSP = lspdao.getLoai();
		return dsloaiSP;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

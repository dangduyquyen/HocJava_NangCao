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

	public boolean themLoaiSP(String maLoaiSP, String tenLoaiSP) {
		if (lspdao.themLoaiSP(maLoaiSP, tenLoaiSP)) {
			return true;
		}
		return false;
	}

	public boolean xoaLoaiSP(String maLoaiSP) {
		if (lspdao.xoaLoaiSP(maLoaiSP)) {
			return true;
		}
		return false;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

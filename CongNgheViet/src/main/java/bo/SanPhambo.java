package bo;

import java.util.ArrayList;

import bean.SanPhambean;
import dao.SanPhamdao;

public class SanPhambo {
	ArrayList<SanPhambean> ds;
	SanPhamdao spdao = new SanPhamdao();

	public ArrayList<SanPhambean> getSanPham() {
		ds = spdao.getSanPham();
		return ds;
	}

	public ArrayList<SanPhambean> getDienThoai() {
		ArrayList<SanPhambean> tam = new ArrayList<SanPhambean>();
		for (SanPhambean s : tam) {
			if (s.getMaLoaiSP().equals("DT")) {
				tam.add(s);
			}
		}
		return tam;
	}

	public static void main(String[] args) {
		SanPhambo spbo = new SanPhambo();
		ArrayList<SanPhambean> ds = spbo.getDienThoai();
		for (SanPhambean s : ds) {
			System.out.println(s.getTenSP());
		}

	}
}

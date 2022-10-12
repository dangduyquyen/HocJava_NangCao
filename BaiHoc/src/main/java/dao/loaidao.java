package dao;

import java.util.ArrayList;

import bean.loaibean;

public class loaidao {
	public ArrayList<loaibean> getloai() {
		// tạo 1 mảng lưu toàn bộ loại
		ArrayList<loaibean> ds = new ArrayList<loaibean>();
		ds.add(new loaibean("tin", "Công nghệ thông tin"));
		ds.add(new loaibean("toan", "Giải tích"));
		ds.add(new loaibean("ly", "Vật lý"));
		ds.add(new loaibean("anh", "Anh văn"));
		ds.add(new loaibean("hoa", "Hóa hữu cơ"));
		return ds;
	}
}

package dao;

import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getsach() {
		ArrayList<sachbean> ds = new ArrayList<sachbean>();
		ds.add(new sachbean("s1", "Cơ sỡ dữ liệu", "Lê Nam", 10, 100, "b1.jpg", "tin"));
		ds.add(new sachbean("s2", "Thiết kế cơ sỡ dữ liệu", "Lê Anh", 10, 100, "b2.jpg", "tin"));
		ds.add(new sachbean("s3", "java cơ bản", "Lê Tiến", 10, 100, "b3.jpg", "tin"));
		ds.add(new sachbean("s4", "toán rời rạc", "Lê Tú", 10, 100, "b4.jpg", "toan"));
		ds.add(new sachbean("s5", "Giải tích", "Lê Lộc", 10, 100, "b5.jpg", "toan"));
		ds.add(new sachbean("s6", "Hóa hưu cơ", "Lê Bảo", 10, 100, "b6.jpg", "hoa"));
		return ds;
	}
}

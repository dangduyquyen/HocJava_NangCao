package bean;

public class LoaiSanPhambean {
	private String MaLoaiSP;
	private String TenLoaiSP;

	public LoaiSanPhambean() {
		// TODO Auto-generated constructor stub
	}

	public LoaiSanPhambean(String maLoaiSP, String tenLoaiSP) {
		super();
		MaLoaiSP = maLoaiSP;
		TenLoaiSP = tenLoaiSP;
	}

	public String getMaLoaiSP() {
		return MaLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		MaLoaiSP = maLoaiSP;
	}

	public String getTenLoaiSP() {
		return TenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		TenLoaiSP = tenLoaiSP;
	}

}

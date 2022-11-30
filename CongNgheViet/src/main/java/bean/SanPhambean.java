package bean;

public class SanPhambean {
	private String MaSP;
	private String MaLoaiSP;
	private String TenSP;
	private long SoLuong;
	private long Gia;
	private String AnhSP;
	private String NhaSX;
	private long NamSX;
	private String ThoiGianBaoHanh;
	private String ThongTinSP;

	public SanPhambean() {
		// TODO Auto-generated constructor stub
	}

	public SanPhambean(String maSP, String maLoaiSP, String tenSP, long soLuong, long gia, String anhSP, String nhaSX,
			long namSX, String thoiGianBaoHanh, String thongTinSP) {
		super();
		MaSP = maSP;
		MaLoaiSP = maLoaiSP;
		TenSP = tenSP;
		SoLuong = soLuong;
		Gia = gia;
		AnhSP = anhSP;
		NhaSX = nhaSX;
		NamSX = namSX;
		ThoiGianBaoHanh = thoiGianBaoHanh;
		ThongTinSP = thongTinSP;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public String getMaLoaiSP() {
		return MaLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		MaLoaiSP = maLoaiSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public long getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(long soLuong) {
		SoLuong = soLuong;
	}

	public long getGia() {
		return Gia;
	}

	public void setGia(long gia) {
		Gia = gia;
	}

	public String getAnhSP() {
		return AnhSP;
	}

	public void setAnhSP(String anhSP) {
		AnhSP = anhSP;
	}

	public String getNhaSX() {
		return NhaSX;
	}

	public void setNhaSX(String nhaSX) {
		NhaSX = nhaSX;
	}

	public long getNamSX() {
		return NamSX;
	}

	public void setNamSX(long namSX) {
		NamSX = namSX;
	}

	public String getThoiGianBaoHanh() {
		return ThoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
		ThoiGianBaoHanh = thoiGianBaoHanh;
	}

	public String getThongTinSP() {
		return ThongTinSP;
	}

	public void setThongTinSP(String thongTinSP) {
		ThongTinSP = thongTinSP;
	}

}

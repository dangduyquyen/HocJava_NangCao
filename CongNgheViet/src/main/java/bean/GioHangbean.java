package bean;

public class GioHangbean {
	private String maSP;
	private String tenSP;
	private long gia;
	private long soLuong;
	private long thanhTien;
	private String anh;

	public GioHangbean() {
		// TODO Auto-generated constructor stub
	}

	public GioHangbean(String maSP, String tenSP, long gia, long soLuong, String anh) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
		this.thanhTien = gia * soLuong;
		this.anh = anh;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}

	public long getThanhTien() {
		return thanhTien = gia * soLuong;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

}

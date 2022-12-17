package bean;

import java.util.Date;

public class LichSuDonHangbean {
	private long maKH;
	private String tenSP;
	private String AnhSP;
	private long soLuongMua;
	private long gia;
	private long thanhTien;
	private Date ngayMua;
	private int daMua;

	public LichSuDonHangbean() {
		// TODO Auto-generated constructor stub
	}

	public LichSuDonHangbean(long maKH, String tenSP, String anhSP, long soLuongMua, long gia, long thanhTien,
			Date ngayMua, int daMua) {
		super();
		this.maKH = maKH;
		this.tenSP = tenSP;
		AnhSP = anhSP;
		this.soLuongMua = soLuongMua;
		this.gia = gia;
		this.thanhTien = thanhTien;
		this.ngayMua = ngayMua;
		this.daMua = daMua;
	}

	public long getMaKH() {
		return maKH;
	}

	public void setMaKH(long maKH) {
		this.maKH = maKH;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getAnhSP() {
		return AnhSP;
	}

	public void setAnhSP(String anhSP) {
		AnhSP = anhSP;
	}

	public long getSoLuongMua() {
		return soLuongMua;
	}

	public void setSoLuongMua(long soLuongMua) {
		this.soLuongMua = soLuongMua;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(long thanhTien) {
		this.thanhTien = thanhTien;
	}

	public Date getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}

	public int getDaMua() {
		return daMua;
	}

	public void setDaMua(int daMua) {
		this.daMua = daMua;
	}

}

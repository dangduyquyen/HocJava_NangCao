package bean;

import java.util.Date;

public class HoatDongCuaHangbean {
	private String maHoatDong;
	private String tenHoatDong;
	private String anhHD;
	private Date ngayTaoHD;

	public HoatDongCuaHangbean() {
		// TODO Auto-generated constructor stub
	}

	public HoatDongCuaHangbean(String maHoatDong, String tenHoatDong, String anhHD, Date ngayTaoHD) {
		super();
		this.maHoatDong = maHoatDong;
		this.tenHoatDong = tenHoatDong;
		this.anhHD = anhHD;
		this.ngayTaoHD = ngayTaoHD;
	}

	public String getMaHoatDong() {
		return maHoatDong;
	}

	public void setMaHoatDong(String maHoatDong) {
		this.maHoatDong = maHoatDong;
	}

	public String getTenHoatDong() {
		return tenHoatDong;
	}

	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}

	public String getAnhHD() {
		return anhHD;
	}

	public void setAnhHD(String anhHD) {
		this.anhHD = anhHD;
	}

	public Date getNgayTaoHD() {
		return ngayTaoHD;
	}

	public void setNgayTaoHD(Date ngayTaoHD) {
		this.ngayTaoHD = ngayTaoHD;
	}

}

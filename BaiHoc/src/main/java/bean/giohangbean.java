package bean;

public class giohangbean {
	private String masach;
	private String tensach;
	private long gia;
	private long soluong;
	private long thanhtien;

	public giohangbean() {
		// TODO Auto-generated constructor stub
	}

	public giohangbean(String masach, String tensach, long gia, long soluong, long thanhtien) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.gia = gia;
		this.soluong = soluong;
	}

	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public long getThanhtien() {
		return soluong * gia;
	}

	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

}

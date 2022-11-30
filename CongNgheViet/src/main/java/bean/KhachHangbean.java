package bean;

public class KhachHangbean {
	private long MaKhachHang;
	private String HoTen;
	private String Email;
	private String DiaChi;
	private String SDT;
	private String TenDN;
	private String MatKhauDN;

	public KhachHangbean() {
		// TODO Auto-generated constructor stub
	}

	public KhachHangbean(long maKhachHang, String hoTen, String email, String diaChi, String sDT, String tenDN,
			String matKhauDN) {
		super();
		MaKhachHang = maKhachHang;
		HoTen = hoTen;
		Email = email;
		DiaChi = diaChi;
		SDT = sDT;
		TenDN = tenDN;
		MatKhauDN = matKhauDN;
	}

	public long getMaKhachHang() {
		return MaKhachHang;
	}

	public void setMaKhachHang(long maKhachHang) {
		MaKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getTenDN() {
		return TenDN;
	}

	public void setTenDN(String tenDN) {
		TenDN = tenDN;
	}

	public String getMatKhauDN() {
		return MatKhauDN;
	}

	public void setMatKhauDN(String matKhauDN) {
		MatKhauDN = matKhauDN;
	}

}

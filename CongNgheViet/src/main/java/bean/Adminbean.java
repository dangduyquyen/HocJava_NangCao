package bean;

public class Adminbean {
	private String tenAdmin;
	private String tenDN;
	private String matKhauDN;
	private boolean quyen;

	public Adminbean() {
		// TODO Auto-generated constructor stub
	}

	public Adminbean(String tenAdmin, String tenDN, String matKhauDN, boolean quyen) {
		super();
		this.tenAdmin = tenAdmin;
		this.tenDN = tenDN;
		this.matKhauDN = matKhauDN;
		this.quyen = quyen;
	}

	public String getTenAdmin() {
		return tenAdmin;
	}

	public void setTenAdmin(String tenAdmin) {
		this.tenAdmin = tenAdmin;
	}

	public String getTenDN() {
		return tenDN;
	}

	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}

	public String getMatKhauDN() {
		return matKhauDN;
	}

	public void setMatKhauDN(String matKhauDN) {
		this.matKhauDN = matKhauDN;
	}

	public boolean isQuyen() {
		return quyen;
	}

	public void setQuyen(boolean quyen) {
		this.quyen = quyen;
	}

}

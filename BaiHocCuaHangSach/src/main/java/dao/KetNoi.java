package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoi {
	public Connection cn;

	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String st = "jdbc:sqlserver://DESKTOP-HVNL2AM\\\\SQLEXPRESS:1433;databaseName=Qlsach;user=sa; password=123123";
			cn = DriverManager.getConnection(st);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KetNoi kn = new KetNoi();
		kn.KetNoi();
	}

}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoi {
	public Connection cn;

	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String st = "jdbc:sqlserver://DESKTOP-HVNL2AM\\\\SQLEXPRESS:1433;databaseName=CuaHangCongNghe;user=sa; password=123123";
			cn = DriverManager.getConnection(st);
			// System.out.println("kntc");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//	public static void main(String[] args) {
//		KetNoi kn = new KetNoi();
//		kn.KetNoi();
//
//	}
}
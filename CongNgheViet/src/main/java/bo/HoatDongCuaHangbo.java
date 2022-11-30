package bo;

import java.util.ArrayList;

import bean.HoatDongCuaHangbean;
import dao.HoatDongCuaHangdao;

public class HoatDongCuaHangbo {
	HoatDongCuaHangdao hddao = new HoatDongCuaHangdao();
	ArrayList<HoatDongCuaHangbean> dsHoatDong;

	public ArrayList<HoatDongCuaHangbean> getHoatDong() {
		dsHoatDong = hddao.getHoatDong();
		return dsHoatDong;
	}
}

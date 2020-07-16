package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import model.ConnectDB;
import model.ThongTinSanPham;

public class ThongTinSanPhamDAO {
	public ArrayList<ThongTinSanPham> ttsp;
	public static Map<String, ThongTinSanPham> mapThongTinSanPham = getLoadThongTinSanPhamDTB();
	// public static Map<String, ThongTinSanPham> mapUndo = new HashMap<>();

	public ThongTinSanPhamDAO() {
		
	}
	String MaThongTinSanPham;
	String MoTa1;
	String MoTa2;
	String HinhAnhChiTiet;

	 public ThongTinSanPham getNameThongTinSanPham(String id){
		 ThongTinSanPham tt= null;
	 	for(ThongTinSanPham ttsp: mapThongTinSanPham.values()){
	 		if(ttsp.getMaThongTinSanPham().equals(id)){
	 			tt=ttsp;
	 		}
	 	}
	 	return tt;
	 }
	
	public ThongTinSanPham find(String id){
		return mapThongTinSanPham.get(id);
	}
	
	public Map<String, ThongTinSanPham> getMapThongTinSanPham() {
		return mapThongTinSanPham;
	}

	public ArrayList<ThongTinSanPham> getttsp() {
		return ttsp;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapThongTinSanPham);
		mapThongTinSanPham.clear();

		return true;
	}

	public boolean add(Object obj) {
		ThongTinSanPham ttsp = (ThongTinSanPham) obj;
		mapThongTinSanPham.put(ttsp.getMaThongTinSanPham(), ttsp);
		try {
			Connection connection = ConnectDB.connect();
			PreparedStatement statement = connection.prepareStatement("insert into ThongTinSanPham values(?,?,?,?)");
			statement.setString(1, ttsp.getMaThongTinSanPham());
			statement.setString(2, ttsp.getMoTa1());
			statement.setString(3, ttsp.getMoTa2());
			statement.setString(4, ttsp.getHinhAnhChiTiet());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}

	
	public boolean edit(Object obj) {
		ThongTinSanPham ttsp = (ThongTinSanPham) obj;
		mapThongTinSanPham.replace(ttsp.getMaThongTinSanPham(), ttsp);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update ThongTinSanPham MoTa1=?,MoTa2=?,HinhAnhChiTiet=? where MaThongTinSanPham=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ttsp.getMoTa1());
			preparedStatement.setString(2, ttsp.getMoTa2());
			preparedStatement.setString(3, ttsp.getHinhAnhChiTiet());
			preparedStatement.setString(4, ttsp.getMaThongTinSanPham());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapThongTinSanPham.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from ThongTinSanPham where MaThongTinSanPham='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, ThongTinSanPham> getLoadThongTinSanPhamDTB() {
		Map<String, ThongTinSanPham> dsThongTinSanPham = new HashMap<String, ThongTinSanPham>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from ThongTinSanPham");
			while (rs.next()) {
				String MaThongTinSanPham = rs.getString(1);
				String MoTa1 = rs.getString(2);
				String MoTa2 = rs.getString(3);
				String HinhAnhChiTiet = rs.getString(4);
				dsThongTinSanPham.put(MaThongTinSanPham, new ThongTinSanPham(MaThongTinSanPham, MoTa1, MoTa2, HinhAnhChiTiet));
			}
			return dsThongTinSanPham;
		} catch (Exception e) {
			System.out.println("Lỗi ở load danh sách database " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapThongTinSanPham(Map<String, ThongTinSanPham> mapThongTinSanPham) {
		ThongTinSanPhamDAO.mapThongTinSanPham = mapThongTinSanPham;
	}

	public static void main(String[] args) {

	}
}

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
import model.KhachHang;

public class KhachHangDAO {
	public ArrayList<KhachHang> kh;
	public static Map<String, KhachHang> mapKhachHang = getLoadCustomerDTB();
	// public static Map<String, KhachHang> mapUndo = new HashMap<>();
	String MaKH;
	String TenKH;
	String SdtKH;
	String CMND;
	String DiaChi;
	public KhachHangDAO() {
		
	}

	public String getNameKhachHang(String id){
		String name="";
		for(KhachHang kh: mapKhachHang.values()){
			if(kh.getMaKH().equals(id)){
				name=kh.getTenKH();
			}
		}
		return name;
	}
	
	public KhachHang find(String id){
		return mapKhachHang.get(id);
	}
	
	public Map<String, KhachHang> getMapKhachHang() {
		return mapKhachHang;
	}

	public ArrayList<KhachHang> getKh() {
		return kh;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapKhachHang);
		mapKhachHang.clear();

		return true;
	}

	public boolean add(Object obj) {
		KhachHang kh = (KhachHang) obj;
		mapKhachHang.put(kh.getMaKH(), kh);
		try {
			Connection connection = ConnectDB.connect();
			PreparedStatement statement = connection.prepareStatement("insert into KhachHang values(?,?,?,?,?)");
			statement.setString(1, kh.getMaKH());
			statement.setString(2, kh.getTenKH());
			statement.setString(3, kh.getSdtKH());
			statement.setString(4, kh.getCMND());
			statement.setString(5, kh.getDiaChi());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}

	
	public boolean edit(Object obj) {
		KhachHang kh = (KhachHang) obj;
		mapKhachHang.replace(kh.getMaKH(), kh);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update KhachHang set TenKH=?,SdtKH=?,CMND=?,DiaChi=? where MaKH=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, kh.getTenKH());
			preparedStatement.setString(2, kh.getSdtKH());
			preparedStatement.setString(3, kh.getCMND());
			preparedStatement.setString(4, kh.getDiaChi());
			preparedStatement.setString(5, kh.getMaKH());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapKhachHang.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from KhachHang where MaKH='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, KhachHang> getLoadCustomerDTB() {
		Map<String, KhachHang> dsKhachHang = new HashMap<String, KhachHang>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from KhachHang");
			while (rs.next()) {
				String maKH = rs.getString(1);
				String tenKH = rs.getString(2);
				String sdtKH = rs.getString(3);
				String CMND = rs.getString(4);
				String DiaChi = rs.getString(5);
				dsKhachHang.put(maKH, new KhachHang(maKH, tenKH, sdtKH, CMND, DiaChi));
			}
			return dsKhachHang;
		} catch (Exception e) {
			System.out.println("Lỗi ở load danh sách database " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapKhachHang(Map<String, KhachHang> mapKhachHang) {
		KhachHangDAO.mapKhachHang = mapKhachHang;
	}

	public static void main(String[] args) {

	}
}
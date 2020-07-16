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
import model.NhaCungCap;

public class NhaCungCapDAO {
	public ArrayList<NhaCungCap> ncc;
	public static Map<String, NhaCungCap> mapNhaCungCap = getLoadNhaCungCapDTB();
	// public static Map<String, NhaCungCap> mapUndo = new HashMap<>();

	public NhaCungCapDAO() {
		
	}
	String MaNhaCungCap;
	String TenNhaCungCap;
	String DiaChi;
	String SoDienThoai;
	String Logo;
	public String getNameNhaCungCap(String id){
		String name="";
		for(NhaCungCap ncc: mapNhaCungCap.values()){
			if(ncc.getMaNhaCungCap().equals(id)){
				name=ncc.getTenNhaCungCap();
			}
		}
		return name;
	}
	
	public NhaCungCap find(String id){
		return mapNhaCungCap.get(id);
	}
	
	public Map<String, NhaCungCap> getMapNhaCungCap() {
		return mapNhaCungCap;
	}

	public ArrayList<NhaCungCap> getNcc() {
		return ncc;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapNhaCungCap);
		mapNhaCungCap.clear();

		return true;
	}

	public boolean add(Object obj) {
		NhaCungCap ncc = (NhaCungCap) obj;
		mapNhaCungCap.put(ncc.getMaNhaCungCap(), ncc);
		try {
			Connection connection = ConnectDB.connect();
			PreparedStatement statement = connection.prepareStatement("insert into NhaCungCap values(?,?,?,?,?)");
			statement.setString(1, ncc.getMaNhaCungCap());
			statement.setString(2, ncc.getTenNhaCungCap());
			statement.setString(3, ncc.getDiaChi());
			statement.setString(4, ncc.getSoDienThoai());
			statement.setString(5, ncc.getLogo());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}

	
	public boolean edit(Object obj) {
		NhaCungCap ncc = (NhaCungCap) obj;
		mapNhaCungCap.replace(ncc.getMaNhaCungCap(), ncc);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update NhaCungCap set TenNhaCungCap=?,DiaChi=?,SoDienThoai=?,Logo=? where MaNhaCungCap=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ncc.getTenNhaCungCap());
			preparedStatement.setString(2, ncc.getDiaChi());
			preparedStatement.setString(3, ncc.getSoDienThoai());
			preparedStatement.setString(4, ncc.getLogo());
			preparedStatement.setString(5, ncc.getMaNhaCungCap());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapNhaCungCap.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from NhaCungCap where MaNhaCungCap='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, NhaCungCap> getLoadNhaCungCapDTB() {
		Map<String, NhaCungCap> dsNhaCungCap = new HashMap<String, NhaCungCap>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from NhaCungCap");
			while (rs.next()) {
				String maNhaCungCap = rs.getString(1);
				String tenNhaCungCap = rs.getString(2);
				String diaChi = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String logo = rs.getString(5);
				dsNhaCungCap.put(maNhaCungCap, new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai, logo));
			}
			return dsNhaCungCap;
		} catch (Exception e) {
			System.out.println("Lỗi ở load danh sách database " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapNhaCungCap(Map<String, NhaCungCap> mapNhaCungCap) {
		NhaCungCapDAO.mapNhaCungCap = mapNhaCungCap;
	}

	public static void main(String[] args) {

	}
}
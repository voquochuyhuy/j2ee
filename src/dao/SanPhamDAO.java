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
import model.SanPham;

public class SanPhamDAO {
	public ArrayList<SanPham> sp;
	public static Map<String, SanPham> mapSanPham = getLoadSanPhamDTB();
	// public static Map<String, SanPham> mapUndo = new HashMap<>();

	public SanPhamDAO() {
		
	}
	
	public SanPham getSanPham(String id){
		SanPham sanpham = null;
		for(SanPham sp: mapSanPham.values()){
			if(sp.getMaSanPham().equals(id)){
				sanpham=sp;
			}
		}
		return sanpham;
	}
	
	public SanPham find(String id){
		return mapSanPham.get(id);
	}
	
	public Map<String, SanPham> getMapSanPham() {
		return mapSanPham;
	}

	public ArrayList<SanPham> getsp() {
		return sp;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapSanPham);
		mapSanPham.clear();

		return true;
	}

	public boolean add(Object obj) {
		SanPham sp = (SanPham) obj;
		mapSanPham.put(sp.getMaSanPham(), sp);
		try {
			Connection connection = ConnectDB.getInstance();
			PreparedStatement statement = connection.prepareStatement("insert into SanPham values(?,?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, sp.getMaSanPham());
			statement.setString(2, sp.getMaNhaCungCap());
			statement.setString(3, sp.getMaLoaiSanPham());
			statement.setString(4, sp.getMaThongTinSanPham());
			statement.setString(5, sp.getTenSanPham());
			statement.setString(6, sp.getGiaTien());
			statement.setString(7, sp.getSoLuong());
			statement.setString(8, sp.getHinhAnh());
			statement.setString(9, sp.getSoLuongNhap());
			statement.setString(10, sp.getSoLuongBan());
			statement.setString(11, sp.getGiaGiam());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}

	
	public boolean edit(Object obj) {
		SanPham sp = (SanPham) obj;
		mapSanPham.replace(sp.getMaSanPham(), sp);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update SanPham set MaNhaCungCap=?,MaLoaiSanPham=?,MaThongTinSanPham=?,TenSanPham=?,GiaTien=?,SoLuong=?, HinhAnh=?,SoLuongNhap=?,SoLuongBan=?,GiaGiam=?,Matspau=? where MaSanPham=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, sp.getMaNhaCungCap());
			preparedStatement.setString(2, sp.getMaLoaiSanPham());
			preparedStatement.setString(3, sp.getMaThongTinSanPham());
			preparedStatement.setString(4, sp.getTenSanPham());
			preparedStatement.setString(5, sp.getGiaTien());
			preparedStatement.setString(6, sp.getSoLuong());
			preparedStatement.setString(7, sp.getHinhAnh());
			preparedStatement.setString(8, sp.getSoLuongNhap());
			preparedStatement.setString(9, sp.getSoLuongBan());
			preparedStatement.setString(10, sp.getGiaGiam());
			preparedStatement.setString(11, sp.getMaSanPham());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapSanPham.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from SanPham where MaSanPham='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, SanPham> getLoadSanPhamDTB() {
		Map<String, SanPham> dsSanPham = new HashMap<String, SanPham>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from SanPham");
			while (rs.next()) {
				String MaSanPham = rs.getString(1);
				String MaNhaCungCap = rs.getString(2);
				String MaLoaiSanPham = rs.getString(3);
				String MaThongTinSanPham = rs.getString(4);
				String TenSanPham = rs.getString(5);
				String GiaTien = rs.getString(6);
				String SoLuong = rs.getString(7);
				String HinhAnh = rs.getString(8);
				String SoLuongNhap = rs.getString(9);
				String SoLuongBan = rs.getString(10);
				String GiaGiam = rs.getString(11);
				dsSanPham.put(MaSanPham, new SanPham(MaSanPham, MaNhaCungCap, MaLoaiSanPham, MaThongTinSanPham, TenSanPham,GiaTien, SoLuong, HinhAnh, SoLuongNhap, SoLuongBan,GiaGiam));
			}
			
			return dsSanPham;
		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}
	
	public static Map<String, SanPham> getLoadSanPhamDTBbyId(String id) {
		Map<String, SanPham> dsSanPham = new HashMap<String, SanPham>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from SanPham where  MaLoaiSanPham='" + id + "'");
			while (rs.next()) {
				String MaSanPham = rs.getString(1);
				String MaNhaCungCap = rs.getString(2);
				String MaLoaiSanPham = rs.getString(3);
				String MaThongTinSanPham = rs.getString(4);
				String TenSanPham = rs.getString(5);
				String GiaTien = rs.getString(6);
				String SoLuong = rs.getString(7);
				String HinhAnh = rs.getString(8);
				String SoLuongNhap = rs.getString(9);
				String SoLuongBan = rs.getString(10);
				String GiaGiam = rs.getString(11);
				dsSanPham.put(MaSanPham, new SanPham(MaSanPham, MaNhaCungCap, MaLoaiSanPham, MaThongTinSanPham, TenSanPham,GiaTien, SoLuong, HinhAnh, SoLuongNhap, SoLuongBan,GiaGiam));
			}
			
			return dsSanPham;
		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapSanPham(Map<String, SanPham> mapSanPham) {
		SanPhamDAO.mapSanPham = mapSanPham;
	}

	public static void main(String[] args) {
		
	}
}

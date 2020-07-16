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
import model.DonHang;

public class DonHangDAO {
	public ArrayList<DonHang> dh;
	public static Map<String, DonHang> mapDonHang = getLoadDonHangDTB();
	// public static Map<String, DonHang> mapUndo = new HashMap<>();

	public DonHangDAO() {
		
	}

	public String getNameKhachHang(String id){
		String name="";
		for(DonHang dh: mapDonHang.values()){
			if(dh.getMaDonHang().equals(id)){
				name=dh.getTenKhachHang();
			}
		}
		return name;
	}
	
	public DonHang find(String id){
		return mapDonHang.get(id);
	}
	
	public Map<String, DonHang> getMapDonHang() {
		return mapDonHang;
	}

	public ArrayList<DonHang> getDonHang() {
		return dh;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapDonHang);
		mapDonHang.clear();

		return true;
	}

	public boolean add(Object obj) {
		DonHang dh = (DonHang) obj;
		mapDonHang.put(dh.getMaDonHang(), dh);
		try {
			Connection connection = ConnectDB.connect();
			PreparedStatement statement = connection.prepareStatement("insert into DonHang values(?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, dh.getMaDonHang());
			statement.setString(2, dh.getMaKhachHang());
			statement.setString(3, dh.getTenKhachHang());
			statement.setString(4, dh.getDanhSachMaSanPham());
			statement.setString(5, dh.getNgayMua());
			statement.setString(6, dh.getDiaChi());
			statement.setString(7, dh.getSoDienThoai());
			statement.setString(8, dh.getEmail());
			statement.setString(9, dh.getTinhTrangDonHang());
			statement.setString(10, dh.getTongTien());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}
	
	public boolean edit(Object obj) {
		DonHang dh = (DonHang) obj;
		mapDonHang.replace(dh.getMaKhachHang(), dh);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update DonHang set MaKhachHang=?,TenKhachHang=?,DanhSachMaSanPham=?,NgayMua=?,DiaChi=?,SoDienThoai=?,Email=?,TinhTrangDonHang=?,TongTien where MaDonHang=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dh.getMaKhachHang());
			preparedStatement.setString(2, dh.getTenKhachHang());
			preparedStatement.setString(3, dh.getDanhSachMaSanPham());
			preparedStatement.setString(4, dh.getNgayMua());
			preparedStatement.setString(5, dh.getDiaChi());
			preparedStatement.setString(6, dh.getSoDienThoai());
			preparedStatement.setString(7, dh.getEmail());
			preparedStatement.setString(8, dh.getTinhTrangDonHang());
			preparedStatement.setString(9, dh.getTongTien());
			preparedStatement.setString(10, dh.getMaDonHang());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapDonHang.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from DonHang where MaDonHang='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, DonHang> getLoadDonHangDTB() {
		Map<String, DonHang> dsDonHang = new HashMap<String, DonHang>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from DonHang");
			while (rs.next()) {
				String MaDonHang = rs.getString(1);
				String MaKhachHang = rs.getString(2);
				String TenKhachHang = rs.getString(3);
				String DanhSachMaSanPham = rs.getString(4);
				String NgayMua = rs.getString(5);
				String DiaChi = rs.getString(6);
				String SoDienThoai = rs.getString(7);
				String Email = rs.getString(8);
				String TinhTrangDonHang = rs.getString(9);
				String TongTien = rs.getString(10);
				dsDonHang.put(MaDonHang, new DonHang(MaDonHang, MaKhachHang, TenKhachHang, DanhSachMaSanPham, NgayMua ,DiaChi ,SoDienThoai ,Email ,TinhTrangDonHang ,TongTien));
			}
			return dsDonHang;
		} catch (Exception e) {
			System.out.println("Lỗi ở load danh sách database " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapDonHang(Map<String, DonHang> mapDonHang) {
		DonHangDAO.mapDonHang = mapDonHang;
	}

	public static void main(String[] args) {

	}
}

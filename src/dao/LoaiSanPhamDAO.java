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
import model.LoaiSanPham;

public class LoaiSanPhamDAO {
	public ArrayList<LoaiSanPham> lsp;
	public static Map<String, LoaiSanPham> mapLoaiSanPham = getLoadLoaiSanPhamDTB();
	// public static Map<String, KhachHang> mapUndo = new HashMap<>();

	public LoaiSanPhamDAO() {
		
	}

	public String getNameLoaiSanPham(String id){
		String name="";
		for(LoaiSanPham lsp: mapLoaiSanPham.values()){
			if(lsp.getMaLoaiSanPham().equals(id)){
				name=lsp.getTenLoai();
			}
		}
		return name;
	}
	
	public LoaiSanPham find(String id){
		return mapLoaiSanPham.get(id);
	}
	
	public Map<String, LoaiSanPham> getMapLoaiSanPham() {
		return mapLoaiSanPham;
	}

	public ArrayList<LoaiSanPham> getLsp() {
		return lsp;
	}

	public boolean delAll() {
		// mapUndo.putAll(mapLoaiSanPham);
		mapLoaiSanPham.clear();

		return true;
	}

	public boolean add(Object obj) {
		LoaiSanPham lsp = (LoaiSanPham) obj;
		mapLoaiSanPham.put(lsp.getMaLoaiSanPham(), lsp);
		try {
			Connection connection = ConnectDB.connect();
			PreparedStatement statement = connection.prepareStatement("insert into LoaiSanPham values(?,?,?,?)");
			statement.setString(1, lsp.getMaLoaiSanPham());
			statement.setString(2, lsp.getTenLoai());
			statement.setString(3, lsp.getMaNhaCungCap());
			statement.setString(4, lsp.getMoTa());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;

	}

	
	public boolean edit(Object obj) {
		LoaiSanPham lsp = (LoaiSanPham) obj;
		mapLoaiSanPham.replace(lsp.getMaLoaiSanPham(), lsp);
		try {
			Connection connection = ConnectDB.connect();
			String sql = "update LoaiSanPham set TenLoai=?,MaNhaCungCap=?,MoTa=? where MaLoaiSanPham=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, lsp.getTenLoai());
			preparedStatement.setString(2, lsp.getMaNhaCungCap());
			preparedStatement.setString(3, lsp.getMoTa());
			preparedStatement.setString(4, lsp.getMaLoaiSanPham());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	
	public boolean del(String id) {
		mapLoaiSanPham.remove(id);
		try {
			new ConnectDB().thucThiSQL("delete from LoaiSanPham where MaLoaiSanPham='" + id + "'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static Map<String, LoaiSanPham> getLoadLoaiSanPhamDTB() {
		Map<String, LoaiSanPham> dsLoaiSanPham = new HashMap<String, LoaiSanPham>();
		try {
			ResultSet rs = new ConnectDB().chonDuLieu("select * from LoaiSanPham");
			while (rs.next()) {
				String maLoaiSanPham = rs.getString(1);
				String tenLoai = rs.getString(2);
				String maNhaCungCap = rs.getString(3);
				String moTa = rs.getString(4);
				dsLoaiSanPham.put(maLoaiSanPham, new LoaiSanPham(maLoaiSanPham, tenLoai, maNhaCungCap, moTa));
			}
			return dsLoaiSanPham;
		} catch (Exception e) {
			System.out.println("Lỗi ở load danh sách database " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void setMapLoaiSanPham(Map<String, LoaiSanPham> mapLoaiSanPham) {
		LoaiSanPhamDAO.mapLoaiSanPham = mapLoaiSanPham;
	}

	public static void main(String[] args) {

	}
}

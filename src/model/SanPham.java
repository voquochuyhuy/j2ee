package model;

public class SanPham {
	String MaSanPham;
	String MaNhaCungCap;
	String MaLoaiSanPham;
	String MaThongTinSanPham;
	String TenSanPham;
	String GiaTien;
	String SoLuong;
	String HinhAnh;
	String SoLuongNhap;
	String SoLuongBan;
	String GiaGiam;
	
	public SanPham(String MaSanPham, String MaNhaCungCap, String MaLoaiSanPham, String MaThongTinSanPham, String TenSanPham,
			 String GiaTien, String SoLuong, String HinhAnh, String SoLuongNhap,String SoLuongBan,String GiaGiam) {
		super();
		this.MaSanPham = MaSanPham;
		this.MaNhaCungCap = MaNhaCungCap;
		this.MaLoaiSanPham = MaLoaiSanPham;
		this.MaThongTinSanPham = MaThongTinSanPham;
		this.TenSanPham = TenSanPham;
		this.GiaTien = GiaTien;
		this.SoLuong = SoLuong;
		this.HinhAnh = HinhAnh;
		this.SoLuongNhap = SoLuongNhap;
		this.SoLuongBan = SoLuongBan;
		this.GiaGiam = GiaGiam;
	}
	public String getMaSanPham() {
		return MaSanPham;
	}
	public void setMaSanPham(String MaSanPham) {
		this.MaSanPham = MaSanPham;
	}

	public String getMaNhaCungCap() {
		return MaNhaCungCap;
	}
	public void setMaNhaCungCap(String MaNhaCungCap) {
		this.MaNhaCungCap = MaNhaCungCap;
	}

	public String getMaLoaiSanPham() {
		return MaLoaiSanPham;
	}
	public void setMaLoaiSanPham(String MaLoaiSanPham) {
		this.MaLoaiSanPham = MaLoaiSanPham;
	}

	public String getMaThongTinSanPham() {
		return MaThongTinSanPham;
	}
	public void setMaThongTinSanPham(String MaThongTinSanPham) {
		this.MaThongTinSanPham = MaThongTinSanPham;
	}

	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String TenSanPham) {
		this.TenSanPham = TenSanPham;
	}

	public String getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(String GiaTien) {
		this.GiaTien = GiaTien;
	}

	public String getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(String SoLuong) {
		this.SoLuong = SoLuong;
	}

	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String HinhAnh) {
		this.HinhAnh = HinhAnh;
	}

	public String getSoLuongNhap() {
		return SoLuongNhap;
	}
	public void setSoLuongNhap(String SoLuongNhap) {
		this.SoLuongNhap = SoLuongNhap;
	}

	public String getSoLuongBan() {
		return SoLuongBan;
	}
	public void setSoLuongBan(String SoLuongBan) {
		this.SoLuongBan = SoLuongBan;
	}
	
	public String getGiaGiam() {
		return GiaGiam;
	}
	public void setGiaGiam(String GiaGiam) {
		this.GiaGiam = GiaGiam;
	}

	//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}
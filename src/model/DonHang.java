package model;

public class DonHang {
	String MaDonHang;
	String MaKhachHang;
	String TenKhachHang;
	String DanhSachMaSanPham;
	String NgayMua;
	String DiaChi;
	String SoDienThoai;
	String Email;
	String TinhTrangDonHang;
	String TongTien;
	
	public DonHang(String MaDonHang,String MaKhachHang, String TenKhachHang, String DanhSachMaSanPham, String NgayMua, String DiaChi,
			String SoDienThoai, String Email, String TinhTrangDonHang, String TongTien) {
		super();
		this.MaDonHang = MaDonHang;
		this.TenKhachHang = TenKhachHang;
		this.MaKhachHang = MaKhachHang;
		this.DanhSachMaSanPham = DanhSachMaSanPham;
		this.NgayMua = NgayMua;
		this.DiaChi = DiaChi;
		this.SoDienThoai = SoDienThoai;
		this.Email = Email;
		this.TinhTrangDonHang = TinhTrangDonHang;
		this.TongTien = TongTien;
	}
	public String getMaDonHang() {
		return MaDonHang;
	}
	public void setMaDonHang(String MaDonHang) {
		this.MaDonHang = MaDonHang;
	}
	
	public String getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(String MaKhachHang) {
		this.MaKhachHang = MaKhachHang;
	}
	
	public String getTenKhachHang() {
		return TenKhachHang;
	}
	public void setTenKhachHang(String TenKhachHang) {
		this.TenKhachHang = TenKhachHang;
	}
	
	public String getDanhSachMaSanPham() {
		return DanhSachMaSanPham;
	}	
	public void setDanhSachMaSanPham(String DanhSachMaSanPham) {
		this.DanhSachMaSanPham = DanhSachMaSanPham;
	}
	
	public String getNgayMua() {
		return NgayMua;
	}	
	public void setNgayMua(String NgayMua) {
		this.NgayMua = NgayMua;
	}
	
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String DiaChi) {
		this.DiaChi = DiaChi;
	}
	
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String SoDienThoai) {
		this.SoDienThoai = SoDienThoai;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getTinhTrangDonHang() {
		return TinhTrangDonHang;
	}
	public void setTinhTrangDonHang(String TinhTrangDonHang) {
		this.TinhTrangDonHang = TinhTrangDonHang;
	}
	
	public String getTongTien() {
		return TongTien;
	}
	public void setTongTien(String TongTien) {
		this.TongTien = TongTien;
	}

	//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}

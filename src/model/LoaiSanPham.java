package model;

public class LoaiSanPham {
	String MaLoaiSanPham;
	String TenLoai;
	String MaNhaCungCap;
	String MoTa;
	public LoaiSanPham(String MaLoaiSanPham, String TenLoai, String MaNhaCungCap, String MoTa) {
		super();
		this.MaLoaiSanPham = MaLoaiSanPham;
		this.TenLoai = TenLoai;
		this.MaNhaCungCap = MaNhaCungCap;
		this.MoTa = MoTa;
	}
	public String getMaLoaiSanPham() {
		return MaLoaiSanPham;
	}
	public void setMaLoaiSanPham(String MaLoaiSanPham) {
		this.MaLoaiSanPham = MaLoaiSanPham;
	}
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String TenLoai) {
		this.TenLoai = TenLoai;
	}
	public String getMaNhaCungCap() {
		return MaNhaCungCap;
	}
	public void setMaNhaCungCap(String MaNhaCungCap) {
		this.MaNhaCungCap = MaNhaCungCap;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String MoTa) {
		this.MoTa = MoTa;
	}
	
//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}
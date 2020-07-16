package model;

public class NhaCungCap {
	String MaNhaCungCap;
	String TenNhaCungCap;
	String DiaChi;
	String SoDienThoai;
	String Logo;
	public NhaCungCap(String MaNhaCungCap, String TenNhaCungCap, String DiaChi, String SoDienThoai, String Logo) {
		super();
		this.MaNhaCungCap = MaNhaCungCap;
		this.TenNhaCungCap = TenNhaCungCap;
		this.DiaChi = DiaChi;
		this.SoDienThoai = SoDienThoai;
		this.Logo = Logo;
	}
	public String getMaNhaCungCap() {
		return MaNhaCungCap;
	}
	public void setMaNhaCungCap(String MaNhaCungCap) {
		this.MaNhaCungCap = MaNhaCungCap;
	}
	public String getTenNhaCungCap() {
		return TenNhaCungCap;
	}
	public void setTenNhaCungCap(String TenNhaCungCap) {
		this.TenNhaCungCap = TenNhaCungCap;
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
	public String getLogo() {
		return Logo;
	}
	public void setLogo(String Logo) {
		this.Logo = Logo;
	}
//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}

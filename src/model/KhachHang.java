package model;

public class KhachHang {
	String MaKH;
	String TenKH;
	String SdtKH;
	String CMND;
	String DiaChi;
	public KhachHang(String MaKH, String TenKH, String SdtKH, String CMND, String DiaChi) {
		super();
		this.MaKH = MaKH;
		this.TenKH = TenKH;
		this.SdtKH = SdtKH;
		this.CMND = CMND;
		this.DiaChi = DiaChi;
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String MaKH) {
		this.MaKH = MaKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String TenKH) {
		this.TenKH = TenKH;
	}
	public String getSdtKH() {
		return SdtKH;
	}
	public void setSdtKH(String SdtKH) {
		this.SdtKH = SdtKH;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String CMND) {
		this.CMND = CMND;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String DiaChi) {
		this.DiaChi = DiaChi;
	}
//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}

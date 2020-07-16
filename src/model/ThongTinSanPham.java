package model;

public class ThongTinSanPham {
	String MaThongTinSanPham;
	String MoTa1;
	String MoTa2;
	String HinhAnhChiTiet;
	public ThongTinSanPham(String MaThongTinSanPham, String MoTa1, String MoTa2, String HinhAnhChiTiet) {
		super();
		this.MaThongTinSanPham = MaThongTinSanPham;
		this.MoTa1 = MoTa1;
		this.MoTa2 = MoTa2;
		this.HinhAnhChiTiet = HinhAnhChiTiet;
	}
	public String getMaThongTinSanPham() {
		return MaThongTinSanPham;
	}
	public void setMaThongTinSanPham(String MaThongTinSanPham) {
		this.MaThongTinSanPham = MaThongTinSanPham;
	}
	public String getMoTa1() {
		return MoTa1;
	}
	public void setMoTa1(String MoTa1) {
		this.MoTa1 = MoTa1;
	}
	public String getMoTa2() {
		return MoTa2;
	}
	public void setMoTa2(String MoTa2) {
		this.MoTa2 = MoTa2;
	}
	public String getHinhAnhChiTiet() {
		return HinhAnhChiTiet;
	}
	public void setHinhAnhChiTiet(String HinhAnhChiTiet) {
		this.HinhAnhChiTiet = HinhAnhChiTiet;
	}
//	@Override
//	public String toString() {
//		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", producerID="
//				+ producerID + ", img=" + img + "]";
//	}
	
}

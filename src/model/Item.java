package model;
import model.SanPham;

public class Item {
	private SanPham sanpham;
	private int quantity;
	public Item(SanPham sanpham, int quantity) {
		super();
		this.sanpham = sanpham;
		this.quantity = quantity;
	}
	public SanPham getSanPham() {
		return sanpham;
	}
	public void setSanPham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

package model;

import java.util.List;

public class CartObject {
	private List<Item> items;
	private int sum;
	public CartObject(List<Item> items, int sum) {
		super();
		this.items = items;
		this.sum = sum;
	}
	public List<Item> getListItem() {
		return items;
	}
	public void setListItem(List<Item> items) {
		this.items = items;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}

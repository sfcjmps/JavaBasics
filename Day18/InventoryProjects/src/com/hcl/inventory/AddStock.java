package com.hcl.inventory;

public class AddStock {
	private String itemName;
	private int itemPrice;
	private int quantityAvail;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public String addStock() {
		Inventory obj = new Inventory();
		String stockid = InventoryBaL.generateStockIdBal();
		obj.setStockId(stockid);
		obj.setItemName(itemName);
		obj.setPrice(itemPrice);
		obj.setQuantityAvail(quantityAvail);
		return InventoryBaL.addStockBal(obj);
	}
}

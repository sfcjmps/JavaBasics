package com.hcl.inventory;

public class PlaceOrder {
	private String stockId;
	private int orderQuantity;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String placeOrder() {
		return InventoryBaL.placeOrderBal(stockId, orderQuantity);
	}
}

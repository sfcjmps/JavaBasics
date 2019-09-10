package com.hcl.inventory;

public class SearchStock {
	private String stockId;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public Inventory searchStock() {
		return InventoryBaL.searchStockBal(stockId);
	}

}

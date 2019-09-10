package com.hcl.inventorystock;

public class InventoryBaL {
	
  public static String placeOrderBal(String stockId,int orderQty) {
    return new InventoryDaO().placeOrderDao(stockId, orderQty);
  }

  public static int generateOrderId() {
    return new InventoryDaO().generateOrderId();
  }

  public static Inventory searchStockBal(String stockId) {
    return new InventoryDaO().searchStockDao(stockId);
  }

  public static String addStockBal(Inventory objStock) {
    return new InventoryDaO().addStockIdDao(objStock);
  }

  public static String generateStockIdBal() {
    return new InventoryDaO().generateStockIdDao();
  }
}

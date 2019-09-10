package com.hcl.inventorystock;

import java.util.Scanner;

public class SearchStockMain {
  /**
   * Searching Stock.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    String stockId;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter StockId : ");
    stockId = sc.nextLine();
    Inventory objStock = InventoryBaL.searchStockBal(stockId);
    if (objStock != null) {
      System.out.println(objStock.getItemName());
      System.out.println(objStock.getPrice());
      System.out.println(objStock.getQuantityAvail());
    } else {
      System.out.println("Item Not Found..");
    }
  }
}

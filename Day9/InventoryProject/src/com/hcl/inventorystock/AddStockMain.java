package com.hcl.inventorystock;

import java.util.Scanner;

public class AddStockMain {
  /**
   * Adding Stock.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    String stockId = InventoryBaL.generateStockIdBal();
    Inventory objStock = new Inventory();
    Scanner sc = new Scanner(System.in);
    objStock.setStockId(stockId);
    System.out.println("Enter Item Name : ");
    objStock.setItemName(sc.nextLine());
    System.out.println("Enter Item Price : ");
    objStock.setPrice(Integer.parseInt(sc.nextLine()));
    System.out.println("Enter Item Quantity Available : ");
    objStock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
    System.out.println(InventoryBaL.addStockBal(objStock));
  }
}

package com.hcl.inventorystock;

import java.util.Scanner;

public class OrderMain {
  /**
   * Placing Order.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    String stockId;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Stock Id : ");
    stockId = sc.nextLine();
    System.out.println("Enter Order Quantity : ");
    int orderQty = Integer.parseInt(sc.nextLine());
    System.out.println(InventoryBaL.placeOrderBal(stockId, orderQty));
  }
}

package com.hcl.inventorystock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class InventoryDaO {
  Connection con;
  PreparedStatement pst;
  
  /**
   * Placing Order.
   * @param stockId for passing arguments.
   * @param orderQty for passing arguments.
   * @return order status.
   */
 
  public String placeOrderDao(String stockId,int orderQty) {
    con = DaoConnection.getConnection();
    Inventory objStock = searchStockDao(stockId);
    String result = " ";
    if (objStock != null) {
      int quantityAvail = objStock.getQuantityAvail();
      if (quantityAvail - orderQty >= 0) {
        int price = objStock.getPrice();
        int billAmt = price * orderQty;
        String cmd = "Insert into orders values(?,?,?,?)";
        try {
          InventoryDaO id = new InventoryDaO();
          int orderid = id.generateOrderId();
          pst = con.prepareStatement(cmd);
          pst.setInt(1, orderid);
          pst.setString(2, stockId);
          pst.setInt(3, orderQty);
          pst.setInt(4, billAmt);
          pst.executeUpdate();
          cmd = "update stock set quantityAvail = quantityAvail - ? where stockid = ?";
          pst = con.prepareStatement(cmd);
          pst.setInt(1, orderQty);
          pst.setString(2, stockId);
          pst.executeUpdate();
          cmd = "select gamt from amount";
          pst = con.prepareStatement(cmd);
          ResultSet rs = pst.executeQuery();
          rs.next();
          int gross = rs.getInt("gamt");
          cmd = "update amount set gamt = gamt + ?";
          pst = con.prepareStatement(cmd);
          pst.setInt(1, billAmt);
          pst.executeUpdate();
          result = "Order Placed";
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      } else {
    	  result = "Quantity not available";
      }
    } else {
    	result = "Item not available";
    }
    return result;
  }

  /**
   * Searching Stock.
   * @param stockId for passing arguments.
   * @return status of stock.
   */
 
  public Inventory searchStockDao(String stockId) {
    con = DaoConnection.getConnection();
    String cmd = "select * from stock where stockid = ?";
    Inventory objStock = null;
    try {
      pst = con.prepareStatement(cmd);
      pst.setString(1, stockId);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        objStock = new Inventory();
        objStock.setStockId(rs.getString("stockid"));
        objStock.setItemName(rs.getString("ItemName"));
        objStock.setPrice(rs.getInt("price"));
        objStock.setQuantityAvail(rs.getInt("quantityavail"));
      } 
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return objStock;
  }

  /**
   * Adding stock.
   * @param objStock for passing arguments.
   * @return status of stock.
   */

  public String addStockIdDao(Inventory objStock) {
    con = DaoConnection.getConnection();
    String result = " ";
    String cmd = "Insert into stock values(?,?,?,?)";
    try {
      pst = con.prepareStatement(cmd);
      pst.setString(1, objStock.getStockId());
      pst.setString(2, objStock.getItemName());
      pst.setInt(3, objStock.getPrice());
      pst.setInt(4, objStock.getQuantityAvail());
      pst.executeUpdate();
      result = "Stock Added...";
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return result;
  }

  /**
   * Generating stock id.
   * @return stock id.
   */
 
  public String generateStockIdDao() {
    con = DaoConnection.getConnection();
    String cmd = "select max(stockid) sid from stock";
    String stid = " ";
    try {
      pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      stid = rs.getString("sid");
      int id = Integer.parseInt(stid.substring(1));
      id++;
      String format = String.format("%03d", id);
      stid = "S" + format;
//      if (id >= 1 && id <= 9) {
//        stid = "S00" + id;
//      }
//      if (id >= 10 && id <= 99) {
//        stid = "S0" + id;
//      }
//      if (id >= 100 && id <= 999) {
//        stid = "S" + id;
//      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return stid;
  }

  /**
   * Generate order id.
   * @return order id.
   */

  public int generateOrderId() {
    int orderid = 0;
    con = DaoConnection.getConnection();
    String cmd = "select case when max(orderid) is null then 1 "
         + "else max(orderid) + 1 end orderid from orders";
    try {
      pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      orderid = rs.getInt("orderid");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return orderid;
  }
}

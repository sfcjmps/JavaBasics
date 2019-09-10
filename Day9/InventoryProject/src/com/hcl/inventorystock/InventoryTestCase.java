package com.hcl.inventorystock;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestCase {

  @Test
  public void testgettersAndSetters() {
    Inventory obj = new Inventory();
    obj.setStockId("S005");
    obj.setItemName("iphonexs");
    obj.setQuantityAvail(50);
    obj.setPrice(100000);

    assertEquals("S005",obj.getStockId());
    assertEquals("iphonexs",obj.getItemName());
    assertEquals(50,obj.getQuantityAvail());
    assertEquals(100000,obj.getPrice());
  }

  @Test
  public void testGenerateStockId() {
    String stid = " ";
    Connection con = DaoConnection.getConnection();
    String cmd = "select max(stockid) sid from stock";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      stid = rs.getString("sid");
      int id = Integer.parseInt(stid.substring(1));
      id++;
      String format = String.format("%03d", id);
      stid = "S" + format;
      //if (id >=1 && id <= 9) {
      //  stid = "S00" + id;
      //}
      //if (id >= 10 && id <= 99) {
      //  stid = "S0" + id;
      //}
      //if (id >= 100 && id <= 999) {
      //  stid = "S" + id;
      //}
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertEquals(stid,InventoryBaL.generateStockIdBal());
  }

  @Test
  public void testConnection() {
    assertNotNull(DaoConnection.getConnection());
  }

  @Test
  public void testAddStock() {
    Inventory st = new Inventory();
    String stid = InventoryBaL.generateStockIdBal();
    st.setStockId(stid);
    st.setItemName("iphone x");
    st.setPrice(1000000);
    st.setQuantityAvail(50);
    assertEquals("Stock Added...",InventoryBaL.addStockBal(st));
  }

  @Test
  public void testSearchStock() {
    assertNotNull(InventoryBaL.searchStockBal("S001"));
    assertNull(InventoryBaL.searchStockBal("T010"));
  }

  @Test
  public void testGenerateOrderId() {
    int orderid = 0;
    Connection con = DaoConnection.getConnection();
    String cmd = "Select max(orderid)+1 ordid from orders";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      orderid = rs.getInt("ordid");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertEquals(orderid,InventoryBaL.generateOrderId());
  }

  @Test
  public void testPlaceOrder() {
    assertEquals("Order Placed",InventoryBaL.placeOrderBal("S001", 1));
    assertEquals("Item not available",InventoryBaL.placeOrderBal("S100", 10));
    assertEquals("Quantity not available",InventoryBaL.placeOrderBal("S001", 10000));
  }
}

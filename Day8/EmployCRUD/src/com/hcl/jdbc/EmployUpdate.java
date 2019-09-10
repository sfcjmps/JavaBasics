package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
  /**
   * Updating Employ Details.
   * @param args for passing Arguments.
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int empno;
    System.out.println("Enter Employ No : ");
    empno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Employ Designation : ");
    String desig = sc.nextLine();
    System.out.println("Enter Employ salary");
    int basic = Integer.parseInt(sc.nextLine());
    String cmd = "update Employ set Desig = ? , Basic = ? where empno = ?";
    Connection con = DaoConnection.getConnection();
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setString(1, desig);
      pst.setInt(2, basic);
      pst.setInt(3, empno);
      pst.executeUpdate();
      System.out.println("Record updated successfully....");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

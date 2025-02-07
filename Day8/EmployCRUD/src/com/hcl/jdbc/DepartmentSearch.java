package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentSearch {
  /**
   * Searching Department details.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    int deptno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr Department No : ");
    deptno = sc.nextInt();
    Connection con = DaoConnection.getConnection();
    String cmd = "Select * from Department where deptno = ?";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, deptno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Department Name : " + rs.getString("dname"));
        System.out.println("Location : " + rs.getString("loc"));
        System.out.println("Head : " + rs.getString("head"));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

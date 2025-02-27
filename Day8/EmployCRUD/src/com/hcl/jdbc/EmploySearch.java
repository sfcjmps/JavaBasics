package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
  /**
   * Searching Employ.
   * @param args for passing Arguments.
   */

  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr Employ No : ");
    empno = sc.nextInt();
    Connection con = DaoConnection.getConnection();
    String cmd = "Select * from Employ where empno = ?";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, empno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Name : " + rs.getString("name"));
        System.out.println("dept : " + rs.getString("dept"));
        System.out.println("Desig : " + rs.getString("desig"));
        System.out.println("salary : " + rs.getInt("basic"));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

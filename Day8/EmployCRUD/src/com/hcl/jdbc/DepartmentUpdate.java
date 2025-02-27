package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
  /**
   * Updating department details.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int deptno;
    System.out.println("Enter Department No : ");
    deptno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Department Location : ");
    String loc = sc.nextLine();
    System.out.println("Department Name : ");
    String dname = sc.nextLine();
    String cmd = "update Department set loc = ? , dname = ? where deptno = ?";
    Connection con = DaoConnection.getConnection();
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setString(1, loc);
      pst.setString(2, dname);
      pst.setInt(3, deptno);
      pst.executeUpdate();
      System.out.println("Record updated successfully....");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

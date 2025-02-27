package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {
  /**
   * Inserting Employ details.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ No : ");
    empno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Employ Name : ");
    String name = sc.nextLine();
    System.out.println("Enter Employ department : ");
    String dept = sc.nextLine();
    System.out.println("Enter Employ Designation : ");
    String desig = sc.nextLine();
    System.out.println("Enter Employ Salary : ");
    int basic = Integer.parseInt(sc.nextLine());
    String cmd = "insert into Employ values(?,?,?,?,?)";
    Connection con = DaoConnection.getConnection();
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, empno);
      pst.setString(2, name);
      pst.setString(3, dept);
      pst.setString(4, desig);
      pst.setInt(5, basic);
      pst.executeUpdate();
      System.out.println("Record inserted....");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

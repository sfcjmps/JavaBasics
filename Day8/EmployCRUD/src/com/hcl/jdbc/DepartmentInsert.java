package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentInsert {
  /**
   * Inserting drepartment details.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Depatment No : ");
    int deptno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Department Name : ");
    String dname = sc.nextLine();
    System.out.println("Enter department location : ");
    String loc = sc.nextLine();
    System.out.println("Enter Designation Head : ");
    String head = sc.nextLine();
    String cmd = "insert into department values(?,?,?,?)";
    Connection con = DaoConnection.getConnection();
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, deptno);
      pst.setString(2, dname);
      pst.setString(3, loc);
      pst.setString(4, head);
      pst.executeUpdate();
      System.out.println("Record inserted....");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

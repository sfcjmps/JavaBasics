package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
  /**
   * Searching Employ.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    int empno;
    System.out.println("Enter Emp no : ");
    Scanner sc = new Scanner(System.in);
    empno = sc.nextInt();
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
           "root","root");
      String cmd = "select * from emp where empno = ?";
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, empno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Employ name " + rs.getString("ename"));
        System.out.println("Employ job " + rs.getString("job"));
        System.out.println("Employ mgr " + rs.getInt("mgr"));
        System.out.println("Employ hiredate " + rs.getDate("hiredate"));
        System.out.println("Employ salary " + rs.getInt("sal"));
        System.out.println("Employ comm " + rs.getInt("comm"));
      } else {
        System.out.println("Employ not found...");
      }
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

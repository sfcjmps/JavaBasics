package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmploySearch {
  /**
   * Searching for Employ Details.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    int empno;
    System.out.println("Enter Employ no : ");
    Scanner sc = new Scanner(System.in);
    empno = sc.nextInt();
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
          "root","root");
      String cmd = "select * from employ where empno = ?";
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1, empno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Employ name " + rs.getString("name"));
        System.out.println("Employ department " + rs.getString("dept"));
        System.out.println("Employ Desination " + rs.getString("desig"));
        System.out.println("Employ salary " + rs.getInt("basic"));
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

package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
  /**
   * connection from java program to data base.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = 
          DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
      //System.out.println("Connected");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from employ");
      while (rs.next()) {
        System.out.println("Employ no " + rs.getInt("empno"));
        System.out.println("Employ name is : " + rs.getString("name"));
        System.out.println("Employ department is : " + rs.getString("dept"));
        System.out.println("Employ designation is : " + rs.getString("desig"));
        System.out.println("Employ basic is " + rs.getInt("basic"));
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

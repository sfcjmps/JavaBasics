package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
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
      ResultSet rs = st.executeQuery("select * from emp");
      while (rs.next()) {
        System.out.println("Employ no " + rs.getInt("empno"));
        System.out.println("Employ name is : " + rs.getString("ename"));
        System.out.println("Employ job is : " + rs.getString("job"));
        System.out.println("Employ mgr is : " + rs.getInt("mgr"));
        System.out.println("Employ hiredate is : " + rs.getDate("hiredate"));
        System.out.println("Employ salary is : " + rs.getInt("sal"));
        System.out.println("Employ comm is : " + rs.getInt("comm"));
        System.out.println("Employ department is : " + rs.getInt("deptno"));
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


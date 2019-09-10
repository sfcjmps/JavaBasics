package com.hcl.java;

public class Attendance {
  /**
   * Attendance.
   * @param ob for passing arguments.
   */
  public static void display(Object...ob) {
    for (Object object : ob) {
      System.out.println(object + " ");
    }
  }
  /**
   * Attendance.
   * @param name for passing arguments.
   */
  
  public static void show(String...name) {
    for (String s:name) {
      System.out.print(s + ",");
    }
    System.out.println();
  }
  /**
   * Attendance.
   */
  
  public static void main(String[] args) {
    show();
    show("vishalakshi","prem");
    show("vishlakshi","prem","praveen","janani","jahan");
    show("rishab","satya","sai kumar");
    display();
    display("ram",12,true,12.5);
  }
}

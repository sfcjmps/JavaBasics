package com.hcl.java;

public class Enum3 {
  /**
   * enumerations.
   */
  public static void show() {
    Student[] arrStudent = Student.values();
    for (Student student:arrStudent) {
      System.out.println(student);
    }
  }
  /**
   * enumerations.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    show();
  }
}

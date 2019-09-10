package com.hcl.ast;

import java.io.Serializable;

public class Student implements Serializable {
  int sno;
  String name;
  String city;
  transient double cgp;
  /**
   * student details.
   * @param sno for passing arguments.
   * @param name for passing arguments.
   * @param city for passing arguments.
   * @param cgp for passing arguments.
   */

  public Student(int sno, String name, String city, double cgp) {
    super();
    this.sno = sno;
    this.name = name;
    this.city = city;
    this.cgp = cgp;
  }

  @Override
  public String toString() {
    return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
  }
}

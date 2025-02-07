package com.hcl.ast;

import java.io.Serializable;

public class Employ implements Serializable {
  int empno;
  String name;
  transient double basic;
  
  /**
   * data of employ.
   * @param empno for passing arguments.
   * @param name for passing arguments.
   * @param basic for passing arguments.
   */
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}

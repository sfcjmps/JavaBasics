package com.hcl.collections;

public class Employ {
  int empno;
  String name;
  double basic;
  /**
   * Sorting employ.
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

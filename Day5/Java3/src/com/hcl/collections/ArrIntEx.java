package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
  /**
   * list interface.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    List num = new ArrayList();
    num.add(new Integer(44));
    num.add(new Integer(45));
    num.add(new Integer(46));
    num.add(new Integer(49));
    num.add(new Integer(69));
    num.add(new Integer(58));
    int sum = 0;
    for (Object object : num) {
      sum += (Integer)object;
    }
    System.out.println("sum is " + sum);
  }
}

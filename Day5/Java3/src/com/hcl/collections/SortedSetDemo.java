package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  /**
   * Sorted set.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add("sai");
    s.add("yash");
    s.add("Kumar");
    s.add("laksh");
    s.add("uttam");
    s.add("aneesh");
    System.out.println("sorted order is : ");//ASCII value order.
    s.forEach(System.out::println);
  }
}

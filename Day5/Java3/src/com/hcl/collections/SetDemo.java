package com.hcl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
  /**
   * hash set.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Set s = new HashSet();
    s.add("vinod");
    s.add("Hema");
    s.add("sai");
    s.add("yash");
    s.add("laksh");

    s.add("vinod");
    s.add("Hema");
    s.add("sai");
    s.add("yash");
    s.add("sai");
    s.add("yash");
    s.add("laksh");

    s.add("vinod");
    s.add("Hema");
    s.add("sai");
    s.add("yash");
    s.add("laksh");
    s.add("yash");

    s.add("vinod");
    s.add("Hema");
    s.add("sai");
    s.add("yash");
    s.add("laksh");
    System.out.println("Hashset data");
    s.forEach(System.out::println);
  }
}

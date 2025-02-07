package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
  /**
   * Sorted set of employee using comparator.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Comparator<Employ> c = new NameComparator();
    Set<Employ> setEmploy = new TreeSet<Employ>(c);
    setEmploy.add(new Employ(1,"Divya",56986));
    setEmploy.add(new Employ(2,"Laksh",54639));
    setEmploy.add(new Employ(3,"Vinod",85693));
    setEmploy.add(new Employ(4,"Prem",45369));
    setEmploy.add(new Employ(5,"Raghu",65398));
    setEmploy.add(new Employ(6,"Hema",36589));
    System.out.println("Empoy list is : ");
    setEmploy.forEach(System.out::println);
  }
}

package com.hcl.collections;

public class SwapDemo {
  /**
   * Swapping of two integers using generics.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Data obj = new  Data();
    int x;
    int y;
    x = 12;
    y = 13;
    obj.swap(x,y);
    double b1 = 12.5;
    double b2 = 55.87;
    obj.swap(b1, b2);
    String s1 = "Hello";
    String s2 = "World";
    obj.swap(s1, s2);
    boolean f1 = true;
    boolean f2 = false;
    obj.swap(f1,f2);
  }
}

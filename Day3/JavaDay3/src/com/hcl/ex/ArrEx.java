package com.hcl.ex;

public class ArrEx {
  /**
   * Array Exceptions.
   * @param args for passing.
   */
  public static void main(String[] args) {
    try {
      int[] a = new int[]{12,5};
      a[10] = 77;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array size is small");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

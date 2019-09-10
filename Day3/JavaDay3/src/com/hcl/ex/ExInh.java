package com.hcl.ex;

public class ExInh {
  /**
   * Inheritance Exception.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    First ob1 = new First();
    try {
      Second ob2 = (Second)ob1;
      ob2.show();
    } catch (ClassCastException e) {
      System.out.println("class casting not possible");
    } catch (Exception e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

package com.hcl.java;

public class CToF {
  public void calc(double c){
    double f;
    f = ((9 * c) / 5) + 32;
    System.out.println("Fahrenheit Value " + f);
  }
  
  public static void main(String[] args) {
    double c = 37;
    CToF obj = new CToF();
    obj.calc(c);
  }
}

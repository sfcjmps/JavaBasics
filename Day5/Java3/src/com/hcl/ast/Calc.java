package com.hcl.ast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
  /**
   * Buffered reader.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("enter first no : ");
      a = Integer.parseInt(br.readLine());
      System.out.println("enter second no :");
      b = Integer.parseInt(br.readLine());
      c = a + b;
      System.out.println("sum is : " + c);
    } catch (NumberFormatException | IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

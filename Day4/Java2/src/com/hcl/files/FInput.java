package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
  /**
   * File input.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("D:/hcljava/Day4/Java2/src/com/hcl/ex/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) {
        System.out.print((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

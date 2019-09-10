package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
  /**
   * file output.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("D:/hcljava/Day4/Java2/src/com/hcl/ex/Custom.java");
      tar = new FileOutputStream("C:/files/Cus.java");
      int ch;
      while ((ch = src.read()) != -1) {
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("File Copied");
    } catch (FileNotFoundException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

package com.hcl.ast;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  /**
   * Data input stream.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      DataInputStream din = new DataInputStream(new FileInputStream("c:/files/data.txt"));
      int x = din.readInt();
      x++;
      System.out.println("X value is " + x);
      String name = din.readUTF();
      System.out.println("name is " + name);
      double bas = din.readDouble();
      System.out.println("basic is " + bas);
      boolean flag = din.readBoolean();
      System.out.println("flag" + flag);
      din.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block 
      e.printStackTrace();
    }
  }
}

package com.hcl.ast;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
  /**
   * Data output stream.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      DataOutputStream dout = new DataOutputStream(new FileOutputStream("c:/files/data.txt"));
      dout.writeInt(15);
      //dout.writeInt(12);
      dout.writeUTF("Hcl");
      dout.writeDouble(5664565.56);
      dout.writeBoolean(true);
      dout.close();
      System.out.println("file created");
    } catch (FileNotFoundException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

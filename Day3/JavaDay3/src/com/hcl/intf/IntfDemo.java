package com.hcl.intf;

public class IntfDemo {
  /**
   * student details.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    ITraining[] arr = new ITraining[] {
      new Hema(),
      new Keerthana()
    };
    for (ITraining t : arr) {
      t.name();
      t.email();
    }
  }
}

package com.hcl.intf;

class Test implements IOne,ITwo {
  @Override
  public void email() {
    System.out.println("hcl@gmail.com");
  }

  @Override
  public void name() {
    System.out.println("company hcl...");
  }
}
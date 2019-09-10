package com.hcl.intf;

class Demo implements IFirst,ISecond,IThird {
  @Override
  public void name() {
    IFirst.super.name();
    ISecond.super.name();
    IThird.super.name();
  }
}
package com.hcl.intf;

interface IThird {
  default void name() {
    System.out.println("Name from IThird...");
  }
}
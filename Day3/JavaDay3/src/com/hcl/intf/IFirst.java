package com.hcl.intf;

interface IFirst {
  default void name() {
    System.out.println("Name is IFirst...");
  }
}
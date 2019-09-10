package com.hcl.intf;

interface ISecond {
  default void name() {
    System.out.println("Name from ISecond...");
  }
}
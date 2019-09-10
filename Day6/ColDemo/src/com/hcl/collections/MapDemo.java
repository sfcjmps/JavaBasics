package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  /**
   * Mapping interface.
   * @param args for passing arguments.
   */

  public static void main(String[] args) {
    Map m = new HashMap();
    m.put("Priya", "Darshni");
    m.put("Laksh", "Laksh");
    m.put("Rishab", "Hcl");
    m.put("Kiruba", "Lakshmi");

    String key = "Rishab";
    String value = (String)m.getOrDefault(key,"Not Found");
    System.out.println(value);
  }
}

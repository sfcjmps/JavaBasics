package com.hcl.collections;

public class Student {
  String firstname;
  String lastname;
  String city;
  double cgp;
  /**
   * Student details.
   * @param firstname for passing arguments.
   * @param lastname for passing arguments.
   * @param city for passing arguments.
   * @param cgp for passing arguments.
   */
  
  public Student(String firstname, String lastname, String city, double cgp) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.city = city;
    this.cgp = cgp;
  }

  @Override
  public String toString() {
    return "Student [firstname=" + firstname + ", lastname=" + lastname + ", "
      + "city=" + city + ", cgp=" + cgp + "]";
  }
}

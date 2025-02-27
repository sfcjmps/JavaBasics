package com.hcl.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
  static ResourceBundle rb = ResourceBundle.getBundle("project");
  
  /**
   * adding customer details.
   */
  
  public static void addCustomer() {
    Customer objCustomer = new Customer();
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter Customer Id : ");
    System.out.println(rb.getString("custid"));
    objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
    //System.out.println("Enter Customer Name : ");
    System.out.println(rb.getString("custnm"));
    objCustomer.setCustName(sc.nextLine());
    //System.out.println("Enter Customer Annual Premium : ");
    System.out.println(rb.getString("custap"));
    objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
    //System.out.println("Enter Customer Modal Premium");
    System.out.println(rb.getString("custmp"));
    objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
    //System.out.println("Enter Customer PaymentMode");
    System.out.println(rb.getString("custpm"));
    objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
    CustomerBaL customer = new CustomerBaL();
    try {
      boolean res = customer.addCustomerBal(objCustomer);
      if (res == true) {
        //System.out.println("Customer added");
        System.out.println(rb.getString("add"));
      }
    } catch (CustomerException e) {
      System.out.println(e.getMessage());
    }
  }
  
  /**
   * Showing customer details.
   */
  
  public static void showCustomer() {
    CustomerBaL obj = new CustomerBaL();
    List<Customer> lstcustomer = obj.showCustomerBal();
    for (Customer customer : lstcustomer) {
      System.out.println(customer);
    }
  }
  
  /**
   * searching customer details.
   */
  
  public static void searchCustomer() {
    int id;
    //System.out.println("Enter Customer id : ");
    System.out.println(rb.getString("custid"));
    Scanner sc = new Scanner(System.in);
    id = sc.nextInt();
    CustomerBaL obj1 = new CustomerBaL();
    Customer customer = obj1.searchCustomerBal(id);
    if (customer != null) {
      System.out.println(customer);
    } else {
      //System.out.println("Customer not found");
      System.out.println(rb.getString("nocst"));
    }
  }

  /**
   * updating customer details.
   */
  
  public static void updateCustomer() {
    Customer customer = new Customer();
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter Customer Id : ");
    System.out.println(rb.getString("custid"));
    customer.setCustId(Integer.parseInt(sc.nextLine()));
    //System.out.println("Enter Customer Name");
    System.out.println(rb.getString("custnm"));
    customer.setCustName(sc.nextLine());
    //System.out.println("Enter Customer Annual Premium : ");
    System.out.println(rb.getString("custap"));
    customer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
    //System.out.println("Enter Customer Modal Premium : ");
    System.out.println(rb.getString("custmp"));
    customer.setModalPremium(Double.parseDouble(sc.nextLine()));
    //System.out.println("Enter Customer Payment Mode : ");
    System.out.println(rb.getString("custpm"));
    customer.setPaymentMode(Integer.parseInt(sc.nextLine()));
    CustomerBaL obj = new CustomerBaL();
    String res = obj.updateCustomerBal(customer);
    System.out.println(res);
  }

  /**
   * deleting customer details.
   */
  
  public static void deleteCustomer() {
    int sno;
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter Customer Id : ");
    System.out.println(rb.getString("custid"));
    sno = sc.nextInt();
    CustomerBaL obj = new CustomerBaL();
    String res = obj.deleteCustomerBal(sno);
    System.out.println(res);
  }

  public static void writeCustomer() {
    new CustomerBaL().writeCustomerFileBal();
  }

  public static void readCustomer() {
    new CustomerBaL().readCustomerFileBal();
  }

  /**
   * main method.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    int no;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Options are : ");
      System.out.println("1 : Adding Customer");
      System.out.println("2 : Showing Customer");
      System.out.println("3 : Searching Customer");
      System.out.println("4 : Updating Customer");
      System.out.println("5 : Deleting Customer");
      System.out.println("6 : Storing Customer");
      System.out.println("7 : Reading Customer");
      System.out.println("8 : EXIT");
      //System.out.println("Enter your choice : ");
      System.out.println(rb.getString("choice"));
      no = sc.nextInt();
      switch (no) {
        case 1 :
          addCustomer();
          break;
        case 2 :
          showCustomer();
          break;
        case 3 :
          searchCustomer();
          break;
        case 4 :
          updateCustomer();
          break;
        case 5 : 
          deleteCustomer();
          break;
        case 6 :
          writeCustomer();
          break;
        case 7 : 
          readCustomer();
          break;
        case 8 :
          return;
        default :
          //System.out.println("Invalid choice");
          System.out.println(rb.getString("invalid"));
      }
    } while (no != 9);
  }
}

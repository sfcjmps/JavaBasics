package com.hcl.project1;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerDaO {
  static ResourceBundle rb = ResourceBundle.getBundle("project");
  static List<Customer> lst = null;
  
  static {
    lst = new ArrayList<Customer>();
  }

  /**
   * adding customer details.
   * @param customer for getting deatils.
   * @return customer details.
   */
  
  public String addCustomerDao(Customer customer) {
    lst.add(customer);
    //return "customer added successfully";
    return rb.getString("add");
  }

  public List<Customer> showCustomerDao() {
    return lst;
  }

  /**
   * searching customer.
   * @param custId for searching.
   * @return customer details.
   */
  
  public Customer searchCustomerDao(int custId) {
    Customer objcustomer = null;
    for (Customer customer : lst) {
      if (customer.getCustId() == custId) {
        objcustomer = customer;
      }
    }
    return objcustomer;
  }

  /**
   * deleting customer.
   * @param custId for searching customer.
   * @return string.
   */
  
  public String deleteCustomerDao(int custId) {
    Customer customer = searchCustomerDao(custId);
    if (customer != null) {
      lst.remove(customer);
      //return "customer removed";
      return rb.getString("rcst");
    } else {
      //return "customer not found";
      return rb.getString("nocst");
    }
  }

  /**
   * updating customer.
   * @param objcustomer for updating.
   * @return string.
   */
  
  public String updateCustomerDao(Customer objcustomer) {
    Customer customer = searchCustomerDao(objcustomer.getCustId());
    if (customer != null) {
      for (Customer c : lst) {
        if (c.getCustId() == customer.getCustId()) {
          c.setCustId(objcustomer.getCustId());
          c.setCustName(objcustomer.getCustName());
          c.setAnnualPremium(objcustomer.getAnnualPremium());
          c.setModalPremium(objcustomer.getModalPremium());
          c.setPaymentMode(objcustomer.getPaymentMode());
        }
      }
      //return "Customer details updated";
      return rb.getString("updt");
    } else {
      //return "Customer not found";
      return rb.getString("nocst");
    }
  }

  /**
   * for storing customer details in a file.
   */
  
  public void writeCustomerFileDao() {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/customer.txt");
      ObjectOutputStream obj = new ObjectOutputStream(fout);
      obj.writeObject(lst);
      obj.close();
      fout.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * for reading customer details from file.
   */
  
  public void readCustomerFileDao() {
    try {
      FileInputStream fin = new FileInputStream("c:/files/customer.txt");
      ObjectInputStream obj = new ObjectInputStream(fin);
      lst = (List<Customer>)obj.readObject();
      obj.close();
      fin.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

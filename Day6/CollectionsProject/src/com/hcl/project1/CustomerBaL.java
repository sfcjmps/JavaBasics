package com.hcl.project1;

import java.util.List;

public class CustomerBaL {
  static StringBuilder sb = new StringBuilder();
  /**
   * Exceptions for adding customers.
   * @param objcustomer for passing argumrnts.
   * @return to dao layer.
   * @throws CustomerException for exceptions.
   */
  
  public boolean addCustomerBal(Customer objcustomer) throws CustomerException {
    boolean isadded = true;
    if (objcustomer.getCustId() < 0) {
      sb.append("customer id should not be negative \r\n");
      isadded = false;
    }
    if (objcustomer.getCustName().length() < 5) {
      sb.append("customer name requires minium 5 characters \r\n");
      isadded = false;
    }
    if (objcustomer.getAnnualPremium() < 20000) {
      sb.append("annual premium  is less than 20000 \r\n");
      isadded = false;
    }
    if (objcustomer.getAnnualPremium() > 1000000) {
      sb.append("annual premium is greater than 1000000 \r\n");
      isadded = false;
    }
    if (objcustomer.getModalPremium() < 1000) {
      sb.append("modal premium is less than 1000 \r\n");
      isadded = false;
    }
    if (objcustomer.getModalPremium() > 50000) {
      sb.append("Modal premim is greater than 50000 \r\n");
      isadded = false;
    }
    if (objcustomer.getPaymentMode() < 0) {
      sb.append("wrong payment mode \r\n");
      isadded = false;
    }
    if (objcustomer.getPaymentMode() > 3) {
      sb.append("wrong payment mode \r\n");
      isadded = false;
    }
    if (isadded == false) {
      throw new CustomerException(sb.toString());
    } else {
      new CustomerDaO().addCustomerDao(objcustomer);
    }
    return isadded;
  }
 
  public List<Customer> showCustomerBal() {
    return new CustomerDaO().showCustomerDao();
  }

  public Customer searchCustomerBal(int custId) {
    return new CustomerDaO().searchCustomerDao(custId);
  }

  public String deleteCustomerBal(int custId) {
    return new CustomerDaO().deleteCustomerDao(custId);
  }

  public String updateCustomerBal(Customer objcustomer) {
    return new CustomerDaO().updateCustomerDao(objcustomer);
  }

  public void writeCustomerFileBal() {
    new CustomerDaO().writeCustomerFileDao();
  }

  public void readCustomerFileBal() {
    new CustomerDaO().readCustomerFileDao();
  }
}

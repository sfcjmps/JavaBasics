package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testgenerateAccountNo() {
		int accno = 0;
		Connection con =DaoConnection.getConnection();
		String cmd = "Select max(accountNo)+1 accno from Accounts";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno,AccountBaL.generateAccountBal());
	}

	@Test
	public void testGettersAndSetters() {
		Accounts objAccounts = new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Sai");
		objAccounts.setLastName("Krishna");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("KA");
		objAccounts.setAmount(85685);
		objAccounts.setCheqFacil("Yes");
		objAccounts.setAccountType("Savings");
		objAccounts.setStatus("Active");
		
		assertEquals(1,objAccounts.getAccountNo());
		assertEquals("Sai",objAccounts.getFirstName());
		assertEquals("Krishna",objAccounts.getLastName());
		assertEquals("Bangalore",objAccounts.getCity());
		assertEquals("KA",objAccounts.getState());
		assertEquals(85685,objAccounts.getAmount());
		assertEquals("Yes",objAccounts.getCheqFacil());
		assertEquals("Savings",objAccounts.getAccountType());
		assertEquals("Active",objAccounts.getStatus());
	}

	@Test
	public void testCreateAccount() {
		Accounts objAccounts = new Accounts();
		int accno = AccountBaL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Bindhu");
		objAccounts.setLastName("Sree");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("KA");
		objAccounts.setAmount(99222);
		objAccounts.setCheqFacil("Yes");
		objAccounts.setAccountType("Savings");
		assertEquals("Account Created successfully",AccountBaL.createAccountsBal(objAccounts));
	}
	
	@Test
	public void testSearchAccount() {
		assertNotNull(AccountBaL.searchAccountsBal(1));
		assertNull(AccountBaL.searchAccountsBal(-1));
	}
	
	@Test
	public void testUpdateAccount() {
		assertEquals("Account Details Updated Successfully..",AccountBaL.updateAccountBal(1, "Chennai", "TN"));
		assertEquals("Account No Not Found...",AccountBaL.updateAccountBal(-2, "Chennai", "TN"));
		assertEquals("Account Closed Already...",AccountBaL.updateAccountBal(2, "Chennai", "TN"));
	}
	
	@Test
	public void testCloseAccount() {
		assertEquals("Account Closed..",AccountBaL.deleteAcountBal(4));
		assertEquals("Account Not Found...",AccountBaL.deleteAcountBal(-4));
	}
	
	@Test
	public void testDepositAccount() {
		assertEquals("Amount Credited Successfully....",AccountBaL.depositAccountBal(3, 10000));
		assertEquals("Account Not Found...",AccountBaL.depositAccountBal(-3, 3000));
		assertEquals("Account Already Closed...",AccountBaL.depositAccountBal(2, 3));
	}
	
	@Test
	public void testWithDrawAmount() {
		assertEquals("Amount Debited Successfully...",AccountBaL.withdrawAccountBal(5, 1000));
		assertEquals("Insufficient Funds...",AccountBaL.withdrawAccountBal(5, 100000000));
		assertEquals("Account Not Found...",AccountBaL.withdrawAccountBal(-3, 2000));
		assertEquals("Account Already Closed...",AccountBaL.withdrawAccountBal(2, 2000));
	}
}

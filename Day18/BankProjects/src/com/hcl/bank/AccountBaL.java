package com.hcl.bank;

public class AccountBaL {
	public static String withdrawAccountBal(int accountNo , int withDrawAmount) {
		return new AccountDaO().withdrawAmountDao(accountNo, withDrawAmount);
	}
	
	public static String depositAccountBal(int accountNo , int deptAmount) {
		return new AccountDaO().depositAccountDao(accountNo, deptAmount);
	}
	
	public static String deleteAcountBal(int accountNo) {
		return new AccountDaO().closeAccountDao(accountNo);
	}
	
	public static String updateAccountBal(int accountNo , String city , String state) {
		return new AccountDaO().updateAccountDao(accountNo, city, state);
	}
	
	public static Accounts searchAccountsBal(int accountNo) {
		return new AccountDaO().searchAccountsDao(accountNo);
	}
	
	public static String createAccountsBal(Accounts objAccounts) {
		return new AccountDaO().createAccountsDao(objAccounts);
	}
	
	public static int generateAccountBal(){
		return new AccountDaO().generateAccountNoDao();
	}

}

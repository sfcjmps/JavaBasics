package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter Account Number : ");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		Accounts objAccounts = AccountBaL.searchAccountsBal(accountNo);
		if (objAccounts != null) {
			System.out.println("First Name : " + objAccounts.getFirstName());
			System.out.println("Last Name : " + objAccounts.getLastName());
			System.out.println("City is : " + objAccounts.getCity());
			System.out.println("State is : " + objAccounts.getState());
			System.out.println("Amount is : " + objAccounts.getAmount());
			System.out.println("CheqFacility is : " + objAccounts.getCheqFacil());
			System.out.println("Account Type is : " + objAccounts.getAccountType());
		} else {
			System.out.println("Account Details Not Found....");
		}
	}

}

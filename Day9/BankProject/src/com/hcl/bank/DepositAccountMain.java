package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo;
		int depositAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount : ");
		depositAmount = sc.nextInt();
		System.out.println(AccountBaL.depositAccountBal(accountNo, depositAmount));
	}
}

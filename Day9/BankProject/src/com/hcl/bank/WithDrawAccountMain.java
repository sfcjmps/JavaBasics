package com.hcl.bank;

import java.util.Scanner;

public class WithDrawAccountMain {
	public static void main(String[] args) {
		int accountNo;
		int withDrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No : ");
		accountNo = sc.nextInt();
		System.out.println("Enter WithDrawAmount : ");
		withDrawAmount = sc.nextInt();
		System.out.println(AccountBaL.withdrawAccountBal(accountNo, withDrawAmount));
	}

}

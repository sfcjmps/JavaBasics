package com.hcl.bank;

import java.util.Scanner;

public class DeleteAccountMain {
	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter AccountNO : ");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		System.out.println(AccountBaL.deleteAcountBal(accountNo));
	}
}

package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
	public static void main(String[] args) {
		int accountNo;
		String city;
		String state;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No : ");
		accountNo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter City :");
		city = sc.nextLine();
		System.out.println("Enter State : ");
		state = sc.nextLine();
		System.out.println(AccountBaL.updateAccountBal(accountNo, city, state));
		
	}

}

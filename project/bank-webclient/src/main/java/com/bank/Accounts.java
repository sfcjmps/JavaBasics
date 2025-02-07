package com.bank;

public class Accounts {
	private int accountnum;
	private double amount;
	private char accounttype;
	private int userid;
	
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public char getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Accounts [accountnum=" + accountnum + ", amount=" + amount + ", accounttype=" + accounttype
				+ ", userid=" + userid + "]";
	}
	
	
}

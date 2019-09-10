package com.hcl.bank;

public class WithDrawAccount {
	private int accno;
	private int withDrawAmount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getWithDrawAmount() {
		return withDrawAmount;
	}
	public void setWithDrawAmount(int withDrawAmount) {
		this.withDrawAmount = withDrawAmount;
	}
	public String withDrawAccount() {
		return AccountBaL.withdrawAccountBal(accno, withDrawAmount);
	}
}

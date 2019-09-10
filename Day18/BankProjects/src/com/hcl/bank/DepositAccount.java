package com.hcl.bank;

public class DepositAccount {
	private int accno;
	private int deptAmount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getDeptAmount() {
		return deptAmount;
	}
	public void setDeptAmount(int deptAmount) {
		this.deptAmount = deptAmount;
	}
	public String depositAccount() {
		return AccountBaL.depositAccountBal(accno, deptAmount);
	}
}

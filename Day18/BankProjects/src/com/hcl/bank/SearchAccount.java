package com.hcl.bank;

import java.sql.ResultSet;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class SearchAccount {
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	public Accounts searchAccount() {
		return AccountBaL.searchAccountsBal(accno);
	}
}

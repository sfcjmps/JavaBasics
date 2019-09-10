package com.hcl.bank;

public class AddAccount {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String accountType;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String addAccount() {
		Accounts obj = new Accounts();
		int accno = AccountBaL.generateAccountBal();
		obj.setAccountNo(accno);
		obj.setFirstName(firstName);
		obj.setLastName(lastName);
		obj.setCity(city);
		obj.setState(state);
		obj.setAmount(amount);
		obj.setCheqFacil(cheqFacil);
		obj.setAccountType(accountType);
		return AccountBaL.createAccountsBal(obj);
	}
}

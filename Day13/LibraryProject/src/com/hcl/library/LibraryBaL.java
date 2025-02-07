package com.hcl.library;

import java.util.List;

public class LibraryBaL {
	public static String loginBal(String username,String password) {
		return new LibraryDaO().loginDao(username, password);
	}
	
	public static List<Books> searchIdBal(String searchtype,String input) {
		return new LibraryDaO().searchDao(searchtype,input);
	}
	
	public static String issueBooksBal(String username,String[] id){
		return new LibraryDaO().issuebooks(username,id);
	}
	public static  List<Account> accountDetailsBal(String username){
		return new LibraryDaO().accountDao(username);
	}
	
	public static String returnbookBal(String username,String[] id){
		return new LibraryDaO().returnbooks(username, id);
	}
}

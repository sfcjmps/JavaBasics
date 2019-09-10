package com.hcl.java;

public class Evenshow {
	public void show(int n){
		int i=1;
		while(i<n){
			i=i+2;
			System.out.println(+i);
		}
		
	}
		public static void main(String[] args) {
			int n=21;
			new Evenshow().show(n);
	}

}

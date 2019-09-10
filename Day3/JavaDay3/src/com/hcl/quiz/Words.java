package com.hcl.quiz;

public class Words {
	public void calc(int n){
		int a,b,c,d,e;
		if(n>9999){
			System.out.println("Out of range");
		}
		if(n>0 && n<11 && n>19 && n<9999){
		String[] ones=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens=new String[]{" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		a=n%10;
		b=(n%100)/10;
		c=(n%1000)/100;
		d=n/1000;
		if(d>0){
			System.out.print(ones[d] + " thousand ");
		}
		if(c>0){
			System.out.print(ones[c] + " hundred and ");
		}
		if(b>0){
			System.out.print(tens[b] + " ");
		}
		if(a>0){
			System.out.print(ones[a] + ".");
		}else if(n>10 && n<20){
			String[] p=new String[]{" ","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			//p=new String[]{" ","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			e=n%10;
			System.out.println(p[e]);
		}
		}
	}
	public static void main(String[] args) {
		Words obj=new Words();
		obj.calc(8959);
	}
}

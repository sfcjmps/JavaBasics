package com.hcl.boxing;

public class Cricket {
	static int score;
	public void incr(int x){
		score+=x;
	}
	public static void main(String[] args) {
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket ext=new Cricket();
		fb.incr(45);
		sb.incr(55);
		ext.incr(52);
		System.out.println(Cricket.score);
	}

}

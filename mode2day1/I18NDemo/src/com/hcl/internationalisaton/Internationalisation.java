package com.hcl.internationalisaton;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Internationalisation {
	public static void main(String[] args) {
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat nf3 = NumberFormat.getInstance(Locale.JAPAN);
		System.out.println("Italy is : " + d + "    :    " + nf.format(d));
		System.out.println("Us is : "  + d + "    :    " + nf1.format(d));
		System.out.println("FRANCE is : "  + d + "    :    " + nf2.format(d));
		System.out.println("Japan is : "  + d + "    :    " + nf3.format(d));
		
		DateFormat d1 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		System.out.println("Short format of date is : " + d1.format(new Date()));
		
		DateFormat d2 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println("Long format of date is : " + d2.format(new Date()));
		
		DateFormat d3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		System.out.println("Short format of date is : " + d3.format(new Date()));
		
		DateFormat d4 = DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA);
		System.out.println(d4.format(new Date()));
		
	}
}

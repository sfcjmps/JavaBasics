package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {
	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("Keerthana");
		lstData.add("Yash");
		lstData.add("Amit");
		lstData.add("Raghu");
		lstData.add("Sai");
		lstData.add("Krishna");
		
		for (Object object : lstData) {
			System.out.println("List Demo " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class LinkDemo implements Runnable {
	public void run() {
		LinkedList lst = new LinkedList();
		lst.add("Bindu");
		lst.add("Vishalakshi");
		lst.add("Anubhav");
		lst.add("Prem");
		lst.add("Rishab");
		lst.add("Janani");
		lst.add("Tarun");
		lst.add("Kiruba");
		for (Object object : lst) {
			System.out.println("link Demo " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class VectorDemo implements Runnable {
	@Override
	public void run() {
		Vector v = new Vector();
		v.addElement("Niveda");
		v.addElement("Yashwanth");
		v.addElement("Sai Krishan");
		v.addElement("Prem Reddy");
		v.addElement("Anisha");
		v.addElement("Nagendra");
		for (Object object : v) {
			System.out.println("Vector Demo " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThrImp {
  public static void main(String[] args) {
	Thread t1 = new Thread(new ListDemo());
	Thread t2 = new Thread(new LinkDemo());
	Thread t3 = new Thread(new VectorDemo());
	
	t1.start();
	t2.start();
	t3.start();
  }
}

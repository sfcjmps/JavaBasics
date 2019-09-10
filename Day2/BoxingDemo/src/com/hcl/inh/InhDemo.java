package com.hcl.inh;

class C1 {
	public void show(){
		System.out.println("From Show Method");
	}
}
class C2 extends C1{
	public void display(){
		System.out.println("From Display Method");
	}
}
public class InhDemo {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.show();
		obj.display();
	}

}

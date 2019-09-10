package A;
public class Demo {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;
	public void show(){
		Demo obj=new Demo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}

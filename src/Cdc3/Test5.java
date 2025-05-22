package Cdc3;
interface I1{
	abstract void add();
	void sub();
}

public class Test5 implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Test5 t5=new Test5();
		t5.add();
		t5.sub();
	}
	

}

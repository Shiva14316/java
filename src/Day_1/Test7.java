package Day_1;

public class Test7 {
	int a;
	int b;
	public Test7(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		Test7 t1=new Test7 (100,36);
		t1.add();
		
	}

}

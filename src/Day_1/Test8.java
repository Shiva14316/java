package Day_1;

public class Test8 {
	int x;
	int y;
	public Test8(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		
	}
	public Test8(Test8 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		Test8 t1=new Test8(45,30);
		Test8 t2=new Test8(t1);
		
	}
		

	}



package Cdc3;
class thathaya {
	void child() {
		System.out.println("4 people");
	}
	
}
class property extends thathaya{
	void division() {
		System.out.println("each 4 acres");
	}
}
class ruler extends property{
	void arun() {
		System.out.println("i am the ruler");
	}
}
class ruler2 extends property{
	void ankitha() {
		System.out.println("i am the ruler2");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		ruler r1=new ruler();
		ruler2 r2=new ruler2();
		r1.arun();
		r2.ankitha();
		

	}

}

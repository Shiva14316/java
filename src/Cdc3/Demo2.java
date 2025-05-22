package Cdc3;
class Fruits{
	void benifits() {
		System.out.println("healthy");
		
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("red");
	}
}
class Banana extends Fruits{
	void lenght() {
		System.out.println("10 cm");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Banana b1=new Banana();
		a1.color();
		b1.lenght();

	}

}

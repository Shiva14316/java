package Cdc3;
class bike{
	void speed() {
		System.out.println("250 km per hour");
	}
}
class bmw extends bike{
	void rev() {
		System.out.println("1000cc");
		
	}
}
class model extends bmw {
	void colour() {
		System.out.println("red");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		model m1=new model();
		m1.speed();
		m1.rev();
		m1.colour();
		
	

	}

}

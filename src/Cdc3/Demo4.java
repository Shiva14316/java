package Cdc3;
class chocolate{
	void eat() {
		System.out.println("eat chocolate");
		
	}
}
class dark extends chocolate {
	void teast1() {
		System.out.println("Teast is very good");
	}
}
class sweet extends chocolate{
	void teast2() {
		System.out.println("Teast2 is very good");
	}
}
class barbone extends dark{
	void cost1() {
		System.out.println("cost is 10rp");
	}
}
class amul extends dark{
	void cost2() {
		System.out.println("cost is 20rp");
	}
}
class dairymilk extends sweet{
	void weight1() {
		System.out.println("weight is 20gm");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("weight is 100gm");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		barbone b1=new barbone();
		amul a1=new amul();
		dairymilk d1=new dairymilk();
		kitkat k1=new kitkat();
		b1.cost1();
		a1.cost2();
		d1.weight1();
		k1.weight2();
		

	}

}

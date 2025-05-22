package Day_1;

public class test10 {
		int x;
		int y;
		int z;
		public test10() {
			System.out.println("Welcome to My profile:G.Arun");
		}
		public test10(int x) {
			this.x=x;
			System.out.println(x);
		}
		public test10(int x,int y) {
			
			this.x=x;
			this.y=y;
			
			System.out.println(x+y);
			
		}
		public test10(int x,int y,int z) {
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println(x+y+z);
		}

		public static void main(String[] args) {
			test10 t1=new test10();
			test10 t2=new test10(10);
			test10 t3=new test10(100,96);
			test10 t4=new test10(100,917,900);
			
			
		}
			

		}






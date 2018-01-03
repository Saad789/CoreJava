class Cone {
		void calc(int a, int b) {
			System.out.println("the sum of two numbers is:" + (a + b));
		}
	}

	class Ctwo extends Cone {
		/*
		 * void calc(int a, int b){
		 * 
		 * super.calc(10,20); System.out.println("the mul of two numbers is:"+
		 * (a * b)); }
		 */

		void div(int a, int b) {
			System.out.println("the div of two numbers is:" + (a / b));
		}
	}

	public class Test01 {

		public static void main(String[] args) {
			// case1:Creating object for SuperClass
			// and hold in SuperClass reference.

			Cone c = new Ctwo();
			if(c instanceof Ctwo){
				//type-cast
				Ctwo cc = (Ctwo)c;
				cc.calc(100, 200);
				cc.div(10, 2);
			}

	    }
	}



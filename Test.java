class Cone1{
	  String name;
	  
	  void calc(int a, int b){
	  System.out.println("the sum of two numbers is:"+ (a + b));
	 }
}

class Ctwo2 extends Cone1{
	void calc(int a, int b){
	super.calc(10,20);
	System.out.println("the mul of two numbers is:"+ (a * b));
	 }
	
	
	  void div(int a , int b){
	  System.out.println("the div of two numbers is:"+ (a / b));
	}
}

public class Test {
	
	public static void main(String[] args) {
    // case1:Creating object for SuperClass
	// and hold in SuperClass reference.
	
	Ctwo2 c = new Ctwo2();
	c.calc(100,200);
	c.div(10, 2);
	}

}

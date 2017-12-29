
public class Employee03 {
	int id;
	String name;
	double salary;
	
	Employee03(int a,String n,double s)
	{
		id = a;
		name = n;
		salary = s;
	}
	
	public static void main(String[] args) {
		System.out.println("***JVM ENTERED***");
		Employee03 emp1 = new Employee03(1234,"Raju",30000);
		Employee03 emp2 = new Employee03(5678,"Sunil",40000);
		System.out.println("Employee1 information");
		System.out.println("---------------------");
		System.out.println("EID:"+emp1.id);
		System.out.println("ENAME:"+emp1.name);
		System.out.println("ESAL:"+emp1.salary);
		System.out.println("---------------------");
		System.out.println("EID:"+emp2.id);
		System.out.println("ENAME:"+emp2.name);
		System.out.println("ESAL:"+emp2.salary);
	}	
		
		
}



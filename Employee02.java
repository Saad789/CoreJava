
public class Employee02 {
	int id;
	String name;
	double salary;
	
Employee02()
{
	System.out.println("Object is created");
	id = 1234;
	name = "Saad";
	salary = 30000;
}
	
	public static void main(String[] args) {
	Employee02 emp = new Employee02();
	System.out.println("***JVM ENTERED***");
	System.out.println("EID:"+emp.id);
	System.out.println("ENAME:"+emp.name);
	System.out.println("ESAL:"+emp.salary);
	System.out.println("***JVM EXIT***");
	
	}    
}

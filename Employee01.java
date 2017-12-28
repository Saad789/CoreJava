
public class Employee01 {
	int id;
	String name;
	double salary;
	
	
public static void main(String[] args) {
	
	for(int i = 1; i <= 2; i++){
		
	Employee emp1 = new Employee();
	
	emp1.id = 12345;
	emp1.name = "Saad";
	emp1.salary = 50000;
    
	System.out.println("EID:"+emp1.id);
	System.out.println("EName:"+emp1.name);
	System.out.println("Esal:"+emp1.salary);
	System.out.println("..................");
	
	Employee emp2 = new Employee();
	
	emp2.id = 6789;
	emp2.name = "Raju";
	emp2.salary = 60000;
	
    System.out.println("EID:"+emp2.id);
	System.out.println("EName:"+emp2.name);
	System.out.println("Esal:"+emp2.salary);
	System.out.println("..................");
	
	}
  }
}

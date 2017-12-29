
public class Employee04 {
	int id;
	String name;
	double salary;
	
	Employee04(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		int id[] = {1234,5678};
		String name[] = {"Raju","Sunil"};
		double salary[] = {30000,40000};
		
		for(int i = 0; i<2; i++){
			
		Employee04 emp = new Employee04(id[i],name[i],salary[i]);
		System.out.println("EID:"+emp.id+"\nENAME:"+emp.name+"\nESAL:"+emp.salary);
			
		}
		
	}

}

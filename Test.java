
class Student {
	
private int id;
	
Student(int id){
	this.id = id;
    }

void displayInfo(){
	 System.out.println("ID:"+id);
    }
}

class Test{
	  public static void main(String[] args) {
		
	  Student st = new Student(45);
	  st.displayInfo();
    }
}



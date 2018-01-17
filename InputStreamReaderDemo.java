import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		BufferedReader br = null;

        try {
			    br = new BufferedReader(new InputStreamReader(System.in));
			    System.out.println("Enter your ID");
			    String id = br.readLine();
			    int eid = Integer.parseInt(id);
			    System.out.println("Enter Your Name");
			    String name = br.readLine();
			    System.out.println("Enter Your Salary");
			    String salary = br.readLine();
			    double esalary = Double.parseDouble(salary);
			    System.out.println("Following are the details of the employee");
			    System.out.println("EID:"+eid);
			    System.out.println("EName:"+name);
			    System.out.println("ESALARY:"+esalary);
			   }catch(IOException e){
				 
			 }
        }
}
			
	    



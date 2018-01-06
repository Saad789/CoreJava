import java.util.*;
import java.util.TreeSet;

class Test06 {

public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println("hs:"+hs);
		
		LinkedHashSet<Integer> ls = new LinkedHashSet <Integer>();
	    
		ls.add(100);
		ls.add(200);
		ls.add(300);
		System.out.println("ls:"+ls);
	
	
	    TreeSet<Integer> ts = new TreeSet<Integer>();
		
		
		ts.add(10);
		ts.add(420);
		ts.add(30);
		
		System.out.println(ts);
		
	

	}

}

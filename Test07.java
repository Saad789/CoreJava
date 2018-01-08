import java.util.Comparator;
import java.util.TreeSet;

public class Test07 {

	public static void main(String[] args) {
		Comparator<Integer> c1 = new MyComparator<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>(c1);
		
		ts.add(12);
		ts.add(14);
		ts.add(16);
		ts.add(18);
		System.out.println(ts);
		
		

	}

}

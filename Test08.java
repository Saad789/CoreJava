import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test08 {

	   public static void main(String[] args) {
	
	   String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  
	
	   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	   int sum = 0;
	
	   hm.put(Alphabets.charAt(0),0);
	   hm.put(Alphabets.charAt(1),1);
	
	   System.out.println(hm);
	

for(int i = 2; i < Alphabets.length();i++){
		
		int value = hm.get(Alphabets.charAt(i-1)) + hm.get(Alphabets.charAt(i-2));
		hm.put(Alphabets.charAt(i), value);
		
		}
   
      System.out.println(sum);
	
	  Set<Character> c = hm.keySet();
	  for(char i : c){
	  System.out.println(i);
	  }
	
	 Collection <Integer> i = hm.values();
	 for(int v : i){
	 System.out.println(v);
	 }

	Set<Map.Entry<Character,Integer>> s1 = hm.entrySet();
	for(Map.Entry<Character,Integer> entry:s1){
	System.out.println(entry);
    }
  }
}

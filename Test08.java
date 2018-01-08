import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.soap.SOAPBinding;

public class Test08 {

	   public static void main(String[] args) {
	
	   String input = "SAAD";
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
   
for(int i = 0; i < input.length(); i++){
		
    	if(hm.containsKey(input.charAt(i))){
    		
    	sum = sum + hm.get(input.charAt(i));
    	}
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

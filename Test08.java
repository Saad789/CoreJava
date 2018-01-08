import java.util.HashMap;

public class Test08 {

	public static void main(String[] args) {
	
	String input = "MAN";
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
	
	}
 }

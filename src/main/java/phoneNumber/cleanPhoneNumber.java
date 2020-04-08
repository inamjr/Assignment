package phoneNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class cleanPhoneNumber {

	public static void main(String[] args) {
		String w = "+1 (123)-344-0999";
		String c = "123-344-0999";
		String z = "+1 (123)-344-0999";
	
//	ArrayList<Character> m = new ArrayList<Character>();
		String m = "";
	
	w = w.replace(" ", "");
	w = w.replace(".", "");
	w = w.replace("(", "");
	w = w.replace(")", "");
	w = w.replace("-", "");
	w = w.replace("+", "");
	
		char [] arr = w.toCharArray();
		
		if(w.length()==11) {
		
		     for (int i =w.length()-1; i>0;i--) {
			m= arr[i]+m;		
				
		   }
		}else if(w.length()==10) {
			for (int i =w.length()-1; i>=0;i--) {
				m= arr[i]+m;
		     }
	    }else {
			
		}
		System.out.println(m);
		
		}
	}
		

	



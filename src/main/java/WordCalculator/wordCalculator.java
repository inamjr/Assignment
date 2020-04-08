package WordCalculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class wordCalculator {

	public static void main(String[] args) {
		
		String t = "What is 25 divided by 5?";
		t= t.replace("What is ", ""); // remove irrelevant characters
		t= t.replace("?", "");      // remove irrelevant characters
		t= t.replace(" by", "");      // remove irrelevant characters
		
		int a = 0;
		int b = 0;
		int solu=0;
		String[] tword= null;  // create a string array
		
	    Pattern pattern = Pattern.compile(" "); // this splits the string using the spaces " " between chacters
	    tword = pattern.split(t);       // forms the string Array where ever there is a split
	     System.out.println(Arrays.toString(tword));
	     
	      a=Integer.parseInt(tword[0]) ;// converst the first array index to an int
	      System.out.println(a);
	      
	      b=Integer.parseInt(tword[2]) ;// converst the third array index to an int
	      System.out.println(b);
	      
	      String operator = tword[1];
	      
	      switch(operator) {
	      case "plus":
	    	  solu=a+b; break;
	      case "minus":
	    	  solu=a-b; break;  
	      case "multiplied":
	    	  solu=a*b; break;
	      case "divided":
	    	  solu=a/b; break; 
	      }
	      
	      System.out.println(solu);
	}

}

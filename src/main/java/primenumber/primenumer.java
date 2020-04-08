package primenumber;

import java.util.HashMap;
import java.util.Map;

public class primenumer {

	public static void main(String[] args) {
		
		
		int  ithprime=6;
		int y= 1;
		int i= 0;
		int l = 2;
		int num =20;
		
	  Map<Integer, Integer> primeNum = new HashMap <Integer, Integer>();
		
	  
	  while (i<num) { // iterates num (20) times
		  
		 
		 if(l>1 & l<=3) { // add 2 and 3 to the prime number map
			 
			 primeNum.put(y, l);
			 y++;
			 l++;
			 
		 }
		 	if(l%2==0) {	// skip the number if it is even
			 l++;
		 }
		 	if(l/10==0) {	// skip the number if it is 10: for some reason it keeps adding 10
			 l++;
		 }
		 	if( l/3>=2 & l%3==0) {// skip the number if it is divisible by 3
		 		
				 l++;
				 
			 }
			  if(l%l==0  ) {     // add the number if it is divisible by itself
				  
				 primeNum.put(y,l ); // adding it to the map
				 y++;
				 l++;
				 i++;
				
			 }
	
			 }
	
	  System.out.println("The "+ithprime+"'th prime number is "+ primeNum.get(ithprime));
		 }
	  
		}




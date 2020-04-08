package AtbashCipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class codingAndDecoding {

	public static void main(String[] args) {
		
	
		
   Map<Integer, String  > alphabetop = new HashMap<Integer,String >();// a map with the number as the key and the alphabet as the value
		
		alphabetop.put(26,"A");alphabetop.put(25,"B");alphabetop.put(24,"C");alphabetop.put(23,"D");
		alphabetop.put(22,"E");alphabetop.put(21,"F");alphabetop.put(20,"G");alphabetop.put(19,"H");
		alphabetop.put(18,"I");alphabetop.put(17,"J");alphabetop.put(16,"K");alphabetop.put(15,"L");
		alphabetop.put(14,"M");alphabetop.put(13,"N");alphabetop.put(12,"O");alphabetop.put(11,"P");
		alphabetop.put(10,"Q");alphabetop.put(9,"R");alphabetop.put(8,"S");alphabetop.put(7,"T");
		alphabetop.put(6,"U");alphabetop.put(5,"V");alphabetop.put(4,"W");alphabetop.put(3,"X");
		alphabetop.put(2,"Y");alphabetop.put(1,"Z");
		

		
   Map<String,Integer> alphabetrev = new HashMap<String,Integer>(); // the reverse of th firstmap
		
		alphabetrev.put("A",1);alphabetrev.put("B",2);alphabetrev.put("C",3);alphabetrev.put("D",4);
		alphabetrev.put("E",5);alphabetrev.put("F",6);alphabetrev.put("G",7);alphabetrev.put("H",8);
		alphabetrev.put("I",9);alphabetrev.put("J",10);alphabetrev.put("K",11);alphabetrev.put("L",12);
		alphabetrev.put("M",13);alphabetrev.put("N",14);alphabetrev.put("O",15);alphabetrev.put("P",16);
		alphabetrev.put("Q",17);alphabetrev.put("R",18);alphabetrev.put("S",19);alphabetrev.put("T",20);
		alphabetrev.put("U",21);alphabetrev.put("V",22);alphabetrev.put("W",23);alphabetrev.put("X",24);
		alphabetrev.put("Y",25);alphabetrev.put("Z",26);	
			
	

   
	      String str ="gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt";
	      str = str.replace(" ", "");
	      str = str.toUpperCase(); 
	      String strnew = ""  ;
	      
	    
	    
	
	    for(int i=0; i<str.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
	    	
	    	String we = String.valueOf(str.charAt(i));// converting the char to make a string
	    	strnew =strnew+alphabetop.get(alphabetrev.get(we));// using the char as the key to get the equivalent value with the new key
	
		    }
	    System.out.print(strnew.toLowerCase());
	    } 

}


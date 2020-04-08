package caesarCipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CeaserCipher {

	public static void main(String[] args) {
		
		int key = 3;
		
	Map<Integer, String  > alphabet = new HashMap<Integer,String >();// a map with the number as the key and the alphabet as the value
		
		alphabet.put(1,"A");alphabet.put(2,"B");alphabet.put(3,"C");alphabet.put(4,"D");
		alphabet.put(5,"E");alphabet.put(6,"F");alphabet.put(7,"G");alphabet.put(8,"H");
		alphabet.put(9,"I");alphabet.put(10,"J");alphabet.put(11,"K");alphabet.put(12,"L");
		alphabet.put(13,"M");alphabet.put(14,"N");alphabet.put(15,"O");alphabet.put(16,"P");
		alphabet.put(17,"Q");alphabet.put(18,"R");alphabet.put(19,"S");alphabet.put(20,"T");
		alphabet.put(21,"U");alphabet.put(22,"V");alphabet.put(23,"W");alphabet.put(24,"X");
		alphabet.put(25,"Y");alphabet.put(26,"Z");
		
   Map<String,Integer> alphabetrev = new HashMap<String,Integer>(); // the reverse of th firstmap
		
		alphabetrev.put("A",1);alphabetrev.put("B",2);alphabetrev.put("C",3);alphabetrev.put("D",4);
		alphabetrev.put("E",5);alphabetrev.put("F",6);alphabetrev.put("G",7);alphabetrev.put("H",8);
		alphabetrev.put("I",9);alphabetrev.put("J",10);alphabetrev.put("K",11);alphabetrev.put("L",12);
		alphabetrev.put("M",13);alphabetrev.put("N",14);alphabetrev.put("O",15);alphabetrev.put("P",16);
		alphabetrev.put("Q",17);alphabetrev.put("R",18);alphabetrev.put("S",19);alphabetrev.put("T",20);
		alphabetrev.put("U",21);alphabetrev.put("V",22);alphabetrev.put("W",23);alphabetrev.put("X",24);
		alphabetrev.put("Y",25);alphabetrev.put("Z",26);	
			
	

   Map<String ,Integer > alphabett = new HashMap<String ,Integer >();   // a new map that is formed 
	   
	    
	    int v= key;
	    int w= 0;
	    if (key>=0 | key<26) { //only works if the key is >0 and less than 26
	    	
	    	if (key>=1 & key<26) {
	    		for (int i=0; i<26;i++) { // this iterates 26 times
	    			w = i+1;              // for every iteration we add one since it starts iterating from 0
	    			alphabett.put(alphabet.get(w),v );// adding to the 3rd map using the key(which is the first map's key(int)) and v which is the 3rd maps value 
	    			v++;
	    			
	    			 if (v>26) { // for the value >26 we start back from 1  
	    				 v=1;
	    			 }
	    			//System.out.println(alphabet.get(w)+v);
	    		}
	    	}
	    	
	    }
	  // this converts the word using the key to the ceasers cypher value  
	      String str ="How";
	      str = str.toUpperCase(); 
	      String strnew = ""  ;
	    
	    
	
	    for(int i=0; i<str.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
	    	
	    	String we = String.valueOf(str.charAt(i));// converting the char to make a string
	    	strnew =alphabet.get(alphabett.get(we));// using the char as the key to get the equivalent value with the new key
	    	
	    	System.out.println(strnew);
		    }
	   
	    } 

}


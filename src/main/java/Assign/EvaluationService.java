package Assign;


import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		 String acronym = phrase.replaceAll("\\B.|\\P{L}", "");
		// TODO Write an implementation for this method declaration
		return acronym;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	public static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if(this.sideOne==this.sideTwo && this.sideTwo==this.sideThree& this.sideOne==this.sideThree){
				return true;
			}
			return false;
			}

		public boolean isIsosceles() {
			if(this.sideOne!=this.sideTwo & this.sideTwo>=this.sideThree ) {
				
				
				return true;
			}
			
			return false;
			
		}

		public boolean isScalene() {
			if(this.sideOne!=this.sideTwo && this.sideTwo!=this.sideThree &this.sideOne!=this.sideThree) {
				return true;
			}
			
			return false;
		}
		}

	

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		
Scanner scan = new Scanner(System.in);
		
		Map<String,Integer> scramble = new HashMap<String,Integer>();
		
		scramble.put("A",1);scramble.put("E",1);scramble.put("I",1);scramble.put("O",1);
		scramble.put("S",1);scramble.put("T",1);scramble.put("R", 1);scramble.put("U", 1);
		
		scramble.put("D",2);scramble.put("G",2);
		
		scramble.put("B",3);scramble.put("C",3);scramble.put("M",3);scramble.put("P",3);
		
		scramble.put("F",4);scramble.put("H",4);scramble.put("V",4);scramble.put("W",4);
		scramble.put("Y",4);
		
		scramble.put("K",5);
		
		scramble.put("J",8);scramble.put("X",8);
		
		scramble.put("Q",10);scramble.put("Z",10);
		
				
		string=string.toUpperCase();
		string = string.replace(" ",  "");
		char [] scrambar= string.toCharArray();
//		System.out.println(scramb);
		
		int tot =0;
		for(int i=0; i<string.length(); i++ ) {
				Character c = scrambar[i];
				String s = c.toString();
				
//				System.out.print(s);
//				System.out.println(scramble.get(s));
				
				tot = scramble.get(s)+tot;
		
		 	
		}

		return tot;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		String m = "";
	
	string = string.replace(" ", "");
	string = string.replace(".", "");
	string = string.replace("(", "");
	string = string.replace(")", "");
	string = string.replace("-", "");
	string = string.replace("+", "");
	
		char [] arr = string.toCharArray();
		
		if(string.length()==11) {
		
		     for (int i =string.length()-1; i>0;i--) {
			m= arr[i]+m;		
				
		   }
		}else if(string.length()==10) {
			for (int i =string.length()-1; i>=0;i--) {
				m= arr[i]+m;
		     }
	    }else {
			
		}
		
		return m;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		Map<String, Integer> kmap = new HashMap<String, Integer>();	
		
		// Takes out the space in between the words		
				String[] karr= string.split(" ");
				for(String o:karr) {
				System.out.println(o);
				if(kmap.containsKey(o)) {
					int i= kmap.get(o);
					kmap.put(o,i+1 );
					}else {
						kmap.put(o, 1);
					}
				}
		
		return kmap;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> implements Comparable<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

		//@Override
		public int compareTo(T arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		
	
		String vowel = "AEIOU";
		char [] b = string.toCharArray();
		
		
// if the index of the b[0] is inside the vowel string		
		if (vowel.indexOf(b[0]) >= 0) {
		string= string+"AY";
		}else {
			string= string.substring(1)+string.charAt(0)+"AY";
		}
		
		return string;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		
      String m = Integer.toString(input);
		
		int y =0;
		double  tot = 0;
		
		char[] ch = new char[m.length()]; // creats and save a char array of legth of the strings
		for(int i=0; i<m.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
			ch[i] = m.charAt(i); // fills in the char array (char[])
			y=Character.getNumericValue(ch[i]); // converts char to int
			tot=Math.pow(y,m.length())+tot;
		}
		int u =Integer.parseInt(m);
		 if (u == tot) {
			 
		 }
		
		 return (true);
		}
		
	

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public long calculatePrimeFactorsOf(long l) {
     
		 
		 if(l>1) {
		  if(l%l==0 & l%1==0) {
			 System.out.println(true);// not needed
		 }
		  return l;
	}
		return l;
		
		
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	public static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
		Map<Integer, String  > alphabet = new HashMap<Integer,String >();
			
			alphabet.put(1,"A");alphabet.put(2,"B");alphabet.put(3,"C");alphabet.put(4,"D");
			alphabet.put(5,"E");alphabet.put(6,"F");alphabet.put(7,"G");alphabet.put(8,"H");
			alphabet.put(9,"I");alphabet.put(10,"J");alphabet.put(11,"K");alphabet.put(12,"L");
			alphabet.put(13,"M");alphabet.put(14,"N");alphabet.put(15,"O");alphabet.put(16,"P");
			alphabet.put(17,"Q");alphabet.put(18,"R");alphabet.put(19,"S");alphabet.put(20,"T");
			alphabet.put(21,"U");alphabet.put(22,"V");alphabet.put(23,"W");alphabet.put(24,"X");
			alphabet.put(25,"Y");alphabet.put(26,"Z");
			
	   Map<String,Integer> alphabetrev = new HashMap<String,Integer>();
			
			alphabetrev.put("A",1);alphabetrev.put("B",2);alphabetrev.put("C",3);alphabetrev.put("D",4);
			alphabetrev.put("E",5);alphabetrev.put("F",6);alphabetrev.put("G",7);alphabetrev.put("H",8);
			alphabetrev.put("I",9);alphabetrev.put("J",10);alphabetrev.put("K",11);alphabetrev.put("L",12);
			alphabetrev.put("M",13);alphabetrev.put("N",14);alphabetrev.put("O",15);alphabetrev.put("P",16);
			alphabetrev.put("Q",17);alphabetrev.put("R",18);alphabetrev.put("S",19);alphabetrev.put("T",20);
			alphabetrev.put("U",21);alphabetrev.put("V",22);alphabetrev.put("W",23);alphabetrev.put("X",24);
			alphabetrev.put("Y",25);alphabetrev.put("Z",26);	
				
		

	   Map<String ,Integer > alphabett = new HashMap<String ,Integer >();   
		   
		    
		    int v= key;
		    int w= 0;
		    if (key>=0 | key<26) {
		    	
		    	if (key>=1 & key<26) {
		    		for (int i=0; i<26;i++) {
		    			w = i+1;
		    			alphabett.put(alphabet.get(w),v );
		    			v++;
		    			
		    			 if (v>26) {
		    				 v=1;
		    			 }
		    			//System.out.println(alphabet.get(w)+v);
		    		}
		    	}
		    	
		    }
		    
		      String str = string;
		      str = str.toUpperCase(); 
		      String strnew = ""  ;
		    
		    
		
		    for(int i=0; i<str.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
		    	
		    	String we = String.valueOf(str.charAt(i));
		    	strnew =strnew+alphabet.get(alphabett.get(we));
		    	
		    	
			    }

			return strnew;
		
		}
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		int  ithprime=i;
		int y= 1;
		int j= 0;
		int l = 2;
		int num =20;
		
	  Map<Integer, Integer> primeNum = new HashMap <Integer, Integer>();
		
	  
	  while (j<num) { // iterates num (20) times
		  
		 
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
				 j++;
				
			 }
	
			 }
	
	  System.out.println("The "+ithprime+"'th prime number is "+ primeNum.get(ithprime));
		 
	  
		return primeNum.get(ithprime);
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	public static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			
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
					
			

		   
			      String str =string;
			      str = str.replace(" ", "");
			      str = str.toUpperCase(); 
			      String strnew = ""  ;
			      
			    
			    
			
			    for(int i=0; i<str.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
			    	
			    	String we = String.valueOf(str.charAt(i));// converting the char to make a string
			    	strnew =strnew+alphabetop.get(alphabetrev.get(we));// using the char as the key to get the equivalent value with the new key
			
				    }
			   // System.out.print(strnew.toLowerCase());
			     

			return strnew.toLowerCase();
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
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
					
			

		   
			      String str =string;
			      str = str.replace(" ", "");
			      str = str.toUpperCase(); 
			      String strnew = ""  ;
			      
			    
			    
			
			    for(int i=0; i<str.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
			    	
			    	String we = String.valueOf(str.charAt(i));// converting the char to make a string
			    	strnew =strnew+alphabetop.get(alphabetrev.get(we));// using the char as the key to get the equivalent value with the new key
			
				    }
			   // System.out.print(strnew.toLowerCase());
			    

			return strnew.toLowerCase() ;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		return false;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		
String[] alphabet= { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","u","V","W","X","Y","Z"};

       String check =string;
       
       check = check.replace(" ", "");
       check = check.toUpperCase();
       int m=1;
       
      for( String v: alphabet) {
    	boolean b= check.contains(v);
    	//System.out.println(b);
    	if(b==true) {
    		m++;
    	}
      }
    	if(m==26) {
    		//System.out.println(" its a PanGram");
    	}else {
    		//System.out.println(" its not a PanGram");
    	}
      
     //System.out.println("The number of letters occuring atleast once is :"+ m);  
		
		return m==26;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		
		return null;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int j) {
		
		int sum = 0;
		
		for(int i=1; i<j; i++) {
			if(i%3==0|i%5==0) {
				sum=sum+i;
			}

		}

		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		
		String cardNumber =string;
		String t = cardNumber;
		t=  t.substring(1);// remove irrelevant characters in this case the first 1
		t= t.replace(" ", "");      // remove irrelevant characters
		
		int a = 0;int b = 0;int c = 0;int d = 0;int e = 0;int f = 0;int g = 0;int h = 0;
		int j = 0;int k = 0;int l = 0;int m = 0;int n = 0;int o = 0;int p = 0;int q = 0;
		
		int solu=0;
	
		String[] tword= null;  // create a string array
		
		
		
	    Pattern pattern = Pattern.compile(""); // this splits the string using the spaces " " between chacters
	    tword = pattern.split(t);       // forms the string Array where ever there is a split
	    System.out.println(Arrays.toString(tword));
	 

	    for(int i=1;i<17;i++) {
	    	 
	    	if (i==1) {
	          a=Integer.parseInt(tword[0]) *2 ;
	          if(a>9) {
	        	  a=a-9;
	          }
	    	}
	    	if (i==2) {
	  	      b=Integer.parseInt(tword[1])  ;
	  	    	}
	    	if (i==3) {
		          c=Integer.parseInt(tword[2]) *2 ;
		          if(c>9) {
		        	  c=c-9;
		          }
		    	}
		    	if (i==4) {
		  	      d=Integer.parseInt(tword[3])  ;
		  	    	}
		    	if (i==5) {
			          e=Integer.parseInt(tword[4]) *2 ;
			          if(e>9) {
			        	  e=e-9;
			          }
			    	}
			    	if (i==6) {
			  	      f=Integer.parseInt(tword[5])  ;
			  	    	}
			    	if (i==7) {
				          g=Integer.parseInt(tword[6]) *2 ;
				          if(g>9) {
				        	  g=g-9;
				          }
				    	}
				    	if (i==8) {
				  	      h=Integer.parseInt(tword[7])  ;
				  	    	}
				    	if (i==9) {
					          j=Integer.parseInt(tword[8]) *2 ;
					          if(j>9) {
					        	  j=j-9;
					          }
					    	}
					    	if (i==10) {
					  	      k=Integer.parseInt(tword[9])  ;
					  	    	}
					    	if (i==11) {
						          l=Integer.parseInt(tword[10]) *2 ;
						          if(l>9) {
						        	  l=l-9;
						          }
						    	}
						    	if (i==12) {
						  	      m=Integer.parseInt(tword[11])  ;
						  	    	}
						    	if (i==13) {
							          n=Integer.parseInt(tword[12]) *2 ;
							          if(n>9) {
							        	  n=n-9;
							          }
							    	}
							    	if (i==14) {
							  	      o=Integer.parseInt(tword[13])  ;
							  	    	}
							    	if (i==15) {
								          p=Integer.parseInt(tword[14]) *2 ;
								          if(p>9) {
								        	  p=p-9;
								          }
								    	}
								    	if (i==16) {
								  	      q=Integer.parseInt(tword[15])  ;

	    }
								    	
	  
} solu = a+b+c+d+e+f+g+h+j+k+l+m+n+o+p+q;
 

		return solu%10==0;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		String t = string;
		t= t.replace("What is ", ""); // remove irrelevant characters
		t= t.replace("?", "");      // remove irrelevant characters
		t= t.replace(" by", "");      // remove irrelevant characters
		
		int a = 0;
		int b = 0;
		int solu=0;
		String[] tword= null;  // create a string array
		
	    Pattern pattern = Pattern.compile(" "); // this splits the string using the spaces " " between chacters
	    tword = pattern.split(t);       // forms the string Array where ever there is a split
	    // System.out.println(Arrays.toString(tword));
	     
	      a=Integer.parseInt(tword[0]) ;// converst the first array index to an int
	      //System.out.println(a);
	      
	      b=Integer.parseInt(tword[2]) ;// converst the third array index to an int
	     // System.out.println(b);
	      
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
	      
	      //System.out.println(solu);
		return solu;
	}

}

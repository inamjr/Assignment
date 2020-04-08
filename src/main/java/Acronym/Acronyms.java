package Acronym;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acronyms {
	
	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */

	public static void main(String[] args) {
		
     Scanner word = new Scanner(System.in);
     System.out.println(" Enter the word to Generate an Acronym");
   
// takes in the words     
     String acro = word.nextLine(); 
     
// method 1
     
// using regex (regular expresions)
     // (Escape character(\) 
     // A non-word Boundary(\B) if the character is more than a single character long inregex  
     // java syntax | is the or
     // Any character(.)
     //(unicode category) u can match a single character not belonging to that category with \P{L}
     String acronym = acro.replaceAll("\\B.|\\P{L}", "");
     System.out.println("The acronym of '"+ acro+"' is : '"+ acronym+"'");
     
     char[] values = new char[acro.length()];
     
// Method 2
     
    String acronymm = acro.replaceAll("[a-z]", "");
    System.out.println(acronymm);

// Method 3
    
    int w;
//this iterates through the word and stores it in the array     
    for(int i = 0; i<acro.length(); i++) {
   	 w =(int) acro.charAt(i);
   	 if(w >= 65 && w<= 96) {
   		 values[i]= acro.charAt(i);
   		 System.out.println(acro.charAt(i));
   	 }
    }


}
}
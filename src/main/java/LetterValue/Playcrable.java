package LetterValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Playcrable {

	public static void main(String[] args) {
		
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
		
		
		System.out.println(scramble);
		System.out.println("Enter A Word");
		
		String scramb = "How are you";
		scramb=scramb.toUpperCase();
		scramb = scramb.replace(" ",  "");
		char [] scrambar= scramb.toCharArray();
		System.out.println(scramb);
		
		int tot =0;
		for(int i=0; i<scramb.length(); i++ ) {
				Character c = scrambar[i];
				String s = c.toString();
				
				System.out.print(s);
				System.out.println(scramble.get(s));
				
				tot = scramble.get(s)+tot;
		
		 	
		}
		System.out.println(tot);
	}

}

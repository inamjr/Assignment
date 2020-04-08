package phrasecounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordCounter {

	public static void main(String[] args) {
		
// phrase to be analysed		
		String k = "olly olly in come free";
		
		Map<String, Integer> kmap = new HashMap<String, Integer>();	
		
// Takes out the space in between the words		
		String[] karr= k.split(" ");
		for(String o:karr) {
		System.out.println(o);
		if(kmap.containsKey(o)) {
			int i= kmap.get(o);
			kmap.put(o,i+1 );
			}else {
				kmap.put(o, 1);
			}
		}
		
		System.out.println(kmap);


	}

}

package amstrongNumber;

public class amstrongNumber {

	public static void main(String[] args) {
		
		String m = "153";
		
		int y =0;
		double  tot = 0;
		
		char[] ch = new char[m.length()]; // creats and save a char array of legth of the strings
		for(int i=0; i<m.length();i++) {  // iterates from o and keeps iterating as long as i is less than the length of the string
			ch[i] = m.charAt(i); // fills in the char array (char[])
			y=Character.getNumericValue(ch[i]); // converts char to int
			tot=Math.pow(y,m.length())+tot;

		}
		System.out.println((int)tot);
		
		}
    
	}



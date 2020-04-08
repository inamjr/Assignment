package pigLatin;

public class pigLatin {

	public static void main(String[] args) {
		
		String m ="ARE";
		//m = m.replace(" ", "");
		String vowel = "AEIOU";
		char [] b = m.toCharArray();
		
		
// if the index of the b[0] is inside the vowel string		
		if (vowel.indexOf(b[0]) >= 0) {
		m= m+"AY";
		}else {
			m= m.substring(1)+m.charAt(0)+"AY";
		}
		System.out.println(m);
	}

}

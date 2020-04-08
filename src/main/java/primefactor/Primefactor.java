package primefactor;
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

public class Primefactor {

	public static  boolean main(String[] args) {
	
		
		 long i=9;
		 
		 if(i>1) {
		  if(i%i==0 & i%1==0) {
			 System.out.println(true);
		 }else {
			 System.out.println("not a p0rime number");
		 }

	}
		return true;
	}

}

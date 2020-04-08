package Pangram;

public class panGram {

	public static void main(String[] args) {
		
String[] alphabet= { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","u","V","W","X","Y","Z"};

       String check = "The quick brown fox jumps over the lazy dog";
       
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
    		System.out.println(" its a PanGram");
    	}else {
    		System.out.println(" its not a PanGram");
    	}
      
     System.out.println("The number of letters occuring atleast once is :"+ m);  
		

	}

}

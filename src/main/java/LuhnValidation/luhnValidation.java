package LuhnValidation;

import java.util.Arrays;
import java.util.regex.Pattern;

public class luhnValidation {

	public static void main(String[] args) {
		
		String cardNumber ="1 4539 1488 0343 6467";
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
								    	
	   solu = a+b+c+d+e+f+g+h+j+k+l+m+n+o+p+q;

}
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);
	    System.out.println(g);
	    System.out.println(h);
	    System.out.println(j);
	    System.out.println(k);
	    System.out.println(l);
	    System.out.println(m);
	    System.out.println(n);
	    System.out.println(o);
	    System.out.println(p);
	    System.out.println(q);
	    
	    System.out.println(solu);
	}

}


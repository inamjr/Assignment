package uniquemultiple;

public class uniqueMultiple {

	public static void main(String[] args) {
		
		int j = 20;
		int sum = 0;
		for(int i=1; i<j; i++) {
			if(i%3==0|i%5==0) {
				sum=sum+i;
				
			}

		}
System.out.println(sum);
	}

}

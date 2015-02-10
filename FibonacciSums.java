
public class FibonacciSums {
	
	public static void main(String[] args){
		System.out.println(fiboSum(4000000));
	}
		
	public static long fiboSum( long n ){
		long sum = 0;
		long thirdTerm = 0;
		
		long firstTerm = 1;
		long secondTerm = 1;
	
		while(firstTerm< n && secondTerm < n){
			thirdTerm = firstTerm + secondTerm;
			
			if(thirdTerm%2 == 0)
				sum = sum + thirdTerm;
			
			if(firstTerm < secondTerm)
				firstTerm = thirdTerm;
			else if(secondTerm < firstTerm)
				secondTerm = thirdTerm;
			else
				secondTerm = thirdTerm;
			
		}
		
		return sum;
	}

}

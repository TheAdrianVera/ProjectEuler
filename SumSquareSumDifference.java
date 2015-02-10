
public class SumSquareSumDifference {
	
	//this is broken but I gotta go to class, but I did it! GO Nspire!
	
		public static void main(String[] args){
			System.out.println( Square_Sum(100)-Sum_Squares(100) );
		}

		public static long Sum_Squares(long n){
			
			long max = n + 1;
			long sumCounter = 0;
			long currentNumber = 1;
			
			if (currentNumber < max){
				long k = currentNumber * currentNumber;
				sumCounter = sumCounter + k;
				currentNumber++;
			}
		
			return sumCounter;
		}
		
		
		public static long Square_Sum(long n){
			
			long squareCounter=0;
			long currentNumber=1;
			long max = n+1;
			long squareCounterSquared=0;
			
			if(currentNumber < max){
				squareCounter = squareCounter + currentNumber;
			}
			
			else{
				squareCounterSquared = squareCounter * squareCounter;
			}
			
			return squareCounterSquared;
			
		
		}	
		
}

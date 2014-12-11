package j;

public class SumSquareDifference {

	public static void main(String[] args){
		System.out.println(squareOfSums(100) - sumOfSquares(100));
	}
	
	public static int sumOfSquares(int max){
		int sum = 0;
		for(int i = 0; i <= max; i++){
			sum += i*i;
		}
		return sum;
	}
	
	public static int squareOfSums(int max){
		int sum = 0;
		for(int i = 0; i <= max; i++){
			sum += i;
		}
		return sum*sum;
	}
	
}

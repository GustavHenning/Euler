package j;

public class LargePrime {

	public static void main(String[] args){
		int numPrimes = 0;
		int i = 2;
		while(true){
			if(isPrime(i)){
				numPrimes++;
				if(numPrimes == 10001){
					break;
				}
			}
			i++;
		}
		System.out.println(i); 
		
	}

	private static boolean isPrime(int p) {
		if(p == 1 || p == 2) {
			return true;
		}
		for(int i = 2; i < p; i++){
			if(p % i == 0){
				return false;
			}
		}
		return true;
	}
	
}

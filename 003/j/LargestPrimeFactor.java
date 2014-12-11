package j;

import java.util.ArrayList;

public class LargestPrimeFactor {

	public static void main(String[] args){
		ArrayList<Long> primes = new ArrayList<Long>();
		long f = 600851475143L;
		long i = 0;
		do {
			i = factorOf(f);
			if(f % i == 0 && !primes.contains(i)){
				primes.add(i);
				f = f / i;
			}
		} while(i != f);
		primes.add(f);
		
		long largest = 0;
		for(long p : primes){
			if(p > largest){
				largest = p;
			}
		}
		System.out.println(largest);
		
	}
	
	public static long factorOf(long p){
		for(long i = 2; i < p; i++){
			if(p % i == 0){
				return i;
			}
		}
		return p;
	}
}

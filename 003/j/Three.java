package j;

import java.util.ArrayList;


public class Three {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args){
		long x = 600851475143L;
		
		System.out.println("Answer: " + findPrimes(x));
		
	}
	


	private static long findPrimes(long x) {

		int i = 1;
		while(!isPrime(i) && x % i != 0){
			System.out.println(i);
			i++;
		}
		x = x / i;
		primes.add(i);
		
		while(!isPrime(x)) {
			if(x % i == 0 && isPrime(i) && !primes.contains(i)) {
				x = x / i;
				primes.add(i);
				System.out.println(x + ", " + i);
				i = 1;
			}
			i++;
		}
		for(Integer p : primes){
			if(x < p) x = p;
			System.out.print(p + ", ");
		}
		return x;
	}



	public static boolean isPrime(long y){
		if(y < 3) return true;
		
		long j = 2;
		while(y>j) {
			if(y % j == 0){
				System.out.println(j);
				return false;
			}
			j++;
		}
		return true;
	}
}

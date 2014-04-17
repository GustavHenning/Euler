package j;

public class Two {
	static int[] pastfib = {0,1};

	public static void main(String[] args){
		int fibSum = 0;
		int ans = 0;
		
		while(fibSum < 4000000){
			fibSum = nextFib();
			if(fibSum % 2 == 0) ans += fibSum;
		}
		
		System.out.println(ans);
	}

	private static int nextFib() {
		int fib = pastfib[0] + pastfib[1];
		pastfib[0] = pastfib[1];
		pastfib[1] = fib;
		return fib;
	}
	
}

package j;

public class SmallestMultiple {

	public static void main(String[] args){
		int divReq = 20;
		int i = 1;
		while(!fullyDivisible(i, divReq)){
			i++;
		}
		System.out.println(i);
		
	}

	private static boolean fullyDivisible(int i, int divReq) {
		for(int j = divReq; j > 0; j--){
			if(i % j != 0){
				return false;
			}
		}
		return true;
	}	
	
}

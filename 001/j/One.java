package j;

public class One {

public static void main(String[] args) {
	long ans = 0;
	
	for(int i = 0; i < 1000; i++){
		if(i % 3 == 0 || (i % 3 != 0 && i % 5 == 0)) ans += i;
	}
	
	System.out.println(ans);
}

}

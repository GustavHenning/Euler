package j;

public class LargestPalindromeProduct {

	public LargestPalindromeProduct() {
		int largest = 0;
		for (int i = 999; i > 1; i--) {
			for (int j = 999; j > 1; j--) {
				
				if (isPalindrome(i * j)) {
					if (largest < i * j) {
						largest = i * j;
					}
				}
				
			}
		}
		System.out.println(largest);

	}

	public boolean isPalindrome(int i) {
		String s = Integer.toString(i);
		for (int j = 0; j < s.length() / 2; j++) {
			if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new LargestPalindromeProduct();
	}
}

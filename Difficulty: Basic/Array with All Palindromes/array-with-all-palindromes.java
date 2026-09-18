class Solution {
	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp>0) {
			rev = rev*10 + (temp%10);
			temp /= 10;
		}
		return (num == rev);
	}
	
	public static boolean isPalinArray(int[] arr) {
		// code here.
		for (int num : arr) {
			if (!isPalindrome(num))
				return false;
		}
		
		return true;
	}
}

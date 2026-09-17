class Solution {
	public int getSecondLargest(int[] arr) {
		// code here
		int firstMax = Integer.MIN_VALUE;
		int secondMax = -1;
		for (int num : arr) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			}
			else if (num > secondMax && num != firstMax) {
				secondMax = num;
			}
		}
		return (secondMax < 0) ? -1 : secondMax;
	}
}

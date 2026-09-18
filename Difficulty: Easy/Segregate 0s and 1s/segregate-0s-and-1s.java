class Solution {
	void segregate0and1(int[] arr) {
		// code here
		int len = arr.length;
		int zeroIdx = -1;
		
		for (int i = 0; i<len ; ++i) {
			if (arr[i] == 0) {
				zeroIdx++;
				int temp = arr[i];
				arr[i] = arr[zeroIdx];
				arr[zeroIdx] = temp;
			}
		}
	}
}

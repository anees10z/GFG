class Solution {
	public ArrayList<Integer> getAlternates(int arr[]) {
		// Code Here
		ArrayList<Integer> alt = new ArrayList<>();
		for (int i = 0; i<arr.length; ++i) {
			if ((i&1) == 0) {
				alt.add(arr[i]);
			}
		}
		return alt;
	}
}

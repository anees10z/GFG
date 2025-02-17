class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr); // here array is sorted in Ascending order
        for(int i = arr.length-1; k>0; --i,k--){  // Here accessing array elements from reverse order
            res.add(arr[i]);
        }
        return res;
    }
}

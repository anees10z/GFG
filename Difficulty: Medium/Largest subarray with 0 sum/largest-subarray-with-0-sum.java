class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if (sum == 0) {
                len = Math.max(len, j + 1);
            }
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }

        return len;
    }
}
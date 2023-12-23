class Solution {
    public long solution(int n) {
        int[] arr = new int[2001];
        arr[1] = 1; // 1
        arr[2] = 2; // 1,1 | 2
        
        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }
        return arr[n];
    }
}
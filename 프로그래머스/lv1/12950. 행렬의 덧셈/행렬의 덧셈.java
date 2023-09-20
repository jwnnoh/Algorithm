class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int ylimit = arr1.length;
        int xlimit = arr1[0].length;
        
        int[][] answer = new int[ylimit][xlimit];
        
        for (int i = 0; i < ylimit; i++) {
            for (int j = 0; j < xlimit; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
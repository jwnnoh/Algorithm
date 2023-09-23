class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        int xMax = 0, yMax = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > xMax) {
                xMax = sizes[i][0];
            }
            if (sizes[i][1] > yMax) {
                yMax = sizes[i][1];
            }
        }
        return answer = xMax * yMax;
    }
}
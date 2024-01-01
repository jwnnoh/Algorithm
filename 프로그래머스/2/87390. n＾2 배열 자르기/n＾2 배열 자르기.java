public class Solution {
    public static int[] solution(int n, long left, long right) {
    	int[] answer = new int[(int) (right - left) + 1];
    	int idx = 0;
        
    	for(long i = left; i <= right; i++) {
    		long tmp = Math.max(i / n, i % n) + 1;
    		answer[idx++] = (int)tmp;
    	}
    	return answer;
    }
    
}
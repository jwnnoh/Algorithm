import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] pe = new int[n+2];
        Arrays.fill(pe, 1);
        pe[0] = pe[n+1] = 0;
        
        for (int r : reserve) {
            pe[r]++;
        }
        for (int l : lost) {
            pe[l]--;
        }
        
        for (int i = 1; i < n+1; i++) {
            if (pe[i] == 0) {
                if (pe[i-1] == 2) {
                    pe[i-1]--;
                    pe[i]++;
                    continue;
                }
                if (pe[i+1] == 2) {
                    pe[i+1]--;
                    pe[i]++;
                }
            }
            
        }
        
        for (int i : pe) {
            if (i >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}
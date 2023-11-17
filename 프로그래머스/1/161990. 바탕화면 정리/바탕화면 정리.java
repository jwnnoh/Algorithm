import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for (int y = 0; y < wallpaper.length; y++) { // y
            for (int x = 0; x < wallpaper[y].length(); x++) { // x
                if (wallpaper[y].charAt(x) == '#') {
                    luy = Math.min(luy, y);
                    lux = Math.min(lux, x);
                    rdy = Math.max(rdy, y);
                    rdx = Math.max(rdx, x);
                }
            }
        }
        int[] answer = {luy, lux, rdy + 1, rdx + 1};
        return answer;
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long m = Long.parseLong(p);
        
        for (int i=0; i < t.length() - size + 1; i++) {
            String s = (t.substring(i, i+size));
            if (Long.parseLong(s) <= m) {
                answer++;
            }
        }
        return answer;
    }
}
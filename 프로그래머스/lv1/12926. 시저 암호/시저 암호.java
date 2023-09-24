class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[s.length()];
        for(int i =0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == ' ') {
                sb.append(tmp);
            }
            if (tmp >= 97) {
                if (tmp + n > 122) {
                    sb.append((char) (tmp+n-26));
                } else {
                    sb.append((char) (tmp+n));
                }
            }
            if (tmp >= 65 && tmp <= 90) {
                if (tmp + n > 90) {
                    sb.append((char) (tmp+n-26));
                } else {
                    sb.append((char) (tmp+n));
                }
            }
        }
        return String.valueOf(sb);
    }
}
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        for(int i =0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
                count = 0;
            }
            else if(count % 2 == 0) {
                sb.append(String.valueOf(c).toUpperCase());
                count++;
            }
            else {
                sb.append(String.valueOf(c).toLowerCase());
                count++;
            }
        }
        
        return String.valueOf(sb);
    }
}
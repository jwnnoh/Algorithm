class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer.append(i);
            }
        }
        answer.append("0");
        
        for (int i = food.length-1; i >= 1; i--) {
            for (int j = 0; j < food[i]/2; j++) {
                answer.append(i);
            }
        }
        
        return String.valueOf(answer);
    }
}
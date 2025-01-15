class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double d : numbers) {
            answer += d;
        }
        return answer / numbers.length;
    }
}
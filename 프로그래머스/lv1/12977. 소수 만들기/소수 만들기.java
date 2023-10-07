class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(prime(nums[i]+nums[j]+nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean prime(int value) {
        int sum = 0;
        for (int i = 1; i <= value/2; i++) {
            if (value%i == 0) {
                sum++;
            }
        }
        if (sum == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
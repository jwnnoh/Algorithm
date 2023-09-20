import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                continue;
            }
            arrayList.add(arr[i]);
        }
        
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
                
        return answer;
    }
}
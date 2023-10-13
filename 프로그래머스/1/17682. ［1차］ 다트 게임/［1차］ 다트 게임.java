import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        boolean flag = false;
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(0);

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c - '0' == 0) {
                if (flag) {
                    arraylist.set(index, Integer.parseInt(dartResult.substring(i - 1, i + 1)));
                } else {
                    index++;
                    arraylist.add(0);
                }
                continue;
            }

            else if (c - '0' > 0 && c - '0' <= 9) {
                flag = true;
                index++;
                arraylist.add(c - '0');
                continue;
            }
            else if (c - 'A' >= 0 && c - 'A' <= 25) {
                flag = false;
                switch (c) {
                    case 'D' :
                        arraylist.set(index, (int) Math.pow(arraylist.get(index), 2));
                        break;
                    case 'T' :
                        arraylist.set(index, (int) Math.pow(arraylist.get(index), 3));
                        break;
                }
            }
            else {
                flag = false;
                switch (c) {
                    case '*' :
                        arraylist.set(index - 1, arraylist.get(index -1) * 2);
                        arraylist.set(index, arraylist.get(index) * 2);
                        break;
                    case '#' :
                        arraylist.set(index, -arraylist.get(index));
                        break;
                }
            }
        }
        for (int i :
                arraylist) {
            answer += i;
        }
        
        return answer;
    }
}
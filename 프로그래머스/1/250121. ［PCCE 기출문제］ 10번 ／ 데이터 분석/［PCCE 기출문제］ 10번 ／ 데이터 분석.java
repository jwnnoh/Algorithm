import java.util.*;

class Solution {
        public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();

        int val = sort(ext);
        for (int[] i : data) {
            if (i[val] < val_ext) {
                answer.add(i);
            }
        }

        int sort = sort(sort_by);
        answer.sort((int[] o1, int[] o2) ->
        {
            return Integer.compare(o1[sort], o2[sort]);
        });

        return answer;
    }

    public int sort(String ext) {
        if (ext.equals("code")) {
            return 0;
        }
        if (ext.equals("date")) {
            return 1;
        }
        if (ext.equals("maximum")) {
            return 2;
        }
        return 3;
    }
}
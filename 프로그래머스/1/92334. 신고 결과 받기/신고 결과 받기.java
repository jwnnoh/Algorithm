import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> reportedName = new HashMap<>();
        for (String name : id_list) {
            reportedName.put(name, new ArrayList<>());
        }
        
        for(String r : report) {
            String[] s = r.split(" ");
            String reporter = s[0];
            String reported = s[1];
            
            if (!reportedName.get(reporter).contains(reported)) {
                if (!reportCount.containsKey(reported)) { //신고 회수 저장
                reportCount.put(reported, 1);
            } else {
                reportCount.replace(reported, reportCount.get(reported) + 1);
            }
            
            reportedName.get(reporter).add(reported);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            List<String> list = reportedName.get(name);
            
            for (String s : list) {
                if (reportCount.get(s) >= k) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}

// 동일한 유저에 대한 신고 횟수는 1회로 처리 -> map?
// k번 이상 신고된 유저는 이용 정지, 신고한 모든 유저에게 메일 발송 -> logic의 맨 마지막
// 동일한 유저에 대한 신고는 1회로 처리 -> contains?
// 메일 받은 횟수를 id_list 순서대로 반환 -> id_list 순회하면서 count++
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String name : callings) {
            int current = map.get(name);
            String tmp = players[current-1];
            
            map.replace(tmp, current);
            players[current] = tmp;

            map.replace(name, current-1);
            players[current-1] = name;
        }
        return players;
    }
}
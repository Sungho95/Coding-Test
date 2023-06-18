import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String player : callings) {
            int idx = map.get(player);
            String frontPlayer = players[idx - 1];
            
            players[idx - 1] = player;
            players[idx] = frontPlayer;
            
            map.put(player, idx - 1);
            map.put(frontPlayer, idx);
        }
        
        return players;
    }
}
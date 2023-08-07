import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> reportedMap = new HashMap<>();
        Map<String, Integer> answerMap = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportSet = new HashSet<>();
            reportedMap.put(id_list[i], reportSet);
            answerMap.put(id_list[i], 0);
        }
        
        
        for (String s : report) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            reportedMap.get(reported).add(reporter);
        }
        
        for (String reported : reportedMap.keySet()) {
            HashSet<String> check = reportedMap.get(reported);
            
            if (check.size() >= k) {
                for (String s : check) {
                    answerMap.put(s, answerMap.get(s) + 1);
                }
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
        }
        
        return answer;
    }
}
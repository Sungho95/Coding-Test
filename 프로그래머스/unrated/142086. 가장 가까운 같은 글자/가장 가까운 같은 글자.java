import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                answer[i] = -1;
                list.add(s.charAt(i));
                continue;
            }
            
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                count++;
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = count;
                    break;
                }
            }
        }
        return answer;
    }
}
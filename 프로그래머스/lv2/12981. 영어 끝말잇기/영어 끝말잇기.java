import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int turn = 2;
        int round = 1;
        String previous = words[0];
        
        List<String> check = new ArrayList<>();
        check.add(previous);
        
        for (int i = 1; i < words.length; i++) {
            String current = words[i];
            
            if (current.length() <= 1) break;
            if (check.contains(current)) break;
            if (previous.charAt(previous.length() - 1) != current.charAt(0)) break;
            
            turn++;
            previous = current;
            check.add(previous);
            if (turn > n) {
                turn = 1;
                round++;
            }
            
            if (i == words.length - 1) {
                turn = 0;
                round = 0;
            }
            
        }
        
        answer[0] = turn;
        answer[1] = round;
        

        return answer;
    }
}
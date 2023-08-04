import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < type.length; i++) {
            map.put(type[i], 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] < 4) {
                map.replace(left, map.get(left) + (4 - choices[i]));
            } else {
                map.replace(right, map.get(right) + (choices[i] - 4));
            }
        }

        for (int i = 0; i < type.length; i += 2) {
            char left = type[i];
            char right = type[i+1];
            if (map.get(left) > map.get(right)) {
                answer += left;
            } else if (map.get(left) == map.get(right)) {
                answer += left;
            } else {
                answer += right;
            }
        }

        return answer;
    }
}
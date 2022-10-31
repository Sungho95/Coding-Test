import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < type.length; i++) {
            hashMap.put(type[i], 0);
        }
        System.out.println(hashMap);
        // ["AN", "CF", "MJ", "RT", "NA"]
        // [5, 3, 2, 7, 5]
        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] < 4) {
                hashMap.replace(left, hashMap.get(left) + (4 - choices[i]));
            } else {
                hashMap.replace(right, hashMap.get(right) + (choices[i] - 4));
            }
        }
        System.out.println(hashMap);
        // {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}
        for (int i = 0; i < type.length; i += 2) {
            char left = type[i];
            char right = type[i+1];
            if (hashMap.get(left) > hashMap.get(right)) {
                answer += left;
            } else if (hashMap.get(left) == hashMap.get(right)) {
                answer += left;
            } else {
                answer += right;
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 한 상자에 m개
        // k = 4, m = 3
        // [4 1 2 2 4 4 4 4 1 2 4 2]
        // 4 4 4  12
        // 4 4 4  12
        // 2 2 2  6
        // 2 1 1  3
        // 12 + 12 + 6 + 3 = 33
        // k = 3 m = 4
        // 1231231
        Integer[] scoreDesc = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreDesc, Collections.reverseOrder());
        
        for (int i = m-1; i < scoreDesc.length; i+=m) {
            answer += scoreDesc[i] * m;
        }
        
        return answer;
    }
}
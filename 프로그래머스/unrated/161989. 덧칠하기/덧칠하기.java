import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int end = section[0] + m - 1;
        
        for (int i : section) {
            if (i > end) {
                end = i + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}
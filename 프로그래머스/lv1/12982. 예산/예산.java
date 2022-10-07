import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                answer += 1;
                budget -= d[i];
            }
        }
        
        return answer;
    }
}
    // answer = 0
    // d.sort()
    // for i in range(len(d)):
    //     if budget >= d[i]:
    //         budget -= d[i]
    //         answer += 1
    // return answer
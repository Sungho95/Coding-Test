import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] work = new int[100];
        int day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            work[day]++;
        }
        
        return Arrays.stream(work).filter(i -> i != 0).toArray();
    }
}
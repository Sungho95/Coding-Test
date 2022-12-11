import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        // [2, 1, 3, 2], location = 2
        // [3, 2, 2, 1]
        // 
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : priorities) {
            queue.add(i);
        }
        
        while(!queue.isEmpty()) {
            
            for (int i = 0; i < priorities.length; i++) {
                
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    
                    if (location == i) return answer;
                }
            }
        }
        
        return answer;
    }
}
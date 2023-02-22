import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
        public int solution(int[] priorities, int location) {
        // 우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}
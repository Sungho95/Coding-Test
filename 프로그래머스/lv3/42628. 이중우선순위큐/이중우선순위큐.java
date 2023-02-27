import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        // 최소 힙과 최대 힙 선언
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation);
            String type = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            // I인 경우 숫자를 큐에 삽입
            if (type.equals("I")) {
                minPq.offer(value);
                maxPq.offer(value);
            } else { // type이 I가 아닌 경우
                if (value < 0) { // 최솟값 삭제
                    if (!minPq.isEmpty()) {
                        maxPq.remove(minPq.poll());
                    }
                } else { // 최댓값 삭제
                    if (!maxPq.isEmpty()) {
                        minPq.remove(maxPq.poll());
                    }
                }
            }
        }

        if (!minPq.isEmpty()) {
            answer[0] = maxPq.poll();
            answer[1] = minPq.poll();
        }

        return answer;
    }
}
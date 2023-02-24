import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        /**
         * [작업의 요청 시점, 작업의 소요 시간]
         * jobs = {{0, 3}, {1, 9}, {2, 6}
         */
        int answer = 0;
        int end = 0; // 작업의 수행 직후 시간
        int idx = 0; // jobs 배열의 인덱스
        int count = 0; // 수행된 작업 개수

        // 우선순위 큐 : 작업의 소요 시간을 기준으로 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        // jobs 배열 : 작업의 요청 시점을 기준으로 오름차순 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 작업이 끝날 때 까지 순회
        while (count < jobs.length) {

            while (idx < jobs.length && jobs[idx][0] <= end) {
                pq.offer(jobs[idx++]);
            }

            if (pq.isEmpty()) {
                 end = jobs[idx][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }
}
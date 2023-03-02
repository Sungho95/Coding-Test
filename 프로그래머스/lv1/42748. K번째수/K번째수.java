import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 결과를 담을 answer 배열
        int[] answer = new int[commands.length];
        int idx = 0;

        // i, j, k를 담은 배열 순회
        for (int[] command : commands) {
            // i - 1 번째 인덱스부터 j 까지
            int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(temp);

            // k번째 수
            answer[idx] = temp[command[2] - 1];
            idx++;
        }

        return answer;
    }
}
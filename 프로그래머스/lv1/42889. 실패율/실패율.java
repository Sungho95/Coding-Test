import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 = 도달했으나 클리어 못한사람 / 스테이지에 도달한 사람
        // N = 전체 스테이지 수, stages = 현재 멈춰있는 스테이지 번호

        // N = 5, stages = [2, 1, 2, 6, 2, 4, 3, 3]
        // result = [3, 4, 2, 1, 5]

        int[] currentStages = new int[N + 1];
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            // 스테이지에 도달한 플레이어 수
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            // 도달 했으나 클리어하지 못한 플레이어 수
            currentStages[stages[i] - 1] += 1;
        }

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}

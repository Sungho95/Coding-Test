import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 여벌 가져온 사람
        for (int i : reserve) {
            reserveSet.add(i);
        }

        for (int i : lost) {
            // 여벌 가져온 사람이 잃어버린 경우
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 잃어버린 사람에게 빌려줄 수 있는 경우
        for (Integer i : reserveSet) {
            if (lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            } else if (lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }

        return n - lostSet.size();
    }
}
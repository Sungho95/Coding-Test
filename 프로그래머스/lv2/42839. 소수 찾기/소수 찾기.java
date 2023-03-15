import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;

        recursive("", numbers, set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            if (isPrime(it.next())) {
                answer++;
            }
        }

        return answer;
    }

    /**
     * 소수 판별 메서드
     */
    public boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 순열
     */
    public void recursive(String prefix, String str, Set<Integer> set) {
        if (!prefix.equals("")) {
            set.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < str.length(); i++) {
            recursive(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), set);
        }
    }
}
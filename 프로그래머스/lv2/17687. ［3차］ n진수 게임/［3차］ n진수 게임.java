class Solution {
    public String solution(int n, int t, int m, int p) {
        /*
        n : n진법
        t : 미리 구해야할 숫자의 개수
        m : 게임에 참가하는 인원
        p : 튜브의 순서
        */
        StringBuilder nums = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; nums.length() <= t * m; i++) {
            nums.append(Integer.toString(i, n).toUpperCase());
        }

        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(nums.charAt(i));
        }

        return answer.toString();
    }
}
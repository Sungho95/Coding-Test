class Solution {
    final int NUMBER_OF_ALPHABET = 26;

    public int solution(String name) {
        int answer = 0;

        int idx;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            // 위로 조작 : ch - 'A'
            // 아래 조작 : 26 - ch - 'A'
            answer += Math.min(ch - 'A', NUMBER_OF_ALPHABET - (ch - 'A'));

            idx = i + 1;
            while (idx < name.length() && name.charAt(idx) == 'A') {
                idx++;
            }

            move = Math.min(move, i * 2 + (name.length() - idx));
            move = Math.min(move, i + (name.length() - idx) * 2);
        }

        return answer + move;
    }
}
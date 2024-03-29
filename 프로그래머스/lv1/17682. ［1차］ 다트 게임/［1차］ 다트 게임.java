class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                idx++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++;
                } else {
                    score[idx] = c - '0';
                }
            } else if (c == 'D') {
                score[idx] *= score[idx];
            } else if (c == 'T') {
                score[idx] *= score[idx] * score[idx];
            } else if (c == '*') {
                score[idx] *= 2;
                if (idx > 0) score[idx - 1] *= 2;
            } else if (c == '#') {
                score[idx] *= -1;
            }
        }

        return score[0] + score[1] + score[2];
    }
}
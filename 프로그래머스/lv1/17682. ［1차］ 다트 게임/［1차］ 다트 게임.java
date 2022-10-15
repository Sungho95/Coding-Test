import java.util. *;

class Solution {
    public int solution(String dartResult) {
        /*
        S = 1제곱, D = 2제곱, T = 3제곱
        * = 해당 점수와 이전 점수 2배
        # = 해당 점수 -
        *은 첫 번째 기회에서도 나올 수 있음(해당 점수만 2배)
        *은 *과 중첩 가능 해당 점수 4배
        *과 #은 중첩 가능 해당 점수 -2배
        */
        
        // 라운드당 점수를 담을 배열
        int[] score = new int[3];
        // toCharArray() : String -> char 배열
        char[] arr = dartResult.toCharArray();
        // score 인덱스
        int idx = -1;
        
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            // 숫자 판별
            // [1, 0, S]
            // [10]
            if (arr[i] == '1' && arr[i + 1] == '0') {
                idx++;
                score[idx] = 10;
                i++;
                continue;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                idx++;
                score[idx] = Integer.parseInt(String.valueOf(arr[i]));
                continue;
            }
            
            switch (arr[i]) {
                case 'D':
                    score[idx] = (int) Math.pow(score[idx], 2);
                    break;
                case 'T':
                    score[idx] = (int) Math.pow(score[idx], 3);
                    break;
                case '*':
                    score[idx] *= 2;
                    if (idx - 1 >= 0) score[idx - 1] *= 2;
                    break;
                case '#':
                    score[idx] *= -1;
            }
        }
            
        return score[0] + score[1] + score[2];
    }
}
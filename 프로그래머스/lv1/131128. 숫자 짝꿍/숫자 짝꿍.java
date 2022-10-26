import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 짝궁이 존재하지 않으면 -1
        // 짝궁이 0으로만 구성되어 있다면 0
        // x = 3403, y = 13203
        // list = [3, 0, 3], result = 330
        StringBuilder answer = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        countNumInArr(X, arrX);
        countNumInArr(Y, arrY);
        
        for (int i = arrX.length - 1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;
                
                answer.append(i);
            }
        }
        
        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.toString().startsWith("0")) {
            return "0";
        } else {
            return answer.toString();
        }
    }
    
    private void countNumInArr(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}
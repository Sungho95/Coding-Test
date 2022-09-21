import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
//         String str = String.valueOf(n);
        
//         for (int i = 0; i < str.length(); i++) {
//             answer += str.charAt(i) - '0';
//         }

        return answer;
    }
}
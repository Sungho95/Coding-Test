import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }
        
        int[] answer = arrList.stream()
            .mapToInt(i -> i)
            .toArray();
        Arrays.sort(answer);
        
//         int[] answer = new int[arrList.size()];
        
//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = arrList.get(i);
//         }
//         Arrays.sort(answer);
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
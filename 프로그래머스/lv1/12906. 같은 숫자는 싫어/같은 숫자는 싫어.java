import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.empty() || !stack.peek().equals(i)) {
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
    
//     public int[] solution(int []arr) {
//         ArrayList<Integer> list = new ArrayList<>();
        
//         list.add(arr[0]);
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] == arr[i]) {
//                 continue;
//             } else {
//                 list.add(arr[i]);
//             }
//         }

//         return list.stream().mapToInt(i -> i).toArray();
//     }
}
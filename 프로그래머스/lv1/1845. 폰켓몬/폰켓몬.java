import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // [3, 1, 2, 3]
        // 2
        
        // 최대 가져갈 수 있는 포켓몬
        int possible = nums.length / 2;
        // 중복 제거
        nums = Arrays.stream(nums)
            .distinct()
            .toArray();
        
        // 최대 종류
        int value = nums.length;
        
        if (possible >= value) return value;
        else return possible; 
    }
}
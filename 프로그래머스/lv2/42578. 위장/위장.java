import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (String[] clothe : clothes) {
            hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1);
        }
        
        Iterator<Integer> it = hashMap.values().iterator();
        
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        
        return answer-1;
    }
}
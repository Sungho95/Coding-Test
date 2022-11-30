import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        s = s.substring(2, s.length()- 2).replace("},{", "-");
        String[] sArr = s.split("-");
        
        Arrays.sort(sArr, (a, b) -> Integer.compare(a.length(), b.length()));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String el : sArr) {
            String[] check = el.split(",");
            
            for (int i = 0; i < check.length; i++) {
                int num = Integer.parseInt(check[i]);
                
                if (!list.contains(num)) list.add(num);
            }
        }
        
        return list;
    }
}
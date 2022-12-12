import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        List<String> list1 = stringSplit(str1);
        List<String> list2 = stringSplit(str2);

        if (list1.size() == 0 && list2.size() == 0) return 65536;
        
        List<String> union = new ArrayList<>();
        List<String> inter = new ArrayList<>();
        
        for (String s : list1) {
            if (list2.remove(s)) {
                inter.add(s);
            }
            union.add(s);
        }
        
        for (String s : list2) {
            union.add(s);
        }
        
        double jakard = (double) inter.size() / (double) union.size();
        return (int) (jakard * 65536);
        
    }
    
    public List<String> stringSplit(String str) {
        List<String> list = new ArrayList<>();
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.substring(i, i + 2).replaceAll("[^a-z]", "");
            if (s.length() < 2) continue;
            list.add(s);
        }
        
        return list;
    }
    
}
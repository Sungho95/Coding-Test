import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            
            if (str.equals(" ")) sb.append(str);
            else {
                String first = str.substring(0, 1).toUpperCase();
                String others = str.substring(1);
                
                sb.append(first);
                sb.append(others);
            }
        }
        
        return sb.toString();
    }
}
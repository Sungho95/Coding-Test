class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            
            int idx = 0;
            while (idx < index) {
                if (ch == 'z') {
                    ch = 'a';
                } else {
                    ch++;
                }
                
                if (!skip.contains(String.valueOf(ch))) {
                    idx++;
                }
            }
            
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int x = 1;
        int notX = 0;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length() - 1; i++) {
            
            if (x == 0) {
                ch = s.charAt(i);
                x++;
                continue;
            }
            
            if (ch == s.charAt(i)) x++;
            else notX++;
            
            if (x == notX) {
                answer++;
                x = 0;
                notX = 0;
            }
        }
        
        answer++;
        
        return answer;
    }
}
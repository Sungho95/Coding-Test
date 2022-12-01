class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int x = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (x == 0) {
                ch = s.charAt(i);
                x++;
                continue;
            }
            
            if (ch == s.charAt(i)) x++;
            else x--;
            
            if (x == 0) answer++;
        }
        
        if (x != 0) answer++;
                
        return answer;
    }
}
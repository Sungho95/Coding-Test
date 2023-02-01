class Solution {
    public long solution(int a, int b) {
        
//         long x = Math.max(a, b);
//         long y = Math.min(a, b);
        
//         return (x - y + 1) * (x + y) / 2;
        
        // #2
//         long answer = 0;
        
//         for (int i = Math.min(a, b); i <= Math.max(a, b); i++) answer += i;
        
//         return answer;
        
        // #3
        long answer = 0;
        int temp = a;
        
        if (a > b) {
            a = b;
            b = temp;
        }
        
        for (int i = a; i <= b; i++) answer += i;
        
        return answer;
    }
}
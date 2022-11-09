class Solution {
    public int[] solution(String s) {
        // 2진수 -> 10진수 Integer.parseInt(num, 2)
        // 10진수 -> 2진수 Integer.toBinaryString(num)
        int[] answer = new int[2];
        
        while (s.length() > 1) {
            int one = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') answer[1]++;
                else one++;
            }
            s = Integer.toBinaryString(one);
            answer[0]++;
        }
        
        return answer;
    }
}
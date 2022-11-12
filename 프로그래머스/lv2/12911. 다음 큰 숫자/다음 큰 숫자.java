class Solution {
    public int solution(int n) {
        int count = nToBinaryCount(n);
        int answer = n;
        
        while (true) {
            answer++;
            if (count == nToBinaryCount(answer)) break;
        }
        
        return answer;
    }
    
    int nToBinaryCount(int n) {
        String nToBinary = Integer.toBinaryString(n);
        int count = 0;
        char[] nToBinaryArr = nToBinary.toCharArray();
        
        for (char ch : nToBinaryArr) {
            if (ch == '1') count++;
        }
        
        return count;
    }
}
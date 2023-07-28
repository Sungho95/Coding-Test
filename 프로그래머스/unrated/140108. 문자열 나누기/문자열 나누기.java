class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int count = 1; // 현재 문자의 개수를 기록하는 변수
        char prevChar = s.charAt(0); // 이전 문자를 기록하는 변수
        
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i); // 현재 문자를 가져옴
            
            if (count == 0) {
                prevChar = currentChar;
                count++;
                continue;
            }
            
            if (prevChar == currentChar) {
                count++; // 이전 문자와 현재 문자가 같으면 count 증가
            } else {
                count--; // 이전 문자와 현재 문자가 다르면 count 감소
            }
            
            if (count == 0) {
                answer++; // count가 0이 되면 하나의 덩어리가 완성되었으므로 answer 증가
            }
        }
        
        if (count != 0) {
            answer++; // 남아있는 문자가 하나의 덩어리를 이루므로 answer 증가
        }
                
        return answer;
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 연속으로 같은 발음은 하지 못한다.
        // 네 가지 발음 외에는 하지 못한다.
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        
        
        for (String element : babbling) {
            // 연속된 발음은 X로 변환
            for (String check : impossible) {
                element = element.replace(check, "X");
            }
            
            // 가능한 발음을 O로 변환
            for (String check : possible) {
                element = element.replace(check, "O");
            }
            
            int check = 0;
            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) != 'O') {
                    check++;
                    break;
                }
            }
            
            if (check == 0) answer++;
        }
        
        return answer;
    }
}
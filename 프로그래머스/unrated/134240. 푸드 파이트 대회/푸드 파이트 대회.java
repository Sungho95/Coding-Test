class Solution {
    public String solution(int[] food) {
        
        String answer = "";
        String temp = "";
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
                temp = i + temp; 
            }
        }
        answer += "0" + temp;
        
        return answer;
    }
}
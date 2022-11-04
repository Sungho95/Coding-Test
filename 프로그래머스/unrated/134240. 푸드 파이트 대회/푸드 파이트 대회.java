class Solution {
    public String solution(int[] food) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            str.append(String.valueOf(i).repeat(count));
        }
        
        String answer = str + "0";
        answer += str.reverse();
        
        return answer;
    }
}
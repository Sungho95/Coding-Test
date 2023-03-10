class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        // 카펫의 가로와 세로의 길이는 최소 3
        // 카펫의 가로 길이는 세로 길이와 같거나 세로 길이보다 길어야함.
        for (int i = 3; i < sum; i++) {
            int row = i;
            int col = sum / row;
            
            if (row > col) continue;
            
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                
                return answer;
            } 
        }
        
        return answer;
    }
}
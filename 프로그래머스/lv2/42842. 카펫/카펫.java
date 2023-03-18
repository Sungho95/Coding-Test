class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 총 격자 수
        int sum = brown + yellow;

        // 노란색 격자 수는 1이상, 열은 3부터 시작하게 됨
        for (int i = 3; i < sum; i++) {
            int row = i;
            int col = sum / row;
            
            // 가로의 길이가 세로보다 짧으면 안됨
            if (row > col) continue;
            
            // 가로와 세로의 -2하여 곱한 것이 노란색 격자의 개수
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                break;
            } 
        }
    
        return answer;
    }
}
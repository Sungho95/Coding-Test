import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // 뽑은 인형을 담을 스택
        Stack<Integer> stack = new Stack<>();
        
        for (int move : moves) {
            int col = move - 1;
            // board 길이만큼 반복
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] == 0) continue;
                
                // 스택이 비어있지 않은 상태이고
                // 스택의 최상단 값과 보드의 값이 같은 경우
                if (!stack.isEmpty() && stack.peek() == board[i][col]) {
                    stack.pop();
                    board[i][col] = 0;
                    answer += 2;
                    break;
                } else {
                    // 인형 뽑기
                    stack.push(board[i][col]);
                    board[i][col] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
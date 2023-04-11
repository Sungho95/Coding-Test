import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int idx = n;
        int[][] matrix = new int[idx][idx];
        
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0] - 1;
            int b = wires[i][1] - 1;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0]-1;
            int b = wires[i][1]-1;
            matrix[a][b] = 0;
            matrix[b][a] = 0;

            boolean[] visited = new boolean[idx];
            int nodeCount = 0;

            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            visited[0] = true;

            while(!stack.isEmpty()){
                int node = stack.pop();
                nodeCount++;

                for(int j=0; j<idx; j++){
                    if(matrix[node][j] == 1 && !visited[j]){
                        stack.push(j);
                        visited[j] = true;
                    }
                }
            }

            matrix[a][b] = 1;
            matrix[b][a] = 1;

            answer = Math.min(answer, Math.abs(n - nodeCount * 2));
        }
        
        return answer;
    }
}
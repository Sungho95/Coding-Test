import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] matrix;
    private static int[][] dp;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            matrix = new int[n][n];
            dp = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split("");
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(input[j]);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }

            dijkstra(0, 0);
            System.out.println("#" + test_case + " " + dp[n - 1][n - 1]);
        }
    }

    private static void dijkstra(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        dp[x][y] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isPossible(nx, ny)) {
                    if (dp[nx][ny] > dp[node.x][node.y] + matrix[nx][ny]) {
                        dp[nx][ny] = dp[node.x][node.y] + matrix[nx][ny];
                        queue.add(new Node(nx, ny));
                    }
                }
            }
        }
    }

    private static boolean isPossible(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < matrix.length && ny < matrix.length;
    }

    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
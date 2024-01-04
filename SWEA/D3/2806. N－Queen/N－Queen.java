import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    private static int n;
    private static int[] board;
    private static int count;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(br.readLine());
            board = new int[n];
            count = 0;

            nQueen(n, 0);

            System.out.println("#" + test_case + " " + count);
        }
    }

    private static void nQueen(int n, int start) {
        if (start == n) {
            count++;
            return;
        }

        for (int x = 0; x < n; x++) {
            boolean isPossible = true;
            for (int y = 0; y < start; y++) {
                if (x == board[y] || x == board[y] + (start - y) || x == board[y] - (start - y)) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                board[start] = x;
                nQueen(n, start + 1);
            }
        }
    }
}
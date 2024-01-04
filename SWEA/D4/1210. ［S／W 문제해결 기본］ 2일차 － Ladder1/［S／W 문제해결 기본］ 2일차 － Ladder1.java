import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static final int N = 100;
    private static int[][] matrix;
    private static final int[] dx = {0, 0, -1};
    private static final int[] dy = {1, -1, 0};
    private static int x;
    private static int y;
    private static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int test_case = 1; test_case <= 10; test_case++) {
            int tc = Integer.parseInt(br.readLine());
            matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());

                    if (matrix[i][j] == 2) {
                        x = i;
                        y = j;
                    }
                }
            }

            ladder(x, y);
            System.out.println("#" + tc + " " + result);
        }
    }

    private static void ladder(int x, int y) {
        while (true) {
            if (x == 0) {
                result = y;
                break;
            }

            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && matrix[nx][ny] == 1) {
                    matrix[x][y] = 0;
                    x = nx;
                    y = ny;
                }
            }
        }
    }
}
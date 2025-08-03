import java.io.*;
import java.util.*;

public class Main {
    static int n, m, x, y, k;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] matrix;
    static int[] commands;
    static int[] dice = new int[6];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        commands = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            commands[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        br.close();

        solve();
    }

    static void solve() {
        for (int i = 0; i < k; i++) {
            int nx = x + dx[commands[i]];
            int ny = y + dy[commands[i]];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                continue;
            }

            useDice(commands[i]);
            System.out.println(dice[0]);

            x = nx;
            y = ny;

            if (matrix[x][y] == 0) {
                matrix[x][y] = dice[5];
            } else {
                dice[5] = matrix[x][y];
                matrix[x][y] = 0;
            }
        }
    }

    static void useDice(int num) {
        int temp = dice[5];
        switch (num) {
            case 0:
                dice[5] = dice[2];
                dice[2] = dice[0];
                dice[0] = dice[3];
                dice[3] = temp;
                break;
            case 1:
                dice[5] = dice[3];
                dice[3] = dice[0];
                dice[0] = dice[2];
                dice[2] = temp;
                break;
            case 2:
                dice[5] = dice[4];
                dice[4] = dice[0];
                dice[0] = dice[1];
                dice[1] = temp;
                break;
            case 3:
                dice[5] = dice[1];
                dice[1] = dice[0];
                dice[0] = dice[4];
                dice[4] = temp;
                break;
            default:
                break;
        }
    }
}

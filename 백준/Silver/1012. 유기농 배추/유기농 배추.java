import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] matrix;
    static boolean[][] visit;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            matrix = new int[M][N];
            visit = new boolean[M][N];

            K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                matrix[p1][p2] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (matrix[x][y] == 1 && !visit[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (!visit[nx][ny] && matrix[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

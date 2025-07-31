import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] board;
    static Map<Integer, Character> map = new HashMap<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int k;
    static int l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        board = new boolean[n][n];

        StringTokenizer st;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = true;
        }

        l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            map.put(x, c);
        }

        solve();
    }

    static void solve() {
        Queue<int[]> queue = new LinkedList<>();

        int time = 0;
        int direction = 0;
        int x = 0;
        int y = 0;

        queue.add(new int[]{x, y});

        while (true) {
            time++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                break;
            }

            if (isContains(queue, nx, ny)) {
                break;
            }

            queue.add(new int[]{nx, ny});

            if (board[ny][nx]) {
                board[ny][nx] = false;
            } else {
                queue.poll();
            }

            if (map.containsKey(time)) {
                char c = map.get(time);

                if (c == 'L') {
                    direction = (direction + 3) % 4;
                } else if (c == 'D') {
                    direction = (direction + 1) % 4;
                }
            }

            x = nx;
            y = ny;
        }

        System.out.println(time);
    }

    private static boolean isContains(Queue<int[]> queue, int x, int y) {
        for (int[] q : queue) {
            if (q[0] == x && q[1] == y) {
                return true;
            }
        }

        return false;
    }
}
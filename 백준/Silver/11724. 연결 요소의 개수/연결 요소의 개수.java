import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void dfs(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
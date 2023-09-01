import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(dynamic(n, k));
    }

    private static int dynamic(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        
        if (dp[n][k] > 0) {
            return dp[n][k];
        }
        
        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = dynamic(n - 1, k - 1) + dynamic(n - 1, k);
    }
}
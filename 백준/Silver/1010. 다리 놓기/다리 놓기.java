import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int[][] dp = new int[31][31];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(combination(m, n));
        }
    }

    private static int combination(int n, int r) {
        
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        
        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
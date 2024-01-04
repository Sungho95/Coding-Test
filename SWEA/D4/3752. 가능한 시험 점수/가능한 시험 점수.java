import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[] scores = new int[N];
            int sum = 0;

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                sum += scores[i];
            }

            boolean[] dp = new boolean[sum + 1];
            dp[0] = true;
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = sum; j >= 0; j--) {
                    if (dp[j]) {
                        dp[j + scores[i]] = true;
                    }
                }
            }

            for (int i = 0; i < dp.length; i++) {
                if (dp[i]) {
                    count++;
                }
            }

            System.out.println("#" + test_case + " " + count);
        }
    }
}

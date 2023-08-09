import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        int gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            int distance = trees[i + 1] - trees[i];
            gcd = gcd(distance, gcd);
        }
        
        sb.append((trees[n - 1] - trees[0]) / gcd + 1 - (trees.length));
        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
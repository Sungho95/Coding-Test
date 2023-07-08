import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(nToBDecimal(n, b));
    }

    private static String nToBDecimal(int n, int b) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            if (n % b < 10) {
                sb.append((char) (n % b + '0'));
            } else {
                sb.append((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        return sb.reverse().toString();
    }
}
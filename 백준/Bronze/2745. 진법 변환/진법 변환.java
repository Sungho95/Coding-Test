import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        System.out.println(bDecimalToDecimal(n, b));
    }

    private static int bDecimalToDecimal(String n, int b) {
        int idx = 0;
        int number = 0;
        int result = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);

            if (ch >= 'A') {
                number = ch - 55;
            } else {
                number = ch - '0';
            }

            result += number * Math.pow(b, idx++);
        }
        return result;
    }
}
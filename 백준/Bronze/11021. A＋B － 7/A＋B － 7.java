import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a;
        int b;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sb.append("Case #").append(i).append(": ");
            sb.append(a + b);
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}

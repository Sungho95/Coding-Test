import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (set.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}
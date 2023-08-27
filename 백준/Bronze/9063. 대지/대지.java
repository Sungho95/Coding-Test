import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int xMin = 10000;
        int yMin = 10000;
        int xMax = -10000;
        int yMax = -10000;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int nx = Integer.parseInt(st.nextToken());
            int ny = Integer.parseInt(st.nextToken());

            xMin = Math.min(xMin, nx);
            xMax = Math.max(xMax, nx);
            yMin = Math.min(yMin, ny);
            yMax = Math.max(yMax, ny);
        }

        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}
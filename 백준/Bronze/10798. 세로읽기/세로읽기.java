import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 10798 START
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] ch = new char[5][15];
        int maxLength = 0;

        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine();

            if (maxLength < str.length()) {
                maxLength = str.length();
            }

            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < ch.length; j++) {

                if (ch[j][i] == '\0') {
                    continue;
                }
                sb.append(ch[j][i]);
            }
        }

        System.out.println(sb);
    }
}
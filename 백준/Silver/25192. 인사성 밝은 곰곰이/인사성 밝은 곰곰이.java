import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                set.clear();
                continue;
            }

            if (!set.contains(chat)) {
                set.add(chat);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
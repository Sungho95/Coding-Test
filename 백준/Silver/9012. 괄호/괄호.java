import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String bracket = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < bracket.length(); j++) {
                if (bracket.charAt(j) == '(') {
                    stack.push(bracket.charAt(j));
                } else if (stack.empty()) {
                    stack.push(bracket.charAt(j));
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}
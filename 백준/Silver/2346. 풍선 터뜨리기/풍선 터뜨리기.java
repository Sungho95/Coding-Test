import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Balloon> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(st.nextToken());
            deque.add(new Balloon(i, value));
        }

        while (!deque.isEmpty()) {
            sb.append(deque.peekFirst().number).append(" ");
            int value = deque.poll().value;

            if (!deque.isEmpty()) {
                if (value > 0) {
                    for (int i = 0; i < value - 1; i++) {
                        deque.add(deque.poll());
                    }
                } else {
                    for (int i = 0; i < -value; i++) {
                        deque.addFirst(deque.pollLast());
                    }
                }
            } else {
                break;
            }
        }

        System.out.println(sb);
    }
}

class Balloon {
    int number;
    int value;

    public Balloon(int number, int value) {
        this.number = number;
        this.value = value;
    }
}
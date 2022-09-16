import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {1, 1, 2, 2, 2, 8};
        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] - scanner.nextInt();
            System.out.println(result[i]);
        }
    }
}

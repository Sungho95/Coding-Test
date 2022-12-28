import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i = 1; i < arr.length - 2; i++) {
            int pass = sc.nextInt();
            arr[pass] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) System.out.println(i);
        }

    }
}
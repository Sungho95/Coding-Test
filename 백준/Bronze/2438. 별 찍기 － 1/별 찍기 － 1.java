import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder star = new StringBuilder();

        for (int i = 0; i < n; i++) {
            star.append("*");
            System.out.println(star);
        }
    }
}
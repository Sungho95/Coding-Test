import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "long ";

        s = s.repeat(n / 4);

        System.out.println(s + "int");
    }
}
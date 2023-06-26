import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            String str = sc.next();
            
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length() - 1));

            System.out.println(sb);
        }
    }
}
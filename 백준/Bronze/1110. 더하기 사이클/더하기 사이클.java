import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        int temp = n;

        while (true) {
            int a = temp / 10;
            int b = temp % 10;
            int c = (a + b) % 10;
            temp = (b * 10) + c;
            count++;
            
            if (n == temp) break;
        }
        
        System.out.println(count);
    }
}
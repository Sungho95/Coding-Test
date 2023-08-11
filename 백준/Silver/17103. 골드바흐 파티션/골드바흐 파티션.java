import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] primeNumbers = sieveOfEratosthenes();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            for (int j = 2; j <= n / 2; j++) {
                if (!primeNumbers[j] && !primeNumbers[n - j]) {
                    result++;
                }
            }
            
            System.out.println(result);
        }
    }

    private static boolean[] sieveOfEratosthenes() {
        boolean[] primeNumbers = new boolean[1000001];
        primeNumbers[0] = true;
        primeNumbers[1] = true;

        for (int i = 2; i * i <= 1000000; i++) {
            if (!primeNumbers[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primeNumbers[j] = true;
                }
            }
        }

        return primeNumbers;
    }
}
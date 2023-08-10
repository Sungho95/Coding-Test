import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String n = br.readLine();
            BigInteger bigInteger = new BigInteger(n);

            if (bigInteger.isProbablePrime(10)) {
                System.out.println(n);
            } else {
                System.out.println(bigInteger.nextProbablePrime());
            }
        }
    }
}
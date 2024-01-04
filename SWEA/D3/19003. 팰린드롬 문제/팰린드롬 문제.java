import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int length;
            int count = 0;
            List<String> isNotPalindrome = new ArrayList<>();

            boolean hasPalindrome = false;
            for (int i = 0; i < N; i++) {
                String word = br.readLine();
                if (isPalindrome(word)) {
                    hasPalindrome = true;
                } else {
                    isNotPalindrome.add(word);
                }
            }

            for (String word : isNotPalindrome) {
                String reverse = new StringBuilder(word).reverse().toString();
                if (isNotPalindrome.contains(reverse)) {
                    count++;
                }
            }

            if (hasPalindrome) {
                length = count * M + M;
            } else {
                length = count * M;
            }

            System.out.println("#" + test_case + " " + length);
        }
    }
    
    private static boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder(word).reverse();
        return reverse.toString().equals(word);
    }
}
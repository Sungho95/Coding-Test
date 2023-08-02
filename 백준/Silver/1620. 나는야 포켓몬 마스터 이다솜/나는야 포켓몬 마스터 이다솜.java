import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        Map<String, Integer> strMap = new HashMap<>();
        Map<Integer, String> intMap = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String pokemon = br.readLine();
            strMap.put(pokemon, i);
            intMap.put(i, pokemon);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (isInteger(input)) {
                sb.append(intMap.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(strMap.get(input)).append("\n");
            }
        }
        
        System.out.println(sb);
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
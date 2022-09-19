import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedRead와 BufferedWrite 선언
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // n 입력 받기
        int n = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < n; i++) {
            // 더할 수 입력 받기
            String str = bufferedReader.readLine();
            
            // split()을 통해 문자열 구분 후 int형으로 변환
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);

            // 출력
            bufferedWriter.write(a+b + "\n");
        }
        // 버퍼 비우기
        bufferedWriter.flush();
    }
}
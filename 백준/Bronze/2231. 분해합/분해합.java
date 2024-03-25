import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());//분해합
        br.close();

        int answer = 0;///생성자 = 자연수 - 각 자리 수의 합

        for (int i = 1; i < N; i++) {
            int sumDigit = 0;
            int temp = i;

            while (temp > 0) {
                sumDigit += temp % 10;
                temp /= 10;
            }

            if (i + sumDigit == N) {
                answer = i;
                break; 
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
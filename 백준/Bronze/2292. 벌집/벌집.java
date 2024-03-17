import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start = 2;
        int increment = 6;
        int answer = 1;

        while (start <= N) {
            start += increment;
            increment += 6;
            answer++;
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
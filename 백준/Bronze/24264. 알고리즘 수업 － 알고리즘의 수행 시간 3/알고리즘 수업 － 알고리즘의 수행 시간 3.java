import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //n을 제곱하면 int의 범위를 넘어가므로 long로 받는다
        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n * n + "\n");
        bw.write(Integer.toString(2));

        bw.flush();
        bw.close();
    }
}
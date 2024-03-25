import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());//설탕 Nkg
        br.close();
        int cnt = 0;//봉지수

        cnt += N / 5;
        N %= 5;

        while (N > 0 && cnt >= 0) {
            if (N % 3 == 0) {
                cnt += N / 3;
                N = 0;
            } else {
                cnt--;
                N += 5;
            }
        }
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
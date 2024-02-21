import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                count = i + 1;
            }
        }
        bw.write(max + "\n" + count);

        br.close();
        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                while (N % i == 0) {
                    N /= i;
                    factors.add(i);
                }
            }
        }

        for (int i = 0; i < factors.size(); i++) {
            bw.write(String.valueOf(factors.get(i)) + "\n");
        }

        bw.flush();
        bw.close();
    }

}
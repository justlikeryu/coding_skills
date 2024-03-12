import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        br.close();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                factors.add(i);
            }
        }

        if (K <= factors.size()) {
            bw.write(String.valueOf(factors.get(K - 1)));
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
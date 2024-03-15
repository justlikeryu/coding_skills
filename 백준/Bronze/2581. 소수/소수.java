import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                prime.add(i);
            }
        }

        prime.sort(Comparator.naturalOrder());

        if (!prime.isEmpty()) {
            bw.write(String.valueOf(sum) + "\n");
            bw.write(String.valueOf(prime.get(0)));
        } else {
            bw.write("-1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
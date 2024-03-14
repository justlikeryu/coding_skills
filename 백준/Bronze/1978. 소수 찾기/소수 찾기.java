import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(nums[i]);

            if (isPrime(a)) {
                sum++;
            }
        }

        bw.write(String.valueOf(sum));

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
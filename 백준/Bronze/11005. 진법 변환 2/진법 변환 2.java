import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] number = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//10진법 수 N
        int B = Integer.parseInt(st.nextToken());//B진법

        StringBuilder result = new StringBuilder();
        while (N > 0) {
            int remainder = N % B;
            if (remainder >= 10) {
                result.insert(0, alphabet[remainder - 10]);
            } else {
                result.insert(0, remainder);
            }
            N /= B;
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
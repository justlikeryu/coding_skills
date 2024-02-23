import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//바구니 개수
        int M = Integer.parseInt(st.nextToken());//시행 횟수

        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken()) - 1;
            int right = Integer.parseInt(st.nextToken()) - 1;

            while (left < right) {
                int temp = basket[left];
                basket[left++] = basket[right];
                basket[right--] = temp;
            }
        }

        for (int b : basket) {
            bw.write(b + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
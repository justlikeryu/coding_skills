import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//바구니갯수
        int[] basket = new int[N];
        int M = Integer.parseInt(st.nextToken());//공번호

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            
            int temp = basket[I - 1];
            basket[I - 1] = basket[J - 1];
            basket[J - 1] = temp;
        }

        for (int k = 0; k < basket.length; k++) {
            bw.write(basket[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
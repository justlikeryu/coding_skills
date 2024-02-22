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

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());//I번 바구니부터
            int J = Integer.parseInt(st.nextToken());//J번 바구니까지
            int K = Integer.parseInt(st.nextToken());//K번공 넣기

            for (int j = I - 1; j < J; j++) {
                basket[j] = K;
            }
        }

        for (int k = 0; k < basket.length; k++) {
            bw.write(basket[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
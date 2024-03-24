import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//주어진 카드수
        int M = Integer.parseInt(st.nextToken());//최대합

        ArrayList<Integer> cards = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            for (int i = 0; i < N; i++) {
                int card = Integer.parseInt(st.nextToken());
                cards.add(card);
            }
        }
        br.close();

        int maxSum = 0;//카드 3장의 합계

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(maxSum));
        
        bw.flush();
        bw.close();
    }
}
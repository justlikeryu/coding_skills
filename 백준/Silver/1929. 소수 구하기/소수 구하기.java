import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //M이상 N 이하의 소수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        //N까지의 숫자 중 소수 여부 판별하는 조건식
        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        //2부터 시작하여 각 숫자의 배수들을 제거한다
        //i*i가 N보다 작거나 같은 경우에만 반복하는 이유는, N의 제곱근보다 큰 배수들은 그 전에 처리되었기 때문.
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //주어진 M과 N사이의 숫자를 순회하는 반복문
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
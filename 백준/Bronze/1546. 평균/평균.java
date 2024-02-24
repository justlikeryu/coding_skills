import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 과목수
        double max = 0; // 최댓값
        double sum = 0; // 점수 합계

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            double score = Double.parseDouble(st.nextToken());

            if (score > max) {
                max = score;
            }
            sum += score;
        }

        double avg = (sum / max) * 100 / N;
        System.out.println(avg);

        br.close();
    }
}
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        //키: 숫자 값: 숫자 카드의 개수
        HashMap<Integer, Integer> card = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            //getOrDefault: 지정된 키에 매핑된 값을 반환한다.
            //이미 숫자가 존재한다면 해당 숫자의 개수를 가져와서 +1을 한다.
            //숫자가 처음 등장한 경우라면 기본값인 0에 1을 더하여 1로 설정한다.
            card.put(num, card.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            //숫자 num에 대응하는 값을 반환하고 존재하지 않는 숫자라면 기본값인 0을 반환한다.
            bw.write(card.getOrDefault(num, 0) + " ");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
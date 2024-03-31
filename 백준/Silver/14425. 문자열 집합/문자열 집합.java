import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> str = new HashSet<>();
        for (int i = 0; i < N; i++) {
            str.add(br.readLine().trim());
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            String input = br.readLine().trim();
            if (str.contains(input)) {
                cnt++;
            }
        }
        br.close();

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
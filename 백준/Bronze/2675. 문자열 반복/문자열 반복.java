import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());//테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());//반복 횟수
            String S = st.nextToken();//문자열

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);

                for (int k = 0; k < R; k++) {
                    bw.write(ch);
                }
            }
            bw.newLine();
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
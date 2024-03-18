import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());//나무 높이

        int oneday = 0;//하루에 오른 높이
        int cnt = (V - B) / (A - B);//걸린 일수

        if ((V - B) % (A - B) != 0) cnt++;

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
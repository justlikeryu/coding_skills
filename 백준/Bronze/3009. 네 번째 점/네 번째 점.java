import java.awt.*;
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Point> points = new HashSet<>();//HashSet은 중복된 요소를 허용하지 않는다

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new Point(x, y));
        }
        br.close();

        int fourthX = 0;
        int fourthY = 0;
        for (Point point : points) {
            //XOR연산은 비트 단위로 두 값을 비교해 같은 비트에 대해 같은 값을 가지면 0을, 아니면 1을 반환하는 연산이다
            //따라서 두 번 등장한 값에 XOR연산을 수행하면 해당 값은 0이 되므로 두 번 입력되지 않은 값만 남게 된다.
            fourthX ^= point.x;
            fourthY ^= point.y;
        }

        bw.write(fourthX + " " + fourthY);

        bw.flush();
        bw.close();
    }
}

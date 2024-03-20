import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        int[] sides = {a, b, c};
        int perimeter = 0;
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            perimeter = a + b + c;
        } else {
            perimeter = (sides[0] + sides[1]) * 2 - 1;
        }
        bw.write(Integer.toString(perimeter));

        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        ArrayList<Integer> firstArr = new ArrayList<>();
        while (first > 0) {
            firstArr.add(first % 10);
            first /= 10;
        }

        ArrayList<Integer> secondArr = new ArrayList<>();
        while (second > 0) {
            secondArr.add(second % 10);
            second /= 10;
        }

        int reverseFirst = 0;
        for (int i = 0; i < firstArr.size(); i++) {
            reverseFirst = reverseFirst * 10 + firstArr.get(i);
        }

        int reverseSecond = 0;
        for (int i = 0; i < secondArr.size(); i++) {
            reverseSecond = reverseSecond * 10 + secondArr.get(i);
        }

        if (reverseFirst > reverseSecond) {
            bw.write(String.valueOf(reverseFirst));
        } else {
            bw.write(String.valueOf(reverseSecond));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
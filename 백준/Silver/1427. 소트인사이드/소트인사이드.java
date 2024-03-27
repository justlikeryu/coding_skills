import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        
        ArrayList<Integer> arr = new ArrayList<>();

        while (N > 0) {
            arr.add(N % 10);
            N /= 10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int x : arr) {
            bw.write(String.valueOf(x));
        }

        bw.flush();
        bw.close();
    }
}
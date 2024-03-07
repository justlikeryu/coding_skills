import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        int[] cnt = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int alpha = word.charAt(i) - 'A';
            cnt[alpha]++;
        }

        int max = Integer.MIN_VALUE;
        char result = ' ';

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                result = (char) (i + 'A');
            } else if (cnt[i] == max) {
                result = '?';
            }
        }
        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }
}
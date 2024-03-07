import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        StringBuffer sb = new StringBuffer(word);
        String reverseWord = sb.reverse().toString();

        if (word.equals(reverseWord)) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
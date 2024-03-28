import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }
        br.close();

        //중복 제거
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        String[] delDuplicate = set.toArray(new String[0]);

        //길이가 짧은 단어부터
        //동일한 길이의 단어는 알파벳 순으로
        Arrays.sort(delDuplicate, (w1, w2) -> {
            return (w1.length() - w2.length()) != 0 ? w1.length() - w2.length() : w1.compareTo(w2);
        });

        for (String word : delDuplicate) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
    }
}
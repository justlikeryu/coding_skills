import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 단어 개수
        int cnt = 0; // 그룹 단어의 개수

        for (int i = 0; i < N; i++) {
            String word = br.readLine(); // 단어 입력
            if (isGroupString(word)) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.flush();
        bw.close();
    }

    // 그룹 단어 확인
    static boolean isGroupString(String str) {
        // 입력된 단어는 알파벳 소문자
        boolean[] checkStr = new boolean[26]; // boolean[]의 초기값: false

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            int prev = (i > 0) ? str.charAt(i - 1) : 0;
            // char '0' = 아스키코드 48
            // char 'A' = 아스키코드 65~90
            // char 'a' = 아스키코드 97~122
            if (checkStr[now - 'a'] == false) { // 현재 문자가 이전에 나왔는지 확인
                checkStr[now - 'a'] = true; // 처음 등장한 거라면 true로 값 저장
            } else if (now != prev) { // 현재 문자가 이미 등장했고 이전 문자와 연속되는 문자가 아니라면
                return false;
            }
        }
        return true;
    }
}

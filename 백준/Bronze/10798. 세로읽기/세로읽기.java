import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] alpha = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                alpha[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(alpha[j][i] != '\0'){//alpha[j][i]==' '로 작성하면 공백도 출력 대상으로 간주되므로.
                    bw.write(alpha[j][i]);//alpha[j][i] == '\0'는 해당 위치의 값이 초기화되지 않았거나 공백 문자가 들어간 상태를 말한다.
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
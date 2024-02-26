import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String num = br.readLine();
        br.close();

        for (int i = 0; i < N; i++) {
            sum += num.charAt(i) - '0';//0은 아스키 코드에서 48번째.
        }
        
        System.out.println(sum);
    }
}
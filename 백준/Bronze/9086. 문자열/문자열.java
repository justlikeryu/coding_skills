import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String word = br.readLine();
            
            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
        }
        br.close();
    }
}
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//도감에 수록된 포켓몬수
        int M = Integer.parseInt(st.nextToken());//맞춰야 하는 문제수

        HashMap<Integer, String> pokemonNumber = new HashMap<>();
        HashMap<String, Integer> pokemonName = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String pokemon = br.readLine().trim();
            pokemonNumber.put(i + 1, pokemon);
            pokemonName.put(pokemon, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine().trim();
            if (Character.isDigit(input.charAt(0))) {//숫자를 입력한 경우
                int number = Integer.parseInt(input);
                bw.write(pokemonNumber.get(number) + "\n");
            } else {//그외=문자를 입력한 경우
                bw.write(pokemonName.get(input) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
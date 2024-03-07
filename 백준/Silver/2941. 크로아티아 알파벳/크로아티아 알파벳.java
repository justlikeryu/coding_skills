import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] croatia =  {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatia.length; i++) {
            if(word.contains(croatia[i])){
                word = word.replace(croatia[i], "C");
            }
        }
        bw.write(String.valueOf(word.length()));

        br.close();
        bw.flush();
        bw.close();
    }
}
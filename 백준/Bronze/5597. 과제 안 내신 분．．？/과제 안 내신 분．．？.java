import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] students = new String[30];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            students[num - 1] = "attend";
        }

        for (int j = 0; j < students.length; j++) {
            if (students[j] == null) bw.write((j + 1) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
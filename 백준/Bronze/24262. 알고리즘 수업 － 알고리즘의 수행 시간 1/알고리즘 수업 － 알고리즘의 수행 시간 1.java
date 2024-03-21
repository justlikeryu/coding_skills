import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(1 + "\n");
        bw.write(String.valueOf(0));

        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = Integer.parseInt(st.nextToken());//1개
        int queen = Integer.parseInt(st.nextToken());//1개
        int rook = Integer.parseInt(st.nextToken());//2개
        int bishop = Integer.parseInt(st.nextToken());//2개
        int knight = Integer.parseInt(st.nextToken());//2개
        int pawn = Integer.parseInt(st.nextToken());//8개

        System.out.println((1 - king) + " " + (1 - queen) + " " + (2 - rook) + " " + (2 - bishop) + " " + (2 - knight) + " " + (8 - pawn));
        br.close();
    }
}
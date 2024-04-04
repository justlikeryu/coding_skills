import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());//심은 가로수

        ArrayList<Integer> trees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tree = Integer.parseInt(br.readLine());
            trees.add(tree);
        }
        br.close();

        Collections.sort(trees);

        //가로수 간 간격
        ArrayList<Integer> intervals = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            intervals.add(trees.get(i) - trees.get(i - 1));
        }

        //가로수 간격들 간 최대공약수
        int gcd = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            gcd = gcd(gcd, intervals.get(i));
        }

        //심어야 할 가로수 개수
        int addTrees = 0;
        for (int i = 0; i < intervals.size(); i++) {
            addTrees += (intervals.get(i) / gcd) - 1;
        }

        bw.write(addTrees + "");

        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {//최대공약수
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}